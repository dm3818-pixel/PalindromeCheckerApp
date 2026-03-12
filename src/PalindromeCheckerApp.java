import java.util.*;

// Strategy interface
interface PalindromeStrategy {
    boolean check(String input);
}

// Stack-based strategy
class StackStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        input = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) stack.push(c);
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}

// Deque-based strategy
class DequeStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        input = input.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) deque.addLast(c);
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }
}

// Context class for strategy
class PalindromeCheckerContext {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String input) {
        return strategy.check(input);
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeCheckerContext context = new PalindromeCheckerContext();

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        System.out.println("Choose strategy: 1-Stack, 2-Deque");
        int choice = scanner.nextInt();

        // Set strategy dynamically
        switch (choice) {
            case 1 -> context.setStrategy(new StackStrategy());
            case 2 -> context.setStrategy(new DequeStrategy());
            default -> {
                System.out.println("Invalid choice. Using StackStrategy by default.");
                context.setStrategy(new StackStrategy());
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
