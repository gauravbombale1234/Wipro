// Problem 9: Print a version of the given array where all the 10's have been removed.

import java.util.Arrays;

public class Assignment9 {
    public static void main(String[] args) {
        // Initialize the integer array
        int[] arr = {1, 10, 10, 2};

        // Create a new array without 10's
        int[] result = new int[arr.length];
        int index = 0;
        for (int num : arr) {
            if (num != 10) {
                result[index++] = num;
            }
        }

        // Print the modified array
        System.out.println("Array after removing 10's: " + Arrays.toString(result));
    }
}
