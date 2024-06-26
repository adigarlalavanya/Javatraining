package com.hcltech.Excersisesday5;

public class Square implements CalculateArea {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }
}