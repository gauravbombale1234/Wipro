/**
 * Problem 4: Return First Half of Even Length String
 * 
 * Write a java program that will return the first half of the string, if the length of the string is even. It should return null for odd length string.
 * 
 * Example:
 * i/p: TomCat
 * o/p: Tom
 * i/p: Apron
 * o/p: null
 * 
 * Class Name: Assignment4
 */

public class Assignment4 {
    public static String firstHalf(String str) {
        if (str.length() % 2 != 0) {
            return null;
        }
        return str.substring(0, str.length() / 2);
    }

    public static void main(String[] args) {
        String input = "TomCat";
        String result = firstHalf(input);
        System.out.println(result);

        input = "Apron";
        result = firstHalf(input);
        System.out.println(result);
    }
}
