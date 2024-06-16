package com.hcltech.Assignmentsday11;

public class Main {
    public static void main(String[] args) {
        Number number2 = new Number(2);
        Number number5 = new Number(5);
        Number number8 = new Number(8);

        Thread thread2 = new Thread(number2);
        Thread thread5 = new Thread(number5);
        Thread thread8 = new Thread(number8);

        System.out.println("Starting threads...");
        thread2.start();
        thread5.start();
        thread8.start();

        // Wait for thread2 to complete before proceeding
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Threads status after completion
        System.out.println("\nThread status after completion:");
        System.out.println("Thread 2 status: " + thread2.getState());
        System.out.println("Thread 5 status: " + thread5.getState());
        System.out.println("Thread 8 status: " + thread8.getState());
    }
}

