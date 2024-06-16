package com.hcltech.Excercisesday7;

public class MathOperation {
    public static void main(String[] args) {
        try {
            // Check if at least one argument is provided
            if (args.length == 0) {
                throw new IllegalArgumentException("Please provide at least one integer as a command-line argument.");
            }

            // Split the input string by comma and trim spaces
            String[] inputStrings = args[0].split(",");
            int[] numbers = new int[inputStrings.length];

            // Parse the input strings to integers
            for (int i = 0; i < inputStrings.length; i++) {
                numbers[i] = Integer.parseInt(inputStrings[i].trim());
            }

            // Calculate sum and average
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            double average = sum / (double) numbers.length;

            // Display the results
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An error occurred: Array index is out of bounds.");
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: Arithmetic exception, possibly due to division by zero.");
        } catch (NumberFormatException e) {
            System.out.println("An error occurred: Please enter all inputs are valid integers.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
