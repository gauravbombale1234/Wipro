// Problem 8: Write a program to print the sum of the elements of an array following the given condition.

public class Assignment8 {
    public static void main(String[] args) {
        // Initialize the integer array
        int[] arr = {10, 3, 6, 1, 2, 7, 9};

        // Calculate the sum considering the condition
        int sum = 0;
        boolean skip = false;
        for (int num : arr) {
            if (num == 6) {
                skip = true;
            }
            if (!skip) {
                sum += num;
            }
            if (num == 7) {
                skip = false;
            }
        }

        // Print the sum
        System.out.println("Sum: " + sum);
    }
}
