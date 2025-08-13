package com.nit.lab.multithreading.ass29_apr;

public class PaymentProcessing extends Thread
{
@Override
public void run()
{
	
	try
	{
		System.out.println("Processing Payment");
		Thread.sleep(2000);
		
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	System.out.println("Payment Successfull!");
}
}
