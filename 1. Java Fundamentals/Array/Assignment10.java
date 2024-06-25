// Problem 10: Print an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers.

import java.util.Arrays;

public class Assignment10 {
    public static void main(String[] args) {
        // Initialize the integer array
        int[] arr = {1, 0, 0, 0, 1, 1};

        // Create new arrays for even and odd numbers
        int[] even = Arrays.stream(arr).filter(n -> n % 2 == 0).toArray();
        int[] odd = Arrays.stream(arr).filter(n -> n % 2 != 0).toArray();

        // Concatenate even and odd arrays
        int[] result = new int[arr.length];
        System.arraycopy(even, 0, result, 0, even.length);
        System.arraycopy(odd, 0, result, even.length, odd.length);

        // Print the rearranged array
        System.out.println("Rearranged array: " + Arrays.toString(result));
    }
}
