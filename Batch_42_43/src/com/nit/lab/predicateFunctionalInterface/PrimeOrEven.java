package com.nit.lab.predicateFunctionalInterface;

import java.util.Scanner;
import java.util.function.*;
public class PrimeOrEven 
{
	public static void main(String[] args)
	{
		Predicate <Integer> isEven =  num -> num%2==0;
		Predicate <Integer> isPrime=num->
		{
			int c=0;
			for(int i=1;i<=num;i++)
			
				if(num%i==0)
				{
				c++;
				}
         		return c==2;	
		};	
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num= sc.nextInt();
		System.out.println("is "+num+ "Even ?:"+isEven.test(num));
		System.out.println("is "+num+ "Prime ?:"+isPrime.test(num));
		
		
		
	}
	
	
}
