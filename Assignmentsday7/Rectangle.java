package com.hcltech.Assignmentsday7;

import java.util.Scanner;

public class Rectangle {
    private double length;
    private double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double computePerimeter() {
        return 2 * (length + height);
    }

    public double computeArea() {
        return length * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = 0.0;
        double height = 0.0;

        try {
            System.out.print("Enter the length: ");
            String input = scanner.nextLine();
            length = Double.parseDouble(input); // Parse input as double

            System.out.print("Enter the height: ");
            input = scanner.nextLine();
            height = Double.parseDouble(input); // Parse input as double

            Rectangle rectangle = new Rectangle(length, height);

            System.out.println("Rectangle Characteristics");
            System.out.printf("Length:   %.2f\n", rectangle.length);
            System.out.printf("Height:   %.2f\n", rectangle.height);
            System.out.printf("Perimeter: %.2f\n", rectangle.computePerimeter());
            System.out.printf("Area:      %.2f\n", rectangle.computeArea());

        } catch (NumberFormatException e) {
            System.out.println("Something went wrong!!!");
            System.out.println("please enter the details again");
        } finally {
            scanner.close(); // Close the scanner 
        }
    }
}
