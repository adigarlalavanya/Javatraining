package com.hcltech.Assignmentsday2;

public class Drama extends Movie {
    public Drama(String mpaaRating, int idNumber, String title) {
        super(mpaaRating, idNumber, title);
    }

    @Override
    public double calcLateFees(int daysLate) {
        return 2.0 * daysLate;
    }
}
