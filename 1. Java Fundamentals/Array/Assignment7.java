// Problem 7: Write a program to remove the duplicate elements in an array and print the same.

import java.util.Arrays;
import java.util.HashSet;

public class Assignment7 {
    public static void main(String[] args) {
        // Initialize the integer array
        int[] arr = {12, 34, 12, 45, 67, 89};

        // Remove duplicates using a HashSet
        HashSet<Integer> uniqueElements = new HashSet<>();
        for (int num : arr) {
            uniqueElements.add(num);
        }

        // Convert back to array and print the unique elements
        Integer[] uniqueArray = uniqueElements.toArray(new Integer[0]);
        System.out.println("Array with unique elements: " + Arrays.toString(uniqueArray));
    }
}
