package com.hcltech.Excersisesday5;

public class Cuboid implements CalculateArea, CalculateVolume {
    double side;

    Cuboid(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculateVolume() {
        return side * side * side;
    }

    public double Perimeter() {
        return 4 * side;
    }

    public double SurfaceArea() {
        return 6 * side * side;
    }
}
