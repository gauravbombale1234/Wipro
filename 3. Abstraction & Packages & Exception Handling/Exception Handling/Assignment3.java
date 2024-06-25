/**
 * Problem Statement:
 * Write a program to take care of NumberFormatException if the user enters values other than integers 
 * for calculating the average marks of 2 students. The name of the students and marks in 3 subjects 
 * are taken from the user while executing the program. In the same program, write your own exception 
 * classes to take care of negative values and values out of range (i.e., other than in the range of 0-100).
 */
import java.util.Scanner;

class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            for (int i = 0; i < 2; i++) {
                System.out.print("Enter the name of student " + (i + 1) + ": ");
                String name = scanner.nextLine();
                
                int[] marks = new int[3];
                for (int j = 0; j < 3; j++) {
                    System.out.print("Enter marks for subject " + (j + 1) + ": ");
                    String input = scanner.nextLine();
                    
                    int mark = Integer.parseInt(input);
                    if (mark < 0) {
                        throw new NegativeValueException("Marks cannot be negative.");
                    }
                    if (mark > 100) {
                        throw new OutOfRangeException("Marks should be in the range of 0-100.");
                    }
                    
                    marks[j] = mark;
                }
                
                int sum = 0;
                for (int mark : marks) {
                    sum += mark;
                }
                double average = sum / 3.0;
                
                System.out.println("Average marks for " + name + ": " + average);
            }
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred: " + e.getMessage());
        } catch (NegativeValueException e) {
            System.out.println(e.getMessage());
        } catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
