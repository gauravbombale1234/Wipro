import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;
import com.automobile.fourwheeler.Logan;
import com.automobile.fourwheeler.Ford;

public class VehicleTest {
    public static void main(String[] args) {
        Hero hero = new Hero("Hero Model", "HR1234", "Alice", 85);
        System.out.println("Hero Model: " + hero.getModelName());
        System.out.println("Registration Number: " + hero.getRegistrationNumber());
        System.out.println("Owner Name: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed());
        hero.radio();
        
        Honda honda = new Honda("Honda Model", "HN5678", "Bob", 90);
        System.out.println("\nHonda Model: " + honda.getModelName());
        System.out.println("Registration Number: " + honda.getRegistrationNumber());
        System.out.println("Owner Name: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed());
        honda.cdplayer();
        
        Logan logan = new Logan("Logan Model", "LG9101", "Charlie", 100);
        System.out.println("\nLogan Model: " + logan.getModelName());
        System.out.println("Registration Number: " + logan.getRegistrationNumber());
        System.out.println("Owner Name: " + logan.getOwnerName());
        System.out.println("Speed: " + logan.speed());
        logan.gps();
        
        Ford ford = new Ford("Ford Model", "FD1213", "David", 110);
        System.out.println("\nFord Model: " + ford.getModelName());
        System.out.println("Registration Number: " + ford.getRegistrationNumber());
        System.out.println("Owner Name: " + ford.getOwnerName());
        System.out.println("Speed: " + ford.speed());
        ford.tempControl();
    }
}
