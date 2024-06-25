/**
 * Problem Statement:
 * Write a class MathOperation which accepts 5 integers through the command line.
 * Create an array using these parameters. Loop through the array and obtain the sum and average
 * of all the elements and display the result. Various exceptions that may arise like ArithmeticException,
 * NumberFormatException, and so on should be handled.
 */
public class Assignment2 {
    public static void main(String[] args) {
        try {
            if (args.length != 5) {
                throw new IllegalArgumentException("Exactly 5 integers are required.");
            }
            
            int[] numbers = new int[5];
            int sum = 0;
            
            for (int i = 0; i < 5; i++) {
                numbers[i] = Integer.parseInt(args[i]);
                sum += numbers[i];
            }
            
            double average = sum / 5.0;
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException occurred: " + e.getMessage());
        }
    }
}
