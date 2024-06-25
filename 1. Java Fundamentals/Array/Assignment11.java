// Problem 11: Given an array of type int, print true if every element is 1 or 4.

public class Assignment11 {
    public static void main(String[] args) {
        // Initialize the integer array
        int[] arr = {1, 4, 1, 4};

        // Check if every element is either 1 or 4
        boolean result = true;
        for (int num : arr) {
            if (num != 1 && num != 4) {
                result = false;
                break;
            }
        }

        // Print the result
        System.out.println(result);
    }
}
