package com.hcltech.Assignmentsday11;

import java.time.LocalTime;

public class CurrentTime {
    public static void main(String[] args) {
        int totalTime = 20; // Total time to run the program in seconds
        int interval = 2; // Interval between each time printing in seconds

        LocalTime endTime = LocalTime.now().plusSeconds(totalTime);

        while (LocalTime.now().isBefore(endTime)) {
            System.out.println("Current time: " + LocalTime.now());
            try {
                Thread.sleep(interval * 1000); // Convert seconds to milliseconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread interrupted: " + e);
            }
        }
        System.out.println("Done with the program.");
    }
}

