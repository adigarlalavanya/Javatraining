package com.hcltech.Assignmentsday1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter a number
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();

            // Validate if the number is non-negative
            if (n < 0) {
                System.out.println("Invalid input, please enter a positive number.");
                return;
            }

            // Calculate factorial using a do-while loop
            int fact = 1;
            int i = 1;
            do {
                fact = fact * i;
                i++;
            } while (i <= n);

            // Print the factorial
            System.out.println("Factorial of " + n + " is: " + fact);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}