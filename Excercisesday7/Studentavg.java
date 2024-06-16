package com.hcltech.Excercisesday7;


class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}


public class Studentavg {
    public static void main(String[] args) {
        try {
            if (args.length != 8) {
                throw new IllegalArgumentException("Please enter exactly 8 arguments: name1, mark1, mark2, mark3, name2, mark1, mark2, mark3.");
            }

            // Extract student names
            String student1Name = args[0];
            String student2Name = args[4];

            // Parse and validate marks for student 1
            int student1Mark1 = parseAndValidateMark(args[1]);
            int student1Mark2 = parseAndValidateMark(args[2]);
            int student1Mark3 = parseAndValidateMark(args[3]);

            // Parse and validate marks for student 2
            int student2Mark1 = parseAndValidateMark(args[5]);
            int student2Mark2 = parseAndValidateMark(args[6]);
            int student2Mark3 = parseAndValidateMark(args[7]);

            // Calculate average marks
            double student1Average = (student1Mark1 + student1Mark2 + student1Mark3) / 3.0;
            double student2Average = (student2Mark1 + student2Mark2 + student2Mark3) / 3.0;

            // Print the results
            System.out.println(student1Name + "'s average marks: " + student1Average);
            System.out.println(student2Name + "'s average marks: " + student2Average);

        } catch (NumberFormatException e) {
            System.out.println("An error occurred: Please ensure all marks are valid integers.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (NegativeValueException | OutOfRangeException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static int parseAndValidateMark(String markStr) throws NumberFormatException, NegativeValueException, OutOfRangeException {
        int mark = Integer.parseInt(markStr);
        if (mark < 0) {
            throw new NegativeValueException("Negative values are not allowed: " + mark);
        }
        if (mark > 100) {
            throw new OutOfRangeException("Values out of range (0-100) are not allowed: " + mark);
        }
        return mark;
    }
}
