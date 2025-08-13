package com.nit.lab.oop2;

public class Car {

	int carNumber;
	String carName;
	String carColor;
	double carPrice;
	
	
	public void setCarDetails(int num,String name,String color,double price) {
		carNumber = num;
		carName = name;
		carColor = color;
		carPrice = price;
		
	}
	
	public void getCarDetails() {
		System.out.println("Printing the number : "+carNumber);
		System.out.println("Printing the Name : "+carName);
		System.out.println("Printing the Color : "+carColor);
		System.out.println("Printing the Price : "+carPrice);
		System.out.println("------------------------------------------- ");
		
	}
	
	
	
}
