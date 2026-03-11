// File: UseCase3PalindromeCheckerApp.java

public class UseCase3PalindromeCheckerApp {

    // main method: entry point of the application
    public static void main(String[] args) {
        // Hardcoded string literal
        String word = "madam";

        // Display the word being checked
        System.out.println("=======================================");
        System.out.println("   PalindromeChecker App - UC3 Demo    ");
        System.out.println("=======================================");
        System.out.println("Checking word: " + word);

        // Reverse the string using a loop
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i); // string concatenation
        }

        // Compare original and reversed using equals()
        if (word.equals(reversed)) {
            System.out.println("Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is NOT a palindrome.");
        }

        System.out.println("=======================================");
        System.out.println("Program exiting...");
    }
}