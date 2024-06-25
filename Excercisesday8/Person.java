package com.hcltech.Excercisesday8;

//3rd and 4th question
import java.util.Scanner;

//Person class with name and age
class Person {
 protected String name;
 protected int age;

 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 public void display() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

//Student class inherits from Person
class Student extends Person {
 private String university;
 private String degree;

 public Student(String name, int age, String university, String degree) {
     super(name, age);
     this.university = university;
     this.degree = degree;
 }

 @Override
 public void display() {
     super.display(); // Calling display() method of superclass (Person)
     System.out.println("University: " + university);
     System.out.println("Degree: " + degree);
 }
}