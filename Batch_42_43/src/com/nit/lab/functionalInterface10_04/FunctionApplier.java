package com.nit.lab.functionalInterface10_04;
import java.util.Scanner;
import java.util.function.*;

public class FunctionApplier 
{
	public static int applyFunction(int value ,Function<Integer,Integer> function)
	{
		return function.apply(value);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int number = sc.nextInt();
		
	Function <Integer,Integer> add = num->num+5;
	Function<Integer,Integer> multiplying = num->num*2;
	Function<Integer,Integer> subtracting = num->num-3;
	
	
	System.out.println("After adding 5 :"+applyFunction(number,add));
	System.out.println("After multiplying by 2 :"+applyFunction(number, multiplying));
	System.out.println("After subtracting 3 :"+applyFunction(number,subtracting));
	

	}

}
