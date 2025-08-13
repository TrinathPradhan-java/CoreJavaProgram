package com.nit.lab.oop;

public class Fan {

	String name ;
	String coil;
	int wings;
	
	public void getFan() {
		System.out.println("Fan is "+name+ "and"+coil+"coil use ,"+wings+"wings");
	}
	public void switchOn() {
		System.out.println("The fan is on,and the "+wings+ "wing are moved circularly");
		
	}
	
	public void switchOff() {
		System.out.println("The fan is off,and the "+wings+ " wing are not moved circularly");
		
	}
	
	
}
