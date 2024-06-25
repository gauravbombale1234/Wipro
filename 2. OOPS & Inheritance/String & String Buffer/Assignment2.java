/**
 * Problem 2: Concatenate Two Strings
 * 
 * Write a java program that will concatenate 2 strings and return the result. The result should be in lowercase.
 * Note: If the concatenation creates a double-char, then one of the characters need to be omitted.
 * 
 * Example:
 * i/p: Sachin, Tendulkar
 * o/p: sachintendulkar
 * 
 * Class Name: Assignment2
 */

public class Assignment2 {
    public static String concatenateStrings(String str1, String str2) {
        String result = str1 + " " + str2;
        result = result.toLowerCase();
        return result.replaceAll("(.)\\1", "$1");
    }

    public static void main(String[] args) {
        String str1 = "Sachin";
        String str2 = "Tendulkar";
        String result = concatenateStrings(str1, str2);
        System.out.println(result);
    }
}
