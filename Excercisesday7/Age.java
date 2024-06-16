package com.hcltech.Excercisesday7;

public class Age {

    // Custom exception class for invalid age
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        // Ensure exactly 2 arguments are passed (name and age)
        if (args.length != 2) {
            System.err.println("Error: Please provide exactly two arguments: <name> <age>");
            System.exit(1);
        }

        String name = args[0];
        String ageStr = args[1];

        try {
            int age = Integer.parseInt(ageStr);
            validateAge(age);

            // If valid, print the name and age
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);

        } catch (NumberFormatException e) {
            System.err.println("Error: Age must be a valid integer.");
            System.exit(1);
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }

    // Method to validate age
    private static void validateAge(int age) throws InvalidAgeException {
        if (age < 18 || age >= 60) {
            throw new InvalidAgeException("Error: Age must be >= 18 and < 60.");
        }
    }
}

