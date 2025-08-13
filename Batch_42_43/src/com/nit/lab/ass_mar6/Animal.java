package com.nit.lab.ass_mar6;

public class Animal {
	
public void eat() {
	System.out.println("Animal is Eating");
}

}
class Mamal extends Animal{
	public void walk() {
		super.eat();
		System.out.println("Mamal is walking");
		
	}

	
	
}
class Dog extends Mamal{
	public void bark() {
		super.walk();
		System.out.println("Dog is barking");
		
	}


	
}
