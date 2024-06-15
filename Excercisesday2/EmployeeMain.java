package com.hcltech.Excercisesday2;
class EmployeeMain {
    public static void main(String[] args) {
        String name = args[0];
        String dept = args[1];
        String desig = args[2];
        double basic = Double.parseDouble(args[3]); // Parse basic salary as double

        Employee1 x1; // Declare x1 outside the if-else block

        if (dept.equals("Mgr")) {
            x1 = new Manager1(name, dept, desig, basic);
        } else {
            x1 = new Clerk1(name, dept, desig, basic);
        }

        x1.employeeDetails(); 
        x1.calculateSalary();
    }
}
