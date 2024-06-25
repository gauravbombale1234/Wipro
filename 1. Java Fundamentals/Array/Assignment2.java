// Problem 2: Write a program to initialize an integer array and find the maximum and minimum value of the array.

public class Assignment2 {
    public static void main(String[] args) {
        // Initialize the integer array
        int[] arr = {1, 2, 3, 4, 5};

        // Find the maximum and minimum values
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        // Print the maximum and minimum values
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
