package com.nit.lab.functionalInterface10_04;

import java.util.Random;
import java.util.Scanner;
import java.util.function.*;

public class NumberGenerator 
{
	public static int generateRandomNumber(int min,int max)
	{
		Random random = new Random();
		Supplier<Integer>randomSupplier =()->random.nextInt(min,max+1);
		return randomSupplier.get();
	}

	public static void main(String[] args) 
	{
		System.out.println(generateRandomNumber(15, 20));

	}

}
