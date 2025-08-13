package com.nit.lab.oop;

public class TigerDetails {

	public static void main(String[] args) {
		Tiger mufasa = new Tiger();
		mufasa.name = "MUFASA";
		mufasa.address="JUNGLE";
		mufasa.age = 12;
		mufasa.height = 6.6;
		
		
		
		mufasa.getDetails();
		mufasa.eat();
		mufasa.extraActivity();

	}

}
