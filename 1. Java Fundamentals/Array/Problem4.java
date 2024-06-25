// Problem 4: Initialize an integer array with ASCII values and print the corresponding character values in a single row.

public class Problem4 {
    public static void main(String[] args) {
        // Initialize the integer array with ASCII values
        int[] asciiValues = {65, 66, 67, 68};

        // Print the corresponding character values
        for (int ascii : asciiValues) {
            System.out.print((char) ascii + " ");
        }
    }
}
