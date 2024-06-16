package com.hcltech.Assignmentsday3;

public class Vehicle {
    private String regNo;
    private String brand;
    private double price;
    private double mileage;

    // Constructor to initialize the vehicle attributes
    public Vehicle(String regNo, String brand, double price, double mileage) {
        this.regNo = regNo;
        this.brand = brand;
        this.price = price;
        this.mileage = mileage;
    }

    // Method to display details of the vehicle
    public void displayDetails() {
        System.out.println("Registration No: " + regNo);
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
        System.out.println("Mileage: " + mileage + " km/l");
        System.out.println();
    }

    // Method to return only the price of the vehicle
    public double getPrice() {
        return price;
    }

    // Method to return the mileage of the vehicle
    public double getMileage() {
        return mileage;
    }
}

