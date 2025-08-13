package com.nit.lab.Exception.exception15_04;



public class DivisionExample 
{
public static int performDivision(int dividend,int divisor)
{
	
	 return dividend/divisor;
	
	
}

public static void main(String[] args)
{
	
	
	try 
	{
		int result = performDivision(10,5);
		System.out.println("The Result is : "+result);
		//throw new ArithmeticException();
		
	}
	catch(ArithmeticException e)
	{
		System.out.println("can't entered zero!!!");
	}
	System.out.println("Main method is Executed !!!");
}
}
