package com.hcltech.Assignmentsday2;

public class Comedy extends Movie {
    public Comedy(String mpaaRating, int idNumber, String title) {
        super(mpaaRating, idNumber, title);
    }

    @Override
    public double calcLateFees(int daysLate) {
        return 2.5 * daysLate;
    }
}
