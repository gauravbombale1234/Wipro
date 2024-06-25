/**
 * Problem 8: Remove Characters Around '*'
 * 
 * Write a Java program that accepts a string (with * in it). The program should return a new string in which the following characters are removed: 
 * the characters that are to the left and right of *.
 * 
 * Example:
 * i/p: ab*cd
 * o/p: ad
 * 
 * Class Name: Assignment8
 */

public class Assignment8 {
    public static String removeStar(String str) {
        int starIndex = str.indexOf('*');
        if (starIndex == -1 || starIndex == 0 || starIndex == str.length() - 1) {
            return str;
        }
        return str.substring(0, starIndex - 1) + str.substring(starIndex + 2);
    }

    public static void main(String[] args) {
        String input = "ab*cd";
        String result = removeStar(input);
        System.out.println(result);
    }
}
