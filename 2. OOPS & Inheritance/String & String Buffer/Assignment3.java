/**
 * Problem 3: N Copies of First 2 Characters
 * 
 * Given a string, return a new string made of 'n' copies of the first 2 chars of the original string where 'n' is the length of the string.
 * 
 * Example:
 * i/p: Wipro
 * o/p: Wiwiwiwiwi
 * 
 * Class Name: Assignment3
 */

public class Assignment3 {
    public static String nCopies(String str) {
        if (str.length() < 2) {
            return "";
        }
        String firstTwo = str.substring(0, 2);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.append(firstTwo);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Wipro";
        String result = nCopies(input);
        System.out.println(result);
    }
}
