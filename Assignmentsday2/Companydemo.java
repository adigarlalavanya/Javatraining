package com.hcltech.Assignmentsday2;

import java.util.Scanner;

public class Companydemo {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store branch offices
        BranchOffices[] branches = new BranchOffices[5];

        // Input details for the company
        System.out.println("Enter details for the company:");
        System.out.print("Company ID: ");
        int compId = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Company Name: ");
        String name = scanner.nextLine();
        System.out.print("Head Office: ");
        String HO = scanner.nextLine();
        System.out.print("CEO: ");
        String CEO = scanner.nextLine();

        // Input details for 5 branches
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for branch " + (i + 1) + ":");
            System.out.print("Branch ID: ");
            int brId = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.print("Branch Location: ");
            String location = scanner.nextLine();
            System.out.print("Department: ");
            String dept = scanner.nextLine();

            branches[i] = new BranchOffices(compId, name, HO, CEO, brId, location, dept);
        }

        // Display details of all branches
        System.out.println("\nDetails of all branches:");
        for (BranchOffices branch : branches) {
            branch.display();
            System.out.println();
        }

        scanner.close();
    }
}


