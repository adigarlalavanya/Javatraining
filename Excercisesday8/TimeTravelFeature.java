package com.hcltech.Excercisesday8;

public class TimeTravelFeature {
	 public void display() {
	        System.out.println("This is the TimeTravelFeature class.");
	    }

	    public static void main(String[] args) {
	        TimeTravelFeature feature = new TimeTravelFeature();
	        feature.display();

	        // Retrieve the annotation value at runtime
	        if (TimeTravelFeature.class.isAnnotationPresent(RequestForEnhancement.class)) {
	            RequestForEnhancement rfe = TimeTravelFeature.class.getAnnotation(RequestForEnhancement.class);
	            System.out.println("Request For Enhancement Details:");
	            System.out.println("ID: " + rfe.id());
	            System.out.println("Synopsis: " + rfe.synopsis());
	            System.out.println("Engineer: " + rfe.engineer());
	            System.out.println("Date: " + rfe.date());
	        }
	    }
	}
