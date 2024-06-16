package com.hcltech.Excercisesday7;

public class Wrapperdemo {
    // Primitive variables
    int i1 = 100;
    String s1 = "200.99";
    double d1 = 20.20;

    // Wrapper class objects
    Integer i1Wrapper;
    Double d1Wrapper;
    Double s1Wrapper;

    // Converted primitive from String
    double s1Primitive;

    public Wrapperdemo() {
        // Convert primitives to their respective wrapper objects
        i1Wrapper = i1; // auto-boxing
        d1Wrapper = d1; // auto-boxing

        // Convert the String to a double primitive and its wrapper object
        s1Primitive = Double.parseDouble(s1);
        s1Wrapper = s1Primitive; // auto-boxing
    }

    public void displayValues() {
        System.out.println("Primitive int: " + i1);
        System.out.println("Primitive double: " + d1);
        System.out.println("String: " + s1);
        System.out.println("Integer wrapper: " + i1Wrapper);
        System.out.println("Double wrapper: " + d1Wrapper);
        System.out.println("Double wrapper from String: " + s1Wrapper);
        System.out.println("Double primitive from String: " + s1Primitive);
    }

    public static void main(String[] args) {
        Wrapperdemo demo = new Wrapperdemo();
        demo.displayValues();
    }
}
