/**
 * Problem Statement:
 * A student portal provides users to register their profile. During registration, the system needs 
 * to validate the user should be located in India. If not, the system should throw an exception.
 * Create a user-defined exception class named InvalidCountryException. Overload the respective constructors.
 * Create a main class UserRegistration with a method void registerUser(String username, String userCountry).
 * If userCountry is not equal to "India", throw an InvalidCountryException with the message "User Outside India cannot be registered".
 * If userCountry is "India", print the message "User registration done successfully".
 *
 * Example:
 * - Input: "Mickey", "US"
 * - Output: InvalidCountryException: User Outside India cannot be registered
 *
 * - Input: "Pinki", "India"
 * - Output: User registration done successfully
 */
class InvalidCountryException extends Exception {
    public InvalidCountryException(String message) {
        super(message);
    }
}

public class Assignment4 {
    public void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException("User Outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }
    
    public static void main(String[] args) {
        Assignment4 registration = new Assignment4();
        
        try {
            registration.registerUser("Mickey", "US");
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            registration.registerUser("Pinki", "India");
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }
}
