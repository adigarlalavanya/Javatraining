package com.hcltech.Assignmentsday4;

import java.util.Random;

//Abstract class Shape
abstract class Shape {
 protected int x, y;

 // Constructor to initialize position
 public Shape(int x, int y) {
     this.x = x;
     this.y = y;
 }

 // Method to move the shape
 public void move(int dx, int dy) {
     x += dx;
     y += dy;
 }

 // Abstract method to show the shape
 public abstract void show();

 // Abstract method to get string representation
 @Override
 public abstract String toString();
}

//Subclass Line
class Line extends Shape {
 protected int x2, y2;

 // Constructor to initialize both points of the line
 public Line(int x, int y, int x2, int y2) {
     super(x, y);
     this.x2 = x2;
     this.y2 = y2;
 }

 @Override
 public void show() {
     System.out.println(this.toString());
 }

 @Override
 public String toString() {
     return "Line from (" + x + ", " + y + ") to (" + x2 + ", " + y2 + ")";
 }
}

//Subclass Circle
class Circle extends Shape {
 protected int radius;

 // Constructor to initialize the center and radius of the circle
 public Circle(int x, int y, int radius) {
     super(x, y);
     this.radius = radius;
 }

 @Override
 public void show() {
     System.out.println(this.toString());
 }

 @Override
 public String toString() {
     return "Circle with center (" + x + ", " + y + ") and radius " + radius;
 }
}

//Subclass Rectangle
class Rectangle extends Shape {
 protected int x2, y2;

 // Constructor to initialize both points of the rectangle
 public Rectangle(int x, int y, int x2, int y2) {
     super(x, y);
     this.x2 = x2;
     this.y2 = y2;
 }

 @Override
 public void show() {
     System.out.println(this.toString());
 }

 @Override
 public String toString() {
     return "Rectangle with corners (" + x + ", " + y + ") and (" + x2 + ", " + y2 + ")";
 }
}

//Subclass PolyLine
class PolyLine extends Shape {
 private int[][] points;

 // Constructor to initialize points of the polyline
 public PolyLine(int[][] points) {
     super(points[0][0], points[0][1]);
     this.points = points;
 }

 @Override
 public void show() {
     System.out.println(this.toString());
 }

 @Override
 public String toString() {
     StringBuilder sb = new StringBuilder("PolyLine with points: ");
     for (int[] point : points) {
         sb.append("(").append(point[0]).append(", ").append(point[1]).append(") ");
     }
     return sb.toString();
 }
}
