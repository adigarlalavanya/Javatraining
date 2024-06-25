package com.hcltech.Excercisesday8;

import java.util.Scanner;

public class Persondemo {
	 public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);

	     // Input data for Person
	     System.out.print("Enter name: ");
	     String name = scanner.nextLine();
	     System.out.print("Enter age: ");
	     int age = scanner.nextInt();
	     scanner.nextLine(); // Consume newline character

	     // Input data for Student
	     System.out.print("Enter university: ");
	     String university = scanner.nextLine();
	     System.out.print("Enter degree: ");
	     String degree = scanner.nextLine();

	     // Create Student object
	     Student student = new Student(name, age, university, degree);

	     // Display student details
	     System.out.println("\nStudent Details:");
	     student.display();
	 }
	}
