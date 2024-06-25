// Problem 12: Given 2 int arrays, a and b, each length 3, form a new array of length 2, containing their middle elements.

import java.util.Arrays;

public class Assignment12 {
    public static void main(String[] args) {
        // Initialize the integer arrays
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        // Form a new array with middle elements
        int[] result = {a[1], b[1]};

        // Print the new array
        System.out.println("New array with middle elements: " + Arrays.toString(result));
    }
}
