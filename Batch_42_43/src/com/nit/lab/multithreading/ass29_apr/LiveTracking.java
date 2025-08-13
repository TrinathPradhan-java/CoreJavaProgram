package com.nit.lab.multithreading.ass29_apr;

public class LiveTracking extends Thread

{
@Override
public void run() 
{
	
	try 
	{
		for(int i =20;i<=100;i=i+20)
		{
			System.out.println("Updating ride location..."+i+" completed");
			Thread.sleep(500);
		}
		
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	System.out.println("Ride Completed!");
}
}
