package com.nit.pratice.arrayDemo;

import java.util.Arrays;
import java.util.Scanner;

class MinDemo
{
	public static void findMin(int x[])
	{
		int min=x[0];
		
		for(int i=0;i<x.length;i++)
		{
			if(min>x[i])
			{
                  min=x[i];
			}
			
		}
		System.out.println(min);
		
	}
}





public class java_App_Min_ArrayDemo4 {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array Size");
	int size= sc.nextInt();
	
	int arr[]= new int[size];
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("Enter "+i+ "index in array ");
		
		
		 arr[i]=sc.nextInt();
	}
	System.out.println(Arrays.toString(arr));
	
	MinDemo.findMin(arr);
	
	System.out.println("===================================================");
	
	/**
	 * new Approach to find min of array.
	 * ----------------------------------
	 */

	System.out.println("New Approach to find min");
	
	Arrays.stream(arr).min().ifPresent(System.out::println);
	System.out.println(Arrays.stream(arr).sum());;
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
