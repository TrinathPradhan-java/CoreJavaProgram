package com.nit.lab.assignment4;

public class CompoundInterest {

	public static void main(String[] args) {
    
		double rate = 2;
		double principle = 1000;
		double totalamuont =
		 principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
		System.out.println("The Compound interest is :"+totalamuont);

	}

}
