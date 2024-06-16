package com.hcltech.Excercisesday11;

public class DemoThread1 implements Runnable {
    private Thread thread;

    public DemoThread1() {
        thread = new Thread(this); // Create a new Thread for this instance of DemoThread1
        thread.start(); // Start the thread
    }

    @Override
    public void run() {
        System.out.println("Running child Thread in loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Counter: " + i);
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                System.err.println("Thread interrupted: " + e);
            }
        }
    }

    public static void main(String[] args) {
        // Create 3 objects of DemoThread1
        DemoThread1 thread1 = new DemoThread1();
        DemoThread1 thread2 = new DemoThread1();
        DemoThread1 thread3 = new DemoThread1();
    }
}
