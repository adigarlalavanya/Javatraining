package com.hcltech.Assignmentsday2;
import java.util.Scanner;

public class Accountdemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input details for first account holder
        AccountDetails a1 = getAccountDetails(scanner, "first");

        // Input details for second account holder
        AccountDetails a2 = getAccountDetails(scanner, "second");

        // Displaying account holder details
        System.out.println("\nDetails of first account holder:");
        a1.display();

        System.out.println("\nDetails of second account holder:");
        a2.display();

        scanner.close();
    }

    private static AccountDetails getAccountDetails(Scanner scanner, String holderNumber) {
        while (true) {
            try {
                System.out.println("Enter details for " + holderNumber + " account holder:");
                System.out.print("Account Number (11 digits): ");
                String acNo = scanner.nextLine();
                if (!acNo.matches("\\d{11}")) {
                    throw new IllegalArgumentException("Account Number must be exactly 11 digits.");
                }
                System.out.print("Name: ");
                String name = scanner.nextLine();
                if (!name.matches("[a-zA-Z ]+")) {
                    throw new IllegalArgumentException("Name must contain only alphabetic characters.");
                }
                System.out.print("Contact Number (10 digits): ");
                String contactNo = scanner.nextLine();
                if (!contactNo.matches("\\d{10}")) {
                    throw new IllegalArgumentException("Contact Number must be exactly 10 digits.");
                }
                System.out.print("Account Type (SB, FD, CR): ");
                String acType = scanner.nextLine();
                
                System.out.print("Balance: ");
                String balanceInput = scanner.nextLine();
                if (!balanceInput.matches("\\d+(\\.\\d+)?")) {
                    throw new IllegalArgumentException("Balance must be a numeric value.");
                }
                double bal = Double.parseDouble(balanceInput);

                return new AccountDetails(acNo, name, contactNo, acType, bal);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please enter the details again.\n");
            }
        }
    }
}
