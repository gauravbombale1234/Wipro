// Problem 13: Write a program to reverse the elements of a given 2*2 array. Four integer numbers need to be passed as Command Line arguments.

public class Assignment13 {
    public static void main(String[] args) {
        // Check if the correct number of arguments are passed
        if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers");
            return;
        }

        // Initialize the 2x2 array
        int[][] array = {
            {Integer.parseInt(args[0]), Integer.parseInt(args[1])},
            {Integer.parseInt(args[2]), Integer.parseInt(args[3])}
        };

        // Print the original array
        System.out.println("The given array is : ");
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Reverse the array elements
        int temp = array[0][0];
        array[0][0] = array[1][1];
        array[1][1] = temp;
        temp = array[0][1];
        array[0][1] = array[1][0];
        array[1][0] = temp;

        // Print the reversed array
        System.out.println("The reverse of the array is : ");
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
