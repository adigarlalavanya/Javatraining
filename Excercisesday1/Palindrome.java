package com.hcltech.Excercisesday1;

public class Palindrome {
    public static void main(String[] args) {
        // Check if exactly one argument is provided
        if (args.length != 1) {
            System.out.println("Please provide exactly one string argument.");
            return;
        }
        // Get the command line argument
        String input = args[0];

        // Check if the input string is a palindrome
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        String rev = "";

        // Reverse the input string
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        // Check if the reversed string is equal to the original string
        return str.equals(rev);
    }
}
