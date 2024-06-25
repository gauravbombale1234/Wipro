// Problem 14: Write a program to find the biggest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.

public class Assignment14 {
    public static void main(String[] args) {
        // Check if the correct number of arguments are passed
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            return;
        }

        // Initialize the 3x3 array
        int[][] array = new int[3][3];
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = Integer.parseInt(args[index++]);
            }
        }

        // Find the biggest number
        int max = array[0][0];
        for (int[] row : array) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }

        // Print the array and the biggest number
        System.out.println("The given array is : ");
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("The biggest number in the given array is " + max);
    }
}
