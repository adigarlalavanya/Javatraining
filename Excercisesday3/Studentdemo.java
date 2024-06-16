package com.hcltech.Excercisesday3;

import java.util.ArrayList;
import java.util.Scanner;

public class Studentdemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        // Input details for 5 students
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter details for Student " + i + ":");
            System.out.print("Student ID: ");
            int studentId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Contact No: ");
            String contactNo = scanner.nextLine();

            System.out.print("Course: ");
            String course = scanner.nextLine();

            System.out.print("Fees: ");
            double fees = scanner.nextDouble();
            scanner.nextLine();

            // Create Student object and add to ArrayList
            students.add(new Student(studentId, name, contactNo, course, fees));
            System.out.println();
        }

        scanner.close();

        // Display student details course-wise
        displayStudentsByCourse(students);

        // Display total fees of all students
        displayTotalFees(students);
    }

    // Method to display student details course-wise
    public static void displayStudentsByCourse(ArrayList<Student> students) {
        System.out.println("Student details course-wise:");
        for (Student student : students) {
            student.displayDetails();
        }
    }

    // Method to display total fees of all students
    public static void displayTotalFees(ArrayList<Student> students) {
        double totalFees = 0;
        for (Student student : students) {
            totalFees += student.getFees();
        }
        System.out.println("Total fees of all students: $" + totalFees);
    }
}
