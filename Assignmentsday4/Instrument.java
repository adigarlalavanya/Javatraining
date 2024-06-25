package com.hcltech.Assignmentsday4;

//Abstract class Instrument
abstract class Instrument {
 // Abstract method play
 abstract void play();
}

//Subclass Piano
class Piano extends Instrument {
 @Override
 void play() {
     System.out.println("Piano is playing tan tan tan tan");
 }
}

//Subclass Flute
class Flute extends Instrument {
 @Override
 void play() {
     System.out.println("Flute is playing toot toot toot toot");
 }
}

//Subclass Guitar
class Guitar extends Instrument {
 @Override
 void play() {
     System.out.println("Guitar is playing tin tin tin");
 }
}
