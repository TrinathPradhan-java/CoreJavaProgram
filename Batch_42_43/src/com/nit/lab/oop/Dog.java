package com.nit.lab.oop;

public class Dog {
	
	String name;
	double height;
	int age;
	public void getDogDetails() {
		System.out.println("Dog name is "+name);
		System.out.println("Dog age is "+age+"years");
		System.out.println("Dog height is "+height);
	}
	public void bark() {
		System.out.println("The dog name is"+name+" his sound is bow bow");
	}

}
