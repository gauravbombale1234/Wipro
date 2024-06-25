// Problem 3: Write a program to initialize an integer array with values and check if a given number is present in the array or not.

public class Assignment3 {
    public static void main(String[] args) {
        // Initialize the integer array
        int[] arr = {1, 4, 34, 56, 7};
        int searchElement = 56;  // Example element to search for

        // Check if the element is present
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                index = i;
                break;
            }
        }

        // Print the index if found, otherwise print -1
        System.out.println(index);
    }
}
