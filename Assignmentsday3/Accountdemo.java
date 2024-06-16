package com.hcltech.Assignmentsday3;

import java.util.Scanner;

public class Accountdemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter initial balance for account 1
        System.out.print("Enter initial balance for Account 1: ");
        double initialBalance1 = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character after nextDouble()

        // Create Account 1 object
        Account account1 = new Account(initialBalance1);

        // Prompt user to enter initial balance for account 2
        System.out.print("Enter initial balance for Account 2: ");
        double initialBalance2 = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character after nextDouble()

        // Create Account 2 object
        Account account2 = new Account(initialBalance2);

        // Display initial balances of both accounts
        System.out.println("\nInitial Balances:");
        System.out.println("Account 1: $" + account1.getBalance());
        System.out.println("Account 2: $" + account2.getBalance());

        // Perform operations on Account 1
        System.out.print("\nEnter amount to deposit into Account 1: ");
        double depositAmount1 = scanner.nextDouble();
        account1.deposit(depositAmount1);
        System.out.println("New balance in Account 1: $" + account1.getBalance());

        System.out.print("Enter amount to withdraw from Account 1: ");
        double withdrawAmount1 = scanner.nextDouble();
        account1.withdraw(withdrawAmount1);
        System.out.println("New balance in Account 1: $" + account1.getBalance());

        // Perform operations on Account 2
        System.out.print("\nEnter amount to deposit into Account 2: ");
        double depositAmount2 = scanner.nextDouble();
        account2.deposit(depositAmount2);
        System.out.println("New balance in Account 2: $" + account2.getBalance());

        System.out.print("Enter amount to withdraw from Account 2: ");
        double withdrawAmount2 = scanner.nextDouble();
        account2.withdraw(withdrawAmount2);
        System.out.println("New balance in Account 2: $" + account2.getBalance());

        scanner.close();
    }
}
