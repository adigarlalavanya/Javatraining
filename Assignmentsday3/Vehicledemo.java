package com.hcltech.Assignmentsday3;

import java.util.Scanner;

public class Vehicledemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input details for Vehicle 1
        System.out.println("Enter details for Vehicle 1:");
        System.out.print("Registration No: ");
        String regNo1 = scanner.nextLine();
        System.out.print("Brand: ");
        String brand1 = scanner.nextLine();
        System.out.print("Price: ");
        double price1 = scanner.nextDouble();
        System.out.print("Mileage: ");
        double mileage1 = scanner.nextDouble();
        scanner.nextLine();

        // Create Vehicle 1 object
        Vehicle vehicle1 = new Vehicle(regNo1, brand1, price1, mileage1);

        // Input details for Vehicle 2
        System.out.println("\nEnter details for Vehicle 2:");
        System.out.print("Registration No: ");
        String regNo2 = scanner.nextLine();
        System.out.print("Brand: ");
        String brand2 = scanner.nextLine();
        System.out.print("Price: ");
        double price2 = scanner.nextDouble();
        System.out.print("Mileage: ");
        double mileage2 = scanner.nextDouble();
        scanner.nextLine(); // Consume newline after nextDouble()

        // Create Vehicle 2 object
        Vehicle vehicle2 = new Vehicle(regNo2, brand2, price2, mileage2);

        scanner.close();

        // Display details of both vehicles
        System.out.println("\nDetails of Vehicle 1:");
        vehicle1.displayDetails();
        System.out.println("Details of Vehicle 2:");
        vehicle2.displayDetails();

        // Task: Display the vehicle with lowest price
        Vehicle vehicleWithLowestPrice = findVehicleWithLowestPrice(vehicle1, vehicle2);
        System.out.println("Vehicle with Lowest Price:");
        vehicleWithLowestPrice.displayDetails();

        // Task: Display the vehicle with best mileage
        Vehicle vehicleWithBestMileage = findVehicleWithBestMileage(vehicle1, vehicle2);
        System.out.println("Vehicle with Best Mileage:");
        vehicleWithBestMileage.displayDetails();
    }

    // Method to find vehicle with lowest price
    public static Vehicle findVehicleWithLowestPrice(Vehicle vehicle1, Vehicle vehicle2) {
        return (vehicle1.getPrice() < vehicle2.getPrice()) ? vehicle1 : vehicle2;
    }

    // Method to find vehicle with best mileage
    public static Vehicle findVehicleWithBestMileage(Vehicle vehicle1, Vehicle vehicle2) {
        return (vehicle1.getMileage() > vehicle2.getMileage()) ? vehicle1 : vehicle2;
    }
}

