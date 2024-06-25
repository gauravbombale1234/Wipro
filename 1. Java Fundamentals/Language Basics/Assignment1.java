// Assignment 1: Two Strings as Command Line Arguments

public class Assignment1 {
    public static void main(String[] args) {
        // Check if two arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide exactly two arguments.");
            return;
        }
        
        // Read the command line arguments
        String company = args[0];
        String city = args[1];
        
        // Generate the output in the required format
        System.out.println(company + " Technologies " + city + ".");
    }
}
