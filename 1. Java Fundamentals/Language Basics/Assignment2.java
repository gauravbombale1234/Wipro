//Assignment 2: Single String as Command Line Argument

public class Assignment2 {
    public static void main(String[] args) {
        // Check if one argument is provided
        if (args.length != 1) {
            System.out.println("Please provide exactly one argument.");
            return;
        }
        
        // Read the command line argument
        String name = args[0];
        
        // Generate the output in the required format
        System.out.println("Welcome " + name);
    }
}
