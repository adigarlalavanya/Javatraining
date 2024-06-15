package com.hcltech.Assignmentsday2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Movie {
    private String mpaaRating;
    private int idNumber;
    private String title;

    // Constructor
    public Movie(String mpaaRating, int idNumber, String title) {
        this.mpaaRating = mpaaRating;
        this.idNumber = idNumber;
        this.title = title;
    }

    // Accessor and Mutator methods
    public String getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Overriding equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Movie movie = (Movie) obj;
        return idNumber == movie.idNumber;
    }

    // Method to calculate late fees (to be overridden by subclasses)
    public double calcLateFees(int daysLate) {
        return 2.0 * daysLate;
    }
}