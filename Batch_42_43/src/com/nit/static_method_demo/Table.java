package com.nit.static_method_demo;

public class Table {

	 public static void printTable(int num) //10 X 1 = 10
	   {
		  for(int i=1; i<=10; i++)
		  {
			  System.out.println(num+" X "+i+" = "+(num*i));
		  }
		  System.out.println("...........................");
	   }
	
}
