package com.hcltech.Excercisesday3;

import java.util.Arrays;
import java.util.Scanner;

public class Numericsort{
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

        // Close the scanner
        scanner.close();

        // Display the original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Display the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}

