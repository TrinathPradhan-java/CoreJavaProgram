package com.nit.lab.Exception.exception14_04;

import java.util.Scanner;

import java.util.InputMismatchException;
public class SimpleExceptionDemo 
{

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	
	try
	{
		System.out.println("Enter a number 1 :");
		int a = sc.nextInt();
		System.out.println("Enter number 2 :");
		int b = sc.nextInt();
	System.out.println("You are entered "+a+" and "+b);
	}
	catch(InputMismatchException e1)
	{
		System.out.println("An InputMismatchException occurred.\r\n");
		System.out.println("Message :"+e1.getMessage());
		System.out.println("String representation :"+e1.toString());
		System.out.println("Stack Trace");
		e1.printStackTrace();
		
	}
	catch(Exception e1)
	{
		
	}

	}

}
