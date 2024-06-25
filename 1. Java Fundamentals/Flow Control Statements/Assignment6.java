//Program to accept gender and age to print the percentage of interest:
public class Assignment6 {
    public static void main(String[] args) {
        String gender = args[0];
        int age = Integer.parseInt(args[1]);
        double interest = 0.0;

        if (gender.equalsIgnoreCase("Female")) {
            if (age >= 1 && age <= 58) {
                interest = 8.2;
            } else if (age >= 59 && age <= 100) {
                interest = 9.2;
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            if (age >= 1 && age <= 58) {
                interest = 8.4;
            } else if (age >= 59 && age <= 100) {
                interest = 10.5;
            }
        }

        System.out.println("Interest: " + interest + "%");
    }
}
