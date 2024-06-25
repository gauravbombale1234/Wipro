/**
 * Problem 6: Short+Long+Short
 * 
 * Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.
 * 
 * Example:
 * i/p: hi, hello
 * o/p: hihellohi
 * 
 * Class Name: Assignment6
 */

public class Assignment6 {
    public static String shortLongShort(String a, String b) {
        if (a.length() > b.length()) {
            return b + a + b;
        }
        return a + b + a;
    }

    public static void main(String[] args) {
        String a = "hi";
        String b = "hello";
        String result = shortLongShort(a, b);
        System.out.println(result);
    }
}
