// Java Fundamentals
//Project1 : Employee Information - Input & Display

public class Project1 {
    
    // Employee class to store employee details
    static class Employee {
        int empNo;
        String empName;
        String joinDate;
        char designationCode;
        String department;
        int basic;
        int hra;
        int it;

        Employee(int empNo, String empName, String joinDate, char designationCode, String department, int basic, int hra, int it) {
            this.empNo = empNo;
            this.empName = empName;
            this.joinDate = joinDate;
            this.designationCode = designationCode;
            this.department = department;
            this.basic = basic;
            this.hra = hra;
            this.it = it;
        }
    }
    
    // Method to get DA based on designation code
    public static int getDA(char designationCode) {
        switch (designationCode) {
            case 'e': return 20000;
            case 'c': return 32000;
            case 'k': return 12000;
            case 'r': return 15000;
            case 'm': return 40000;
            default: return 0;
        }
    }

    // Method to get Designation based on designation code
    public static String getDesignation(char designationCode) {
        switch (designationCode) {
            case 'e': return "Engineer";
            case 'c': return "Consultant";
            case 'k': return "Clerk";
            case 'r': return "Receptionist";
            case 'm': return "Manager";
            default: return "";
        }
    }

    public static void main(String[] args) {
        // Array of employees
        Employee[] employees = {
            new Employee(1001, "Ashish", "01/04/2009", 'e', "R&D", 20000, 8000, 3000),
            new Employee(1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000),
            new Employee(1003, "Rahul", "12/11/2008", 'k', "Acct", 10000, 8000, 1000),
            new Employee(1004, "Chahat", "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000),
            new Employee(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 20000, 20000),
            new Employee(1006, "Suman", "01/01/2000", 'e', "Manufacturing", 23000, 9000, 4400),
            new Employee(1007, "Tanmoy", "12/06/2006", 'c', "PM", 29000, 12000, 10000)
        };
        
        // Check if an argument is provided
        if (args.length == 0) {
            System.out.println("Please provide an employee ID as a command line argument.");
            return;
        }
        
        // Parse the provided employee ID
        int empId = Integer.parseInt(args[0]);
        
        // Find the employee with the given ID
        Employee foundEmployee = null;
        for (Employee emp : employees) {
            if (emp.empNo == empId) {
                foundEmployee = emp;
                break;
            }
        }

        // Print the employee details or an error message
        if (foundEmployee != null) {
            int da = getDA(foundEmployee.designationCode);
            int salary = foundEmployee.basic + foundEmployee.hra + da - foundEmployee.it;
            String designation = getDesignation(foundEmployee.designationCode);
            
            // Printing the header
            System.out.printf("%-8s %-10s %-12s %-12s %-8s%n", "Emp No.", "Emp Name", "Department", "Designation", "Salary");
            
            // Printing the employee details
            System.out.printf("%-8d %-10s %-12s %-12s %-8d%n", 
                              foundEmployee.empNo, foundEmployee.empName, foundEmployee.department, designation, salary);
        } else {
            System.out.println("There is no employee with empid : " + empId);
        }
    }
}
