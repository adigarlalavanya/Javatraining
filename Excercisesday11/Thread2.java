package com.hcltech.Excercisesday11;

public class Thread2 {
    public static void main(String[] args) {
        // Assign the current thread to t1
        Thread t1 = Thread.currentThread();
        
        // Change the name of the thread to MyThread
        t1.setName("MyThread");
        
        // Display the changed name of the thread
        System.out.println("Thread name: " + t1.getName());
        
        // Display the current time
        System.out.println("Current time: " + java.time.LocalTime.now());
        
        // Put the thread to sleep for 10 seconds (without try-catch block)
        Thread.sleep(10000); 
        // This line will cause a compilation error
        
        // Display the current time again after the thread wakes up
        System.out.println("Current time after sleep: " + java.time.LocalTime.now());
    }
}
