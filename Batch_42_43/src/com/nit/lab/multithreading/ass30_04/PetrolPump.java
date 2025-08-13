package com.nit.lab.multithreading.ass30_04;

public class PetrolPump 
{
public synchronized void refillCar(String carName)
{
	System.out.println(carName+" started filling...");
try 
{
	Thread.sleep(3000);
}
catch(InterruptedException e)
{
	System.out.println(e.getMessage());
}
System.out.println(carName+" completed filling!");
}
}
