/**
 * Create a class called Employee that will inherit the Person class. The other data members of the
 * Employee class are annual salary (double), the year the employee started to work, and the national
 * insurance number which is a String. Save this in a file called Employee.java
 * Your class should have the necessary constructors and getter/setter methods.
 */

public class Employee extends Person {
    private double annualSalary;
    private int yearStarted;
    private String nationalInsuranceNumber;

    // Parameterized Constructor
    public Employee(String name, double annualSalary, int yearStarted, String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    // Getters
    public double getAnnualSalary() {
        return annualSalary;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    // Setters
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    @Override
    public String toString() {
        return "Employee [name=" + getName() + ", annualSalary=" + annualSalary + ", yearStarted=" + yearStarted 
                + ", nationalInsuranceNumber=" + nationalInsuranceNumber + "]";
    }
}
