package com.hcltech.Excersisesday5;

import java.util.Scanner;

public class Areademo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double circleRadius = scanner.nextDouble();
        Circle circle = new Circle(circleRadius);
        System.out.println("Area of Circle is: " + circle.calculateArea());
        System.out.println("Perimeter of Circle: " + circle.calculatePerimeter());

        System.out.print("Enter side length of the square: ");
        double squareSide = scanner.nextDouble();
        Square square = new Square(squareSide);
        System.out.println("Area of Square is: " + square.calculateArea());
        System.out.println("Perimeter of Square is: " + square.calculatePerimeter());

        System.out.print("Enter radius of the sphere: ");
        double sphereRadius = scanner.nextDouble();
        Sphere sphere = new Sphere(sphereRadius);
        System.out.println("Surface Area of Sphere is : " + sphere.SurfaceArea());
        System.out.println("Volume of Sphere is: " + sphere.calculateVolume());
        System.out.println("Circumference Sphere is: " + sphere.Perimeter());
        System.out.println("Area od Sphere is: " + sphere.calculateArea());

        System.out.print("Enter side length of the cuboid: ");
        double cuboidSide = scanner.nextDouble();
        Cuboid cuboid = new Cuboid(cuboidSide);
        System.out.println("Surface Area of Cuboid is: " + cuboid.SurfaceArea());
        System.out.println("Volume of Cuboid is: " + cuboid.calculateVolume());
        System.out.println("Perimeter of Cuboid is: " + cuboid.Perimeter());
        System.out.println("Area of Cuboid is: " + cuboid.calculateArea());
        scanner.close();

        scanner.close();
    }
}