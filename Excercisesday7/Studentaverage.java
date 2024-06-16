package com.hcltech.Excercisesday7;

public class Studentaverage{
    public static void main(String[] args) {
        try {
            if (args.length != 8) {
                throw new IllegalArgumentException("Please enter exactly 8 arguments: name1, mark1, mark2, mark3, name2, mark1, mark2, mark3.");
            }

            // Extract student names
            String student1Name = args[0];
            String student2Name = args[4];

            // Parse marks for student 1
            int student1Mark1 = Integer.parseInt(args[1]);
            int student1Mark2 = Integer.parseInt(args[2]);
            int student1Mark3 = Integer.parseInt(args[3]);

            // Parse marks for student 2
            int student2Mark1 = Integer.parseInt(args[5]);
            int student2Mark2 = Integer.parseInt(args[6]);
            int student2Mark3 = Integer.parseInt(args[7]);

            // Calculate average marks
            double student1Average = (student1Mark1 + student1Mark2 + student1Mark3) / 3.0;
            double student2Average = (student2Mark1 + student2Mark2 + student2Mark3) / 3.0;

            // Print the results
            System.out.println(student1Name + "'s average marks: " + student1Average);
            System.out.println(student2Name + "'s average marks: " + student2Average);

        } catch (NumberFormatException e) {
            System.out.println("An error occurred: Please enter all marks are valid integers.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
