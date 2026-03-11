// File: UseCase4PalindromeCheckerApp.java

public class UseCase4PalindromeCheckerApp {

    // main method: entry point of the application
    public static void main(String[] args) {
        // Hardcoded string literal
        String word = "madam";

        // Display the word being checked
        System.out.println("=======================================");
        System.out.println("   PalindromeChecker App - UC4 Demo    ");
        System.out.println("=======================================");
        System.out.println("Checking word: " + word);

        // Convert string to character array
        char[] charArray = word.toCharArray();

        // Two-pointer approach
        int left = 0;
        int right = charArray.length - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is NOT a palindrome.");
        }

        System.out.println("=======================================");
        System.out.println("Program exiting...");
    }
}