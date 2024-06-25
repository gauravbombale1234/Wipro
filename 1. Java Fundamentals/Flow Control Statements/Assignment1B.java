//Check if two numbers have the same last digit
public class Assignment1B {
    public static void main(String[] args) {
        
        // Example for checking last digit
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println(lastDigit(num1, num2));
    }

    public static boolean lastDigit(int a, int b) {
        return (a % 10) == (b % 10);
    }
}
