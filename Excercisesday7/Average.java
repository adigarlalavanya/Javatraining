package com.hcltech.Excercisesday7;

public class Average {
    public static void main(String[] args) {
        try {
            if (args.length < 5) {
                throw new ArrayIndexOutOfBoundsException("Please enter 5 integers.");
            }

            int[] numbers = new int[5];
            for (int i = 0; i < 5; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }

            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            double average = sum / 5.0;

            System.out.println("The average of the 5 integers is: " + average);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
