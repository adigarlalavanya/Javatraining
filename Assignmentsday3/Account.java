package com.hcltech.Assignmentsday3;

import java.util.Scanner;

public class Account {
    private double balance;

    // Constructor to initialize the balance
    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    // Method to get current balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return amount;
        } else {
            System.out.println("Deposit amount must be positive.");
            return 0;
        }
    }

    // Method to withdraw money from the account
    public double withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                return amount;
            } else {
                System.out.println("Insufficient balance.");
                return 0;
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
            return 0;
        }
    }
}
