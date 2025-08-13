package com.nit.lab.Exception.exception14_04;
import java.util.Scanner;
public class NullAndNumberException {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String ");
	String name= sc.nextLine();
	handleException(name);

	}
	public static  void  handleException(String name)
	{
		try 
		{
			
			String nullCheck = name.equals("null") ? null : name;

            // Attempt to print the length of the string
            System.out.println("Length of the input string: " + nullCheck.length());


			//System.out.println(name.length());
			int number = Integer.parseInt(name);
			
		}
		catch(NumberFormatException e1)
		{
			System.out.println("Enter valid number");
		}
		catch(NullPointerException e1)
		{
			
			System.out.println(" String is Empty");
			System.out.println(e1.getMessage());		}
		
		
		
	}

}
