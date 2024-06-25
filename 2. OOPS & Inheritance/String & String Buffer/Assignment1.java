/**
 * Problem 1: Check if a given String is Palindrome
 * 
 * Write a Program to check whether a given String is Palindrome or not.
 * 
 * Class Name: Assignment1
 */

public class Assignment1 {
    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "madam";
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
