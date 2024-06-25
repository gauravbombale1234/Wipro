import test.Foundation;

public class AccessTest {
    public static void main(String[] args) {
        Foundation foundation = new Foundation();
        
        // var1 is private and cannot be accessed directly
        // System.out.println(foundation.var1); // This will cause an error
        
        // var2 has default access, and cannot be accessed outside its package
        // System.out.println(foundation.var2); // This will cause an error
        
        // var3 is protected, and cannot be accessed outside its package without inheritance
        // System.out.println(foundation.var3); // This will cause an error
        
        // var4 is public and can be accessed from anywhere
        System.out.println("var4: " + foundation.var4);

        // Accessing var1 using a public method
        System.out.println("var1 (via getter): " + foundation.getVar1());
    }
}
