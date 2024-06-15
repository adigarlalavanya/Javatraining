package com.hcltech.Assignmentsday2;

import java.util.Scanner;

// Class to store basic account holder information
class AccountHolder {
    protected String acNo;
    protected String name;
    protected String contactNo;

    // Constructor to initialize AccountHolder details
    public AccountHolder(String acNo, String name, String contactNo) {
        this.acNo = acNo;
        this.name = name;
        this.contactNo = contactNo;
    }

    // Method to display AccountHolder details
    public void display() {
        System.out.println("Account Number: " + acNo);
        System.out.println("Name: " + name);
        System.out.println("Contact Number: " + contactNo);
    }
}

// Class to store detailed account information, inherits from AccountHolder
class AccountDetails extends AccountHolder {
    private String acType;
    private double bal;

    // Constructor to initialize AccountDetails along with AccountHolder details
    public AccountDetails(String acNo, String name, String contactNo, String acType, double bal) {
        super(validateAcNo(acNo), validateName(name), validateContactNo(contactNo));
        this.acType = acType;
        this.bal = bal;
    }

    // Overridden method to display AccountDetails along with AccountHolder details
    @Override
    public void display() {
        super.display();
        System.out.println("Account Type: " + acType);
        System.out.println("Balance: " + bal);
    }

    // Validation methods
    private static String validateAcNo(String acNo) {
        if (acNo.matches("\\d{11}")) {
            return acNo;
        } else {
            throw new IllegalArgumentException("Account Number must be exactly 11 digits.");
        }
    }

    private static String validateContactNo(String contactNo) {
        if (contactNo.matches("\\d{10}")) {
            return contactNo;
        } else {
            throw new IllegalArgumentException("Contact Number must be exactly 10 digits.");
        }
    }

    private static String validateName(String name) {
        if (name.matches("[a-zA-Z ]+")) {
            return name;
        } else {
            throw new IllegalArgumentException("Name must contain only alphabetic characters.");
        }
    }
}

