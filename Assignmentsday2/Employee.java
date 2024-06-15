package com.hcltech.Assignmentsday2;

import java.util.Scanner;

// Class to store basic employee information
class Employee {
    protected int empNo;
    protected String eName;
    protected String address;
    protected String contactNo;

    // Constructor to initialize Employee details
    public Employee(int empNo, String eName, String address, String contactNo) {
        this.empNo = empNo;
        this.eName = eName;
        this.address = address;
        this.contactNo = contactNo;
    }

    // Method to display Employee details
    public void display() {
        System.out.println("Employee Number: " + empNo);
        System.out.println("Name: " + eName);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNo);
    }
}

// Class to store manager details, inherits from Employee
class Manager extends Employee {
    private String dept;
    private int numberOfReportees;

    // Constructor to initialize Manager details along with Employee details
    public Manager(int empNo, String eName, String address, String contactNo, String dept, int numberOfReportees) {
        super(empNo, eName, address, contactNo);
        this.dept = dept;
        this.numberOfReportees = numberOfReportees;
    }

    // Overridden method to display Manager details along with Employee details
    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + dept);
        System.out.println("Number of Reportees: " + numberOfReportees);
    }
}

