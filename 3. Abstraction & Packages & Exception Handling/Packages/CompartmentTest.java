import com.wipro.automobile.ship.Compartment;

public class CompartmentTest {
    public static void main(String[] args) {
        Compartment compartment = new Compartment(10, 20, 30);
        System.out.println(compartment);
        System.out.println("Volume: " + compartment.getVolume());
        
        compartment.setHeight(15);
        compartment.setWidth(25);
        compartment.setBreadth(35);
        
        System.out.println("Updated Compartment: " + compartment);
        System.out.println("Updated Volume: " + compartment.getVolume());
    }
}
