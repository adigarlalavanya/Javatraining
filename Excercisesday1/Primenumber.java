package com.hcltech.Excercisesday1;

public class Primenumber {
    public static void main(String[] args) {
    	//accepting one argument only
    	if (args.length != 1) {
            System.out.println("Please provide exactly one integer argument.");
            return;
        }
        try {
            int number = Integer.parseInt(args[0]);
            System.out.println(number + (isPrime(number) ? " is a prime number." : " is not a prime number."));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
    public static boolean isPrime(int number) {
        if (number < 2) {
        	return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
            	return false;
            }
        }
        return true;
    }
}
