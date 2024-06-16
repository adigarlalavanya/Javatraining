package com.hcltech.Excercisesday3;

import java.util.Scanner;

public class Employeedemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int id = 0;
        String name = null;
        String designation = null;
        double salary = 0;
        boolean isValidId = false;
        while (!isValidId) {
            try {
                System.out.print("Enter Employee ID: ");
                id = Integer.parseInt(scanner.nextLine());
                isValidId = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer for Employee ID.");
            }
        }
        boolean isValidName = false;
        while (!isValidName) {
            try {
                System.out.print("Enter Employee Name:");
                name = scanner.nextLine().trim();
                if (!isValidAlphabetic(name)) {
                    throw new IllegalArgumentException("Invalid input! Please enter alphabetic characters only.");
                }
                isValidName = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        boolean isValidDesignation = false;
        while (!isValidDesignation) {
            try {
                System.out.print("Enter Designation: ");
                designation = scanner.nextLine().trim();
                if (designation.isEmpty()) {
                    throw new IllegalArgumentException("Designation cannot be empty.");
                }
                isValidDesignation = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        boolean isValidSalary = false;
        while (!isValidSalary) {
            try {
                System.out.print("Enter Salary: ");
                salary = Double.parseDouble(scanner.nextLine());
                if (salary <= 0) {
                    throw new IllegalArgumentException("Salary must be a numeric value greater than zero.");
                }
                isValidSalary = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input! Please enter a valid numeric value greater than zero.");
            }
        }

        // Create Employee object
        Employee emp = new Employee(id, name, designation, salary);

        // Display employee details
        System.out.println("\nEmployee Details:");
        emp.displayInfo();

        scanner.close();
    }

    // Method to validate alphabetic input
    private static boolean isValidAlphabetic(String input) {
        return input.matches("[a-zA-Z ]+");
    }
}
