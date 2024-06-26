package com.hcltech.Excersisesday5;

public class Sphere implements CalculateArea, CalculateVolume {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }

    public double Perimeter() {
        return 2 * Math.PI * radius;
    }

    public double SurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
}