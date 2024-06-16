package com.hcltech.Excercisesday11;

public class Thread1{
    public static void main(String[] args) {
        // Assign the current thread to t1
        Thread t1 = Thread.currentThread();
        
        // Change the name of the thread to MyThread
        t1.setName("MyThread");
        
        // Display the changed name of the thread
        System.out.println("Thread name: " + t1.getName());
        
        // Display the current time
        System.out.println("Current time: " + java.time.LocalTime.now());
        
        try {
            // Put the thread to sleep for 10 seconds
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        
        // Display the current time again after the thread wakes up
        System.out.println("Current time after sleep: " + java.time.LocalTime.now());
    }
}