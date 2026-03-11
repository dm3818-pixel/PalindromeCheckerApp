// File: UseCase2PalindromeCheckerApp.java

public class UseCase2PalindromeCheckerApp {

    // main method: entry point of the application
    public static void main(String[] args) {
        // Hardcoded string literal
        String word = "madam";

        // Display the word being checked
        System.out.println("=======================================");
        System.out.println("   PalindromeChecker App - UC2 Demo    ");
        System.out.println("=======================================");
        System.out.println("Checking word: " + word);

        // Check if the word is a palindrome
        if (isPalindrome(word)) {
            System.out.println("Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is NOT a palindrome.");
        }

        System.out.println("=======================================");
        System.out.println("Program exiting...");
    }

    // Helper method to check palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}