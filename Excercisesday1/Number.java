package com.hcltech.Excercisesday1;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter a 4-digit number
            System.out.print("Enter a 4-digit number: ");
            int number = scanner.nextInt();
            
            // Check if the number has exactly 4 digits
            if (number < 1000 || number > 9999) {
                System.out.println("Invalid input, please enter a 4-digit number only.");
                return;
            }
            
            // Calculate the sum of digits
            int sum = 0;
            int temp = number;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            // Print the sum of digits
            System.out.println("The sum of all the digits entered is " + sum);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid 4-digit number.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
