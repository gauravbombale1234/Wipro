//Convert character to uppercase or lowercase:
public class Assignment7 {
    public static void main(String[] args) {
        char ch = args[0].charAt(0);
        if (Character.isLowerCase(ch)) {
            System.out.println("i/p:" + ch);
            System.out.println("o/p:" + Character.toUpperCase(ch));
        } else if (Character.isUpperCase(ch)) {
            System.out.println("i/p:" + ch);
            System.out.println("o/p:" + Character.toLowerCase(ch));
        }
    }
}
