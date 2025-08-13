package com.nit.lab.oop;

public class DogDetails {

	public static void main(String[] args) {
		Dog tiger = new Dog();
		tiger.name = "Tiger";
		tiger.age = 5;
		tiger.height = 5.5;
		
		tiger.getDogDetails();
		tiger.bark();
	}

}
