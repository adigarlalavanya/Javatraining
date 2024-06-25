package com.hcltech.Assignmentsday4;

import java.util.Random;

//Abstract class Compartment
abstract class Compartment {
//Abstract method notice
abstract void notice();
}

//Subclass FirstClass
class FirstClass extends Compartment{
@Override
void notice() {
   System.out.println("Notice: This is a First Class compartment.");
}
}

//Subclass Ladies
class Ladies extends Compartment {
@Override
void notice() {
   System.out.println("Notice: This is a Ladies compartment.");
}
}

//Subclass General
class General extends Compartment{
@Override
void notice() {
   System.out.println("Notice: This is a General compartment.");
}
}

//Subclass Luggage
class Luggage extends Compartment {
@Override
void notice() {
   System.out.println("Notice: This is a Luggage compartment.");
}
}
