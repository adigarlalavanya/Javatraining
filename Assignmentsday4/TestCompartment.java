package com.hcltech.Assignmentsday4;

import java.util.Random;

public class TestCompartment {
    public static void main(String[] args) {
        // Declare an array of Compartment of size 10
        Compartment[] compartments = new Compartment[10];
 
        // Randomly assign a type of compartment to each array element
        Random rand = new Random();
        for (int i = 0; i < compartments.length; i++) {
            int compartmentType = rand.nextInt(4); // Generates a random number between 0 and 3
            switch (compartmentType) {
                case 0:
                    compartments[i] = new FirstClass();
                    break;
                case 1:
                    compartments[i] = new Ladies();
                    break;
                case 2:
                    compartments[i] = new General();
                    break;
                case 3:
                    compartments[i] = new Luggage();
                    break;
            }
        }
 
        // Check the polymorphic behavior of the notice method
        for (int i = 0; i < compartments.length; i++) {
            System.out.print("Compartment at index " + i + ": ");
            compartments[i].notice();
        }
    }
}