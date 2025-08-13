package com.nit.lab.Exception.exception16_04;

import java.util.Scanner;

public class DivisionExample 
{
public static int performDivision(int dividend,int divisor)
{
	if(divisor ==0)
	{
	throw new ArithmeticException("The dividend is "+dividend+" and divisor is"+divisor);
	}
	return dividend/divisor;
}

public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	
	try
	{
		System.out.print("Enter a dividend : ");
		int dividend = sc.nextInt();
		System.out.println("Enter a divisor : ");
		int divisor = sc.nextInt();
		
		int result = performDivision(dividend,divisor);
		System.out.println("The Result is : "+result);
		
	}
	catch(ArithmeticException e)
	{
		System.out.println("Plz do not entered zero!!!"+e.toString());
	}
}
}
