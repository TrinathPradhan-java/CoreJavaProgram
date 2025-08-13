package com.nit.lab.oop;

public class Tiger {
	
	
	String name;
	int age;
	double height;
	String address;
	
	//All details of dog
	public void getDetails() {
		System.out.println(name+ "is my name");
		System.out.println(age+ "old.");
		System.out.println("height"+height);
		System.out.println("i am lives in"+address);
	}
	//eat method
	public void eat() {
		System.out.println("I am only eat chicken");
	}
	public void extraActivity() {
		System.out.println("I am hunter.I am still alive.\n I am king of "+address);
		
	}

}
