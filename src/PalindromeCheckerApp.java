import java.util.*;

public class PalindromeCheckerApp {

    // Stack-based palindrome
    public static boolean stackPalindrome(String input) {
        input = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) stack.push(c);
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }

    // Deque-based palindrome
    public static boolean dequePalindrome(String input) {
        input = input.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) deque.addLast(c);
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }

    // Recursive palindrome
    public static boolean recursivePalindrome(String input, int start, int end) {
        if (start >= end) return true;
        if (input.charAt(start) != input.charAt(end)) return false;
        return recursivePalindrome(input, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to test performance: ");
        String input = scanner.nextLine();
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Stack-based timing
        long startTime = System.nanoTime();
        boolean stackResult = stackPalindrome(normalized);
        long stackTime = System.nanoTime() - startTime;

        // Deque-based timing
        startTime = System.nanoTime();
        boolean dequeResult = dequePalindrome(normalized);
        long dequeTime = System.nanoTime() - startTime;

        // Recursive timing
        startTime = System.nanoTime();
        boolean recursiveResult = recursivePalindrome(normalized, 0, normalized.length() - 1);
        long recursiveTime = System.nanoTime() - startTime;

        System.out.println("\nPerformance Results (nanoseconds):");
        System.out.printf("Stack-based: %d ns → %s\n", stackTime, stackResult ? "Palindrome" : "Not Palindrome");
        System.out.printf("Deque-based: %d ns → %s\n", dequeTime, dequeResult ? "Palindrome" : "Not Palindrome");
        System.out.printf("Recursive : %d ns → %s\n", recursiveTime, recursiveResult ? "Palindrome" : "Not Palindrome");

        scanner.close();
    }
}

        boolean result = context.checkPalindrome(input);

        if (result) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        scanner.close();
    }
}
