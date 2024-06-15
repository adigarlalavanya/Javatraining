package com.hcltech.Assignmentsday7;

import java.util.Scanner;

public class Divisiondemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend (x): ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor (y): ");
        int divisor = scanner.nextInt();

        Division division = new Division(dividend, divisor);

        try {
            double result = division.divide();
            System.out.println("Result of division: " + result);
        } catch (InvalidDivisor e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close(); // Close the scanner in finally block to prevent resource leak
        }
    }
}