package com.hcltech.Assignmentsday7;

//Custom exception for invalid divisor (y = 0)
class InvalidDivisor extends Exception {
 public InvalidDivisor(String message) {
     super(message);
 }
}

//Division class with divide method handling division and exception
class Division {
 private int x;
 private int y;

 // Constructor to initialize x and y
 public Division(int x, int y) {
     this.x = x;
     this.y = y;
 }

 // Method to perform division and handle division by zero
 public double divide() throws InvalidDivisor {
     if (y == 0) {
         throw new InvalidDivisor("The division operation cannot be done as the divisor is 0");
     }
     return (double) x / y;
 }
}
