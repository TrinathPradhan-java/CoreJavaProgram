package com.nit.lab.oop2;

public class CarDetails {

	public static void main(String[] args) {
		Car maruti = new Car();
		maruti.setCarDetails(121, "Maruti", "green", 45000.50);
		maruti.getCarDetails();
		
		
		Car fortuner = new Car();
	 fortuner.setCarDetails(121, "FORTUNER", "RED", 55000.50);
		fortuner.getCarDetails();
	}

}
