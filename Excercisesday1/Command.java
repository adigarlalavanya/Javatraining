package com.hcltech.Excercisesday1;

public class Command {
    public static void main(String[] args) {
    	//accept two arguments only
    	if (args.length != 2) {
            System.out.println("Please provide exactly two arguments.");
            return;
        }
        // Get the command line arguments
        String firstArgument = args[0];
        String secondArgument = args[1];
        // Determine the output based on the first argument
        if ("Stackrout".equals(firstArgument)) {
            System.out.println("ABC Technologies " + secondArgument);
        } else if ("ABC".equals(firstArgument)) {
            System.out.println("ABC Technologies " + secondArgument);
        } else {
            System.out.println(firstArgument + " " + secondArgument);
        }
    }
}

