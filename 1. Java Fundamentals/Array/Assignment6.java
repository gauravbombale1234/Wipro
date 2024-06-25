// Problem 6: Write a program to initialize an array and print them in a sorted order.

import java.util.Arrays;

public class Assignment6 {
    public static void main(String[] args) {
        // Initialize the integer array
        int[] arr = {5, 3, 1, 4, 2};

        // Sort the array
        Arrays.sort(arr);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
