package com.nit.lab.multithreading.ass29_apr;

public class FareCalculation extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Calculating estimated fare....");
		try
		{
			Thread.sleep(1500);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Esitimated fare : 137.75RS.");
	}
}
