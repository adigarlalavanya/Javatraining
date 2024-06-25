package com.hcltech.Assignmentsday4;

//Main class to test the behavior
public class Finalizedemo {
public static void main(String[] args) {
   // Creating objects using the same reference
   A1 a = new A1();
   a = new A1();
   a = new A1();

   // Invoking garbage collection
   Runtime.getRuntime().gc();

   // Giving some time for GC to finish (optional)
   try {
       Thread.sleep(1000);
   } catch (InterruptedException e) {
       e.printStackTrace();
   }
}
}

