package com.hcltech.Assignmentsday2;


public class Action extends Movie {
    public Action(String mpaaRating, int idNumber, String title) {
        super(mpaaRating, idNumber, title);
    }

    @Override
    public double calcLateFees(int daysLate) {
        return 3.0 * daysLate;
    }
}
