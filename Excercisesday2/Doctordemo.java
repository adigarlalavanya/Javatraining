package com.hcltech.Excercisesday2;

import java.util.Scanner;

public class Doctordemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Doctor 1:");
        Doctor doctor1 = createDoctor(scanner);

        System.out.println("\nEnter details for Doctor 2:");
        Doctor doctor2 = createDoctor(scanner);

        // Displaying Doctor details
        System.out.println("\nDoctor 1 Details:");
        System.out.println(doctor1);

        System.out.println("Doctor 2 Details:");
        System.out.println(doctor2);

        // Testing accessor methods
        System.out.println("\nDoctor 1 Specialty: " + doctor1.getSpecialty());
        System.out.println("Doctor 2 Office Visit Fee: " + doctor2.getOfficeVisitFee());

        // Testing mutator methods
        doctor1.setSpecialty("General Practitioner");
        doctor1.setOfficeVisitFee(100.0);

        // Testing equals method
        Doctor doctor3 = new Doctor("Lavanya", 120000, "General Practitioner", 100.0);
        System.out.println("Doctor 1 equals Doctor 3: " + doctor1.equals(doctor3));

        scanner.close();
    }
    private static Doctor createDoctor(Scanner scanner) {
        String name = "";
        while (true) {
            System.out.print("Name: ");
            name = scanner.nextLine().trim();  // Trim whitespace from the input

            // Check if the name contains only alphabetic characters
            if (name.matches("[a-zA-Z]+")) {
                break;  // Exit loop if the name is valid
            } else {
                System.out.println("Invalid input. Name must contain only alphabetic characters.");
            }
        }

        double salary = 0;
        while (true) {
            System.out.print("Salary: ");
            try {
                salary = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value for salary.");
            }
        }

        System.out.print("Specialty: ");
        String specialty = scanner.nextLine();

        double officeVisitFee = 0;
        while (true) {
            System.out.print("Office Visit Fee: ");
            try {
                officeVisitFee = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value for office visit fee.");
            }
        }

        return new Doctor(name, salary, specialty, officeVisitFee);
    }
}
