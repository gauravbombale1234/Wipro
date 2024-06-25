// Problem Statement: Abstract Classes
// Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this class.
// public abstract String notice();
// Derive FirstClass, Ladies, General, Luggage classes from the compartment class. Override the notice function in each of them to print notice message that is suitable to the specific type of compartment.
// Create a class TestCompartment. Write main function to do the following:
// - Declare an array of Compartment of size 10.
// - Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
// - Check the polymorphic behavior of the notice method.
// [i.e based on the random number generated, the first compartment can be Luggage, the second one could be Ladies and so on..]

import java.util.Random;

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "Notice: This is a First Class compartment.";
    }
}

class Ladies extends Compartment {
    @Override
    public String notice() {
        return "Notice: This is a Ladies compartment.";
    }
}

class General extends Compartment {
    @Override
    public String notice() {
        return "Notice: This is a General compartment.";
    }
}

class Luggage extends Compartment {
    @Override
    public String notice() {
        return "Notice: This is a Luggage compartment.";
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random rand = new Random();
        
        for (int i = 0; i < compartments.length; i++) {
            int randomNum = rand.nextInt(4) + 1; // Generates a random number between 1 and 4
            switch (randomNum) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }
        
        for (Compartment compartment : compartments) {
            System.out.println(compartment.notice());
        }
    }
}
