/**
 * Problem 5: Remove First and Last Character
 * 
 * Write a java program that accepts a string and returns a new string without the first and last character of the input string.
 * 
 * Example:
 * i/p: Suman
 * o/p: uma
 * 
 * Class Name: Assignment5
 */

public class Assignment5 {
    public static String removeFirstAndLast(String str) {
        if (str.length() <= 2) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {
        String input = "Suman";
        String result = removeFirstAndLast(input);
        System.out.println(result);
    }
}
