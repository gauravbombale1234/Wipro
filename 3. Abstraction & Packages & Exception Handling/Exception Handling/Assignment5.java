/**
 * Problem Statement:
 * Write a program to accept the name and age of a person from the command prompt (passed as arguments when you execute the class)
 * and ensure that the age entered is >=18 and <60. Display proper error messages. The program must exit gracefully after 
 * displaying the error message in case the arguments passed are not proper. (Hint: Create a user-defined exception class for handling errors.)
 */
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Assignment5 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide name and age as arguments.");
            return;
        }
        
        String name = args[0];
        int age;
        
        try {
            age = Integer.parseInt(args[1]);
            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Age must be >= 18 and < 60.");
            }
            System.out.println("Name: " + name + ", Age: " + age);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter a valid integer for age.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
