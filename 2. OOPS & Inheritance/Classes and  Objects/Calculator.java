/**
 * Problem 2: Calculator Class
 * 
 * Create a new class called Calculator with the following methods:
 * 1. A static method called powerInt(int num1, int num2)
 *    This method should return num1 to the power num2.
 * 2. A static method called powerDouble(double num1, int num2)
 *    This method should return num1 to the power num2.
 * 3. Invoke both the methods and test the functionalities.
 * Hint: Use Math.pow(double, double) to calculate the power.
 */

class Calculator {
    // Static method to calculate power for int arguments
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    // Static method to calculate power for double and int arguments
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        // Testing the functionalities
        int resultInt = Calculator.powerInt(2, 3);
        double resultDouble = Calculator.powerDouble(2.5, 3);

        System.out.println("2 to the power of 3 (int): " + resultInt);
        System.out.println("2.5 to the power of 3 (double): " + resultDouble);
    }
}
