package com.hcltech.Assignmentsday1;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter a number
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Check if the number is positive, negative, or zero
            if (number > 0) {
                System.out.println("The number is positive.");
            } else if (number < 0) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
