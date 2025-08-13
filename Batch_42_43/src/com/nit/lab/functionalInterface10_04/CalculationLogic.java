package com.nit.lab.functionalInterface10_04;
import java.util.Scanner;
import java.util.function.*;

public class CalculationLogic 
{

	
	public static boolean testPredicate(int value,Predicate<Integer> calculation)
	{
		return calculation.test(value);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
	int number = sc.nextInt();
	Predicate<Integer> isEven = n->n%2==0;
   Predicate<Integer> isGreater =n ->n>10;
   Predicate <Integer> isPrime= n ->
   {
	   int c=0;
	   for(int i =1;i<=n;i++)
	   {
		   if(n%i==0)
		   {
		   c++;
		   }
	   }
	   return c==2;
	   
   };
	
	System.out.println("Is Even :"+testPredicate(number,isEven));
	System.out.println("Is greater :"+testPredicate(number,isGreater));
	System.out.println("Is Prime :"+testPredicate(number,isPrime));
	
	}
  
	

}
