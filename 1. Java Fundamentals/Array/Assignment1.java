// Problem 1: Write a program to initialize an integer array and print the sum and average of the array.

public class Assignment1 {
    public static void main(String[] args) {
        // Initialize the integer array
        int[] arr = {1, 2, 3, 4, 5};

        // Calculate the sum and average
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / arr.length;

        // Print the sum and average
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
