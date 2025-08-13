package com.nit.lab.oop14_feb;

public class BowlerDetails {

	public static void main(String[] args) {
		Bowler sachin = new Bowler();
		sachin.bowlerDetails("Sachin", 10, 5, 750, 463);
		sachin.computeBowlingAverage();
		sachin.showDetails();

	}

}
