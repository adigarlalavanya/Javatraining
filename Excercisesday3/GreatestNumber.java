package com.hcltech.Excercisesday3;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter size of an array: ");
        int size = scanner.nextInt();

        // Define an array of the given size
        int[] numbers = new int[size];

        // Read the elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
        	System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Find the greatest number in the array
        int greatestNumber = findGreatestNumber(numbers);

        // Display the result
        System.out.println("The greatest number in the array is: " + greatestNumber);

        // Close the scanner
        scanner.close();
    }

    // Method to find the greatest number in the array
    public static int findGreatestNumber(int[] array) {
        // Assume the first element is the greatest
        int greatest = array[0];

        // Iterate through the array to find the greatest number
        for (int i = 1; i < array.length; i++) {
            if (array[i] > greatest) {
                greatest = array[i];
            }
        }
        return greatest;
    }
}

