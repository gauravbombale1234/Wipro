/**
 * Problem 10: N Repetitions of Last N Characters
 * 
 * Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string.
 * You may assume that n is between 0 and the length of the string, inclusive.
 * 
 * Example:
 * i/p: Wipro, 3
 * o/p: propropro
 * 
 * Class Name: Assignment10
 */

public class Assignment10 {
    public static String repeatLastN(String str, int n) {
        String lastNChars = str.substring(str.length() - n);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(lastNChars);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Wipro";
        int n = 3;
        String result = repeatLastN(input, n);
        System.out.println(result);
    }
}
