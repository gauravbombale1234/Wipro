public class Assignment17 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter a number to check if it is a palindrome");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);
            int originalNumber = number;
            int reversedNumber = 0;
            
            while (number != 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }
            
            if (originalNumber == reversedNumber) {
                System.out.println(originalNumber + " is a palindrome");
            } else {
                System.out.println(originalNumber + " is not a palindrome");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number");
        }
    }
}
