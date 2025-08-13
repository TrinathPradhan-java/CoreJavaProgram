package com.nit.lab.Exception.exception14_04;

public class ArrayIndexExceptionDemo 
{

	public static void main(String[] args) 
	{
		try
		{
			int a[] = new int[2];
			System.out.println(a[3]);
			
		}
		catch(ArrayIndexOutOfBoundsException e )
		{
			System.out.println("An ArrayIndexOutOfBoundsException occurred.");
			System.out.println("Message :"+e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		   	
		}

	}

}
