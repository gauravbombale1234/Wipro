/**
 * Problem 1: Box Class
 * 
 * Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.
 * The dimensions of the Box are width, height, and depth. The class should have a method that can return the
 * volume of the box. Create an object of the Box class and test the functionalities.
 */

 class Box {
    private double width;
    private double height;
    private double depth;

    // Parameterized constructor
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate the volume of the box
    public double getVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        // Creating an object of the Box class
        Box box = new Box(10, 20, 30);
        // Testing the functionalities
        System.out.println("Volume of the box: " + box.getVolume());
    }
}
