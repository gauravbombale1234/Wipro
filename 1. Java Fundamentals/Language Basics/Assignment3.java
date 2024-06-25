// Assignment 3: Two Integers as Command Line Arguments

public class Assignment3 {
    public static void main(String[] args) {
        // Check if two arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide exactly two arguments.");
            return;
        }
        
        // Read the command line arguments and parse them as integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        
        // Calculate the sum
        int sum = num1 + num2;
        
        // Generate the output in the required format
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}
