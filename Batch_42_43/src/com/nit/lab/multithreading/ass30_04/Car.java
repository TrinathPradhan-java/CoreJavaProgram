package com.nit.lab.multithreading.ass30_04;

public class Car implements Runnable
{
	
	String name;
	PetrolPump petrolpump;
	
	public Car(String name,PetrolPump petrolpump)
	{
		this.name = name;
		this.petrolpump= petrolpump;
	}
@Override
public void run()
{
	petrolpump.refillCar(name);
}
}
