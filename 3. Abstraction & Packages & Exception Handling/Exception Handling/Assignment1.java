/**
 * Problem Statement:
 * Write a program that takes as input the size of the array and the elements in the array. 
 * The program then asks the user to enter a particular index and prints the element at that index. 
 * Index starts from zero. This program may generate ArrayIndexOutOfBoundsException or NumberFormatException.
 * Use exception handling mechanisms to handle this exception.
 *
 * Sample Input and Output:
 * 1. Enter the number of elements in the array: 2
 *    Enter the elements in the array: 50, 80
 *    Enter the index of the array element you want to access: 1
 *    The array element at index 1 = 80
 *    The array element successfully accessed
 *
 * 2. Enter the number of elements in the array: 2
 *    Enter the elements in the array: 50, 80
 *    Enter the index of the array element you want to access: 9
 *    java.lang.ArrayIndexOutOfBoundsException
 *
 * 3. Enter the number of elements in the array: 2
 *    Enter the elements in the array: 30, 80
 *    Enter the index of the array element you want to access: j
 *    java.lang.NumberFormatException
 */
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the number of elements in the array: ");
            int size = Integer.parseInt(scanner.nextLine());
            
            int[] array = new int[size];
            
            System.out.println("Enter the elements in the array:");
            for (int i = 0; i < size; i++) {
                array[i] = Integer.parseInt(scanner.nextLine());
            }
            
            System.out.print("Enter the index of the array element you want to access: ");
            int index = Integer.parseInt(scanner.nextLine());
            
            System.out.println("The array element at index " + index + " = " + array[index]);
            System.out.println("The array element successfully accessed");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException");
        } finally {
            scanner.close();
        }
    }
}
