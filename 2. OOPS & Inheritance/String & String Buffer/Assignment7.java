/**
 * Problem 7: Remove 'x' from Start and End
 * 
 * Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged.
 * 
 * Example:
 * i/p: xHix
 * o/p: Hi
 * i/p: America
 * o/p: America
 * 
 * Class Name: Assignment7
 */

public class Assignment7 {
    public static String removeX(String str) {
        if (str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }
        if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    public static void main(String[] args) {
        String input = "xHix";
        String result = removeX(input);
        System.out.println(result);

        input = "America";
        result = removeX(input);
        System.out.println(result);
    }
}
