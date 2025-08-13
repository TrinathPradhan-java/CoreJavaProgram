package com.nit.lab.oop;

public class FanDetails {

	public static void main(String[] args) {
	Fan bajaj = new Fan();
	bajaj.name = "Bajaj";
	bajaj.coil = "FCU";
	bajaj.wings = 4;
	
	
	bajaj.getFan();
	bajaj.switchOn();
	bajaj.switchOff();

	}

}
