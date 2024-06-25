/**
 * Problem 1: Fruit Class with Overriding in Apple and Orange Classes
 * 
 * Create a base class Fruit with name, taste and size as its attributes.
 * Create a method called eat() which describes the name of the fruit and its taste.
 * Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.
 * Topics covered: Inheritance / Overriding
 */

class Fruit {
    String name;
    String taste;
    String size;

    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println("Fruit: " + name + ", Taste: " + taste);
    }
}

class Apple extends Fruit {
    public Apple() {
        super("Apple", "Sweet", "Medium");
    }

    @Override
    public void eat() {
        System.out.println("Apple is sweet and crisp.");
    }
}

class Orange extends Fruit {
    public Orange() {
        super("Orange", "Citrus", "Small");
    }

    @Override
    public void eat() {
        System.out.println("Orange is tangy and juicy.");
    }

    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit orange = new Orange();

        apple.eat();
        orange.eat();
    }
}
