package com.hcltech.Assignmentsday4;

public class Instrumentdemo {
public static void main(String[] args) {
   // Creating an array of 10 Instrument references
   Instrument[] instruments = new Instrument[10];

   // Assigning different types of Instrument to the array
   instruments[0] = new Piano();
   instruments[1] = new Flute();
   instruments[2] = new Guitar();
   instruments[3] = new Piano();
   instruments[4] = new Flute();
   instruments[5] = new Guitar();
   instruments[6] = new Piano();
   instruments[7] = new Flute();
   instruments[8] = new Guitar();
   instruments[9] = new Piano();

   for (int i = 0; i < instruments.length; i++) {
       instruments[i].play();
       
       // Using instanceof to print the type of object stored at each index
       if (instruments[i] instanceof Piano) {
           System.out.println("Instrument at index " + i + " is a Piano");
       } else if (instruments[i] instanceof Flute) {
           System.out.println("Instrument at index " + i + " is a Flute");
       } else if (instruments[i] instanceof Guitar) {
           System.out.println("Instrument at index " + i + " is a Guitar");
       }
   }
}
}


