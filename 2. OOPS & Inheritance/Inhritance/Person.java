/**
 * Problem 2: Person and Employee Classes
 * 
 * Create a class called Person with a member variable name. Save it in a file called Person.java
 */

public class Person {
    private String name;

    // Parameterized Constructor
    public Person(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }
}
