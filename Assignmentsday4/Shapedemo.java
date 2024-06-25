package com.hcltech.Assignmentsday4;

import java.util.Random;

//Main class to test the functionality
public class Shapedemo {
public static void main(String[] args) {
   Random rand = new Random();
   Shape[] shapes = new Shape[10];

   // Generating 10 random shapes
   for (int i = 0; i < shapes.length; i++) {
       int shapeType = rand.nextInt(4);

       switch (shapeType) {
           case 0:
               shapes[i] = new Line(rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100));
               break;
           case 1:
               shapes[i] = new Circle(rand.nextInt(100), rand.nextInt(100), rand.nextInt(50));
               break;
           case 2:
               shapes[i] = new Rectangle(rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100));
               break;
           case 3:
               int numPoints = rand.nextInt(5) + 2; // PolyLine with at least 2 points
               int[][] points = new int[numPoints][2];
               for (int j = 0; j < numPoints; j++) {
                   points[j][0] = rand.nextInt(100);
                   points[j][1] = rand.nextInt(100);
               }
               shapes[i] = new PolyLine(points);
               break;
       }
   }

   // Invoking the show() method for each shape
   for (Shape shape : shapes) {
       shape.show();
   }
}
}


