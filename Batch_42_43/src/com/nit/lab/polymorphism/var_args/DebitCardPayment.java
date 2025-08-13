package com.nit.lab.polymorphism.var_args;

public class DebitCardPayment extends Payment 
{
	@Override
	public void processPayment()
	{
		System.out.println("Processing Debit Card payment");
	}
}
