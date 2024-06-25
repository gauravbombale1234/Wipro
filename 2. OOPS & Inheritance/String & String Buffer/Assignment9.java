/**
 * Problem 9: Combine Characters from Two Strings
 * 
 * Given two strings, a and b, print a new string which is made of the following combination: 
 * first character of a, the first character of b, second character of a, second character of b, and so on. 
 * Any characters left, will go to the end of the result.
 * 
 * Example:
 * i/p: Hello, World
 * o/p: HWeolrllod
 * 
 * Class Name: Assignment9
 */

public class Assignment9 {
    public static String combineStrings(String a, String b) {
        StringBuilder result = new StringBuilder();
        int minLength = Math.min(a.length(), b.length());
        for (int i = 0; i < minLength; i++) {
            result.append(a.charAt(i)).append(b.charAt(i));
        }
        if (a.length() > b.length()) {
            result.append(a.substring(minLength));
        } else {
            result.append(b.substring(minLength));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        String result = combineStrings(a, b);
        System.out.println(result);
    }
}
