package com.hcltech.Assignmentsday2;
import java.util.Scanner;

public class Employeedemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store employees
        Employee[] employees = new Employee[5];
        // Array to store managers
        Manager[] managers = new Manager[2];

        // Input details for 5 employees
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            employees[i] = getEmployeeDetails(scanner);
        }

        // Input details for 2 managers
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter details for manager " + (i + 1) + ":");
            managers[i] = getManagerDetails(scanner);
        }

        // Display details of all employees
        System.out.println("\nDetails of all employees:");
        for (Employee employee : employees) {
            employee.display();
            System.out.println();
        }

        // Display details of all managers
        System.out.println("Details of all managers:");
        for (Manager manager : managers) {
            manager.display();
            System.out.println();
        }

        scanner.close();
    }

    private static Employee getEmployeeDetails(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Employee Number: ");
                String empNoStr = scanner.nextLine();
                int empNo = Integer.parseInt(empNoStr);

                System.out.print("Name: ");
                String eName = scanner.nextLine();
                if (!eName.matches("[a-zA-Z ]+")) {
                    throw new IllegalArgumentException("Name must contain only alphabetic characters.");
                }

                System.out.print("Address: ");
                String address = scanner.nextLine();

                System.out.print("Contact Number (10 digits): ");
                String contactNo = scanner.nextLine();
                if (!contactNo.matches("\\d{10}")) {
                    throw new IllegalArgumentException("Contact Number must be exactly 10 digits.");
                }

                return new Employee(empNo, eName, address, contactNo);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please enter the details again.\n");
            }
        }
    }

    private static Manager getManagerDetails(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Employee Number: ");
                String empNoStr = scanner.nextLine();
                int empNo = Integer.parseInt(empNoStr);

                System.out.print("Name: ");
                String eName = scanner.nextLine();
                if (!eName.matches("[a-zA-Z ]+")) {
                    throw new IllegalArgumentException("Name must contain only alphabetic characters.");
                }

                System.out.print("Address: ");
                String address = scanner.nextLine();

                System.out.print("Contact Number (10 digits): ");
                String contactNo = scanner.nextLine();
                if (!contactNo.matches("\\d{10}")) {
                    throw new IllegalArgumentException("Contact Number must be exactly 10 digits.");
                }

                System.out.print("Department: ");
                String dept = scanner.nextLine();

                System.out.print("Number of Reportees: ");
                String numberOfReporteesStr = scanner.nextLine();
                int numberOfReportees = Integer.parseInt(numberOfReporteesStr);

                return new Manager(empNo, eName, address, contactNo, dept, numberOfReportees);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please enter the details again.\n");
            }
        }
    }
}
