package com.hcltech.Assignmentsday11;

public class Number implements Runnable {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Thread for multiples of " + number + " started.");
        for (int i = 1; i <= 5; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
            try {
                Thread.sleep(500); // Sleep to simulate processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread for multiples of " + number + " completed.");
    }
}

