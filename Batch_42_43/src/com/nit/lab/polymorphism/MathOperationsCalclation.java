package com.nit.lab.polymorphism;

import java.util.Scanner;
public class MathOperationsCalclation {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		MathOperations m = new MathOperations();
		 
	       
	        System.out.print("Enter choise [1/2/3/4]:");
	        int ch = scanner.nextInt();
	         if(ch ==1) {
	      
	        System.out.print("Enter num1 ");
	        int num1 = scanner.nextInt();
	        System.out.print("Enter num2 ");
	        int num2 = scanner.nextInt();
	        int result = m.addNumber(num1,num2);
	        
	            System.out.println("Addtion number " + result);
	         }
	         
	         else if(ch==2) {
	        	 System.out.print("Enter num1 ");
	 	        double num1 = scanner.nextDouble();
	 	        System.out.print("Enter num2 ");
	 	        double num2 = scanner.nextDouble();
	 	       double result = m.addNumber(num1,num2);
	            System.out.println("Addition is :"+result);
	        
	         }
	         
	         else if(ch==3) {

	 	        System.out.print("Enter num1 ");
	 	        int num1 = scanner.nextInt();
	 	        System.out.print("Enter num1 ");
	 	        int num2 = scanner.nextInt();
	 	       int result = m.addNumber(num1,num2);
	            System.out.println("Multiplication is" +result);
	        }
	        

	        scanner.close();
	    }



}

	
	
