package com.hcltech.Assignmentsday4;

//Class A1 with finalize method
class A1 {
 // Constructor
 public A1() {
     System.out.println("A1 object created");
 }

 // Override finalize method
 @Override
 protected void finalize() throws Throwable {
     System.out.println("Finalize method called");
     super.finalize();
 }
}
