package com.hcltech.Excercisesday3;

import java.util.Scanner;

public class Bookdemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input book details
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();

        // Input Title with validation
        String title;
        do {
            System.out.print("Enter Title: ");
            title = scanner.nextLine().trim();
            if (!isValidAlphabetic(title)) {
                System.out.println("Invalid input! Please enter alphabetic characters only.");
            }
        } while (!isValidAlphabetic(title));

        // Input Author with validation (alphabetic characters only)
        String author;
        do {
            System.out.print("Enter Author: ");
            author = scanner.nextLine().trim();
            if (!isValidAlphabeticOnly(author)) {
                System.out.println("Invalid input! Please enter alphabetic characters only.");
            }
        } while (!isValidAlphabeticOnly(author));

        // Input Price with validation
        double price = readDoubleInput(scanner, "Price");

        // Create book object
        Book book = new Book(isbn, title, author, price);

        // Display book details
        System.out.println("Book Details:");
        book.displayDetails();

        // Input Discount Percent with validation
        double discountPercent = readDoubleInput(scanner, "Discount Percent");

        // Calculate discounted price and display
        double discountedPrice = book.discountedPrice(discountPercent);
        System.out.println("Price after " + discountPercent + "% discount: " + discountedPrice);

        scanner.close();
    }

    // Method to validate input containing alphabetic characters and spaces
    private static boolean isValidAlphabetic(String input) {
        return input.matches("[a-zA-Z ]+");
    }

    // Method to validate input containing only alphabetic characters
    private static boolean isValidAlphabeticOnly(String input) {
        return input.matches("[a-zA-Z]+");
    }

    // Method to read double input with validation
    private static double readDoubleInput(Scanner scanner, String fieldName) {
        double input = 0;
        boolean isValid = false;
        do {
            try {
                System.out.print("Enter " + fieldName + ": ");
                input = scanner.nextDouble();
                isValid = true;
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a numeric value.");
                scanner.next(); // Consume the invalid input
            }
            scanner.nextLine(); // Consume the newline character after reading the double value
        } while (!isValid);
        return input;
    }
}
