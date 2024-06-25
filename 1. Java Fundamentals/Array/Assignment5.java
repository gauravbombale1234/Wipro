// Problem 5: Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.

import java.util.Arrays;

public class Assignment5 {
    public static void main(String[] args) {
        // Initialize the integer array
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        // Sort the array
        Arrays.sort(arr);

        // Get the smallest 2 numbers
        int smallest1 = arr[0];
        int smallest2 = arr[1];

        // Get the largest 2 numbers
        int largest1 = arr[arr.length - 1];
        int largest2 = arr[arr.length - 2];

        // Print the smallest and largest numbers
        System.out.println("Smallest 2 numbers: " + smallest1 + ", " + smallest2);
        System.out.println("Largest 2 numbers: " + largest1 + ", " + largest2);
    }
}
