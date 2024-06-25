//Reverse a given number and print
public class Assignment16 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter a number to reverse");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);
            int reversedNumber = 0;
            
            while (number != 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }
            
            System.out.println("Reversed Number: " + reversedNumber);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number");
        }
    }
}
