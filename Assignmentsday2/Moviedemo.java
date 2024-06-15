package com.hcltech.Assignmentsday2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Moviedemo {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter details for Action movie:");
            Movie actionMovie = createMovie(reader, "Action");

            System.out.println("Enter details for Comedy movie:");
            Movie comedyMovie = createMovie(reader, "Comedy");

            System.out.println("Enter details for Drama movie:");
            Movie dramaMovie = createMovie(reader, "Drama");

            System.out.println("Enter number of days late:");
            int daysLate = Integer.parseInt(reader.readLine());

            System.out.println("Late fee for action movie (" + daysLate + " days late): $" + actionMovie.calcLateFees(daysLate));
            System.out.println("Late fee for comedy movie (" + daysLate + " days late): $" + comedyMovie.calcLateFees(daysLate));
            System.out.println("Late fee for drama movie (" + daysLate + " days late): $" + dramaMovie.calcLateFees(daysLate));

            // Testing equality
            Movie anotherActionMovie = new Action("PG-13", actionMovie.getIdNumber(), "Another Action Movie");
            System.out.println("Action movie equals another action movie: " + actionMovie.equals(anotherActionMovie));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Movie createMovie(BufferedReader reader, String genre) throws IOException {
        System.out.print("Enter MPAA Rating: ");
        String mpaaRating = reader.readLine();
        System.out.print("Enter ID Number: ");
        int idNumber = Integer.parseInt(reader.readLine());
        System.out.print("Enter Title: ");
        String title = reader.readLine();

        switch (genre) {
            case "Action":
                return new Action(mpaaRating, idNumber, title);
            case "Comedy":
                return new Comedy(mpaaRating, idNumber, title);
            case "Drama":
                return new Drama(mpaaRating, idNumber, title);
            default:
                return new Movie(mpaaRating, idNumber, title);
        }
    }
}

