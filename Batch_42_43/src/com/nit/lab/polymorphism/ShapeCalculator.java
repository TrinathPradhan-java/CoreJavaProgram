package com.nit.lab.polymorphism;

public class ShapeCalculator 
{
	  public int calculateArea(int sideLength) {
	        if (sideLength < 0) {
	            System.out.println("Error: Side length must be non-negative.");
	            return -1;
	        }
	        return sideLength * sideLength;
	    }

	   
	    public int calculateArea(int length, int width) {
	        if (length < 0 || width < 0) {
	            System.out.println("Error: Length and width must be non-negative.");
	            return -1;
	        }
	        return length * width;
	    }

	   
	    public double calculateArea(double radius) {
	        if (radius < 0) {
	            System.out.println("Error: Radius must be non-negative.");
	            return -1;
	        }
	        return Math.PI * radius * radius;
	    }
}
