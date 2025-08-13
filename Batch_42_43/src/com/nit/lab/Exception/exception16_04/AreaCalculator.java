package com.nit.lab.Exception.exception16_04;

import java.util.Scanner;

public class AreaCalculator 
{

	public static double calculateArea(double length,double breadth)
	{
		if(length<0 | breadth<0)
		{
			throw new IllegalArgumentException("Dimensions must be positive: "+length+","+breadth);
		}
		return length*breadth;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Enter length : ");
			double length = sc.nextDouble();
			System.out.println("Enter breadth :");
			double breadth = sc.nextDouble();
			double result = calculateArea(length,breadth);
			System.out.println("Area of rectangle with length " +length+" and width "+breadth+ " is: "+result);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("IllegalArgumentException caught :"+e.toString());
		}
	}

}
