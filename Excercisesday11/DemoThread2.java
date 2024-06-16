package com.hcltech.Excercisesday11;

public class DemoThread2 extends Thread {
    
    public DemoThread2(String name) {
        super(name); // Call Thread constructor with thread name
        start(); // Start the thread
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
        DemoThread2 thread1 = new DemoThread2("Thread 1");
        DemoThread2 thread2 = new DemoThread2("Thread 2");
        DemoThread2 thread3 = new DemoThread2("Thread 3");
    }
}
