package com.nit.lab.polymorphism.method_overriding;
import java.util.Scanner;

public class ShoppingMall 
{
 public static void main(String[] args) 
 {
	 System.out.println("Please select the Customer Type to get additional Discount :");
	    System.out.println("\t\t 1) General Customer ");
	    System.out.println("\t\t 2) Prime Customer ");
	    System.out.println("\t\t 3) VIP Customer ");
	    
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Please enter Customer type :");
	    int choice = sc.nextInt();
	    Customer customer = null;
	    
	    switch(choice)
	    {
	    case 1:
	    	System.out.println("Please Enter your Name :");
	    	String name = sc.nextLine();
	    	name = sc.nextLine();
	    	customer = new GeneralCustomer(name);
	    	System.out.println("Enter number of Items :");
	    	int item = sc.nextInt();
	    	double items[] = new double[item];
	    	System.out.println("Please Enter the Item Name and Price :");
	    	
	    	for(int i=0; i<items.length; i++)
	    	{	    		
	    		System.out.print(i+1+")Item Name :");
	    		String itemName = sc.nextLine();
	    		itemName = sc.nextLine();
	    		System.out.print("  Item Price :");
	    		int itemPrice = sc.nextInt();
	    		items[i] = itemPrice;	    		
	    	}
	    	generateBill(customer, items);    	
	    	
	    	break;
	    case 2:
	    	System.out.println("Please Enter your Name :");
	    	name = sc.nextLine();
	    	name = sc.nextLine();
	    	customer = new PrimeCustomer(name);
	    	System.out.println("Enter number of Items :");
	    	item = sc.nextInt();
	    	double items1[] = new double[item];
	    	System.out.println("Please Enter the Item Name and Price :");
	    	
	    	for(int i=0; i<items1.length; i++)
	    	{	    		
	    		System.out.print(i+1+")Item Name :");
	    		String itemName = sc.nextLine();
	    		itemName = sc.nextLine();
	    		System.out.print("  Item Price :");
	    		int itemPrice = sc.nextInt();
	    		items1[i] = itemPrice;	    		
	    	}
	    	generateBill(customer, items1);
	    	    	
	    	break;
	    	
	    case 3:
	    	System.out.println("Please Enter your Name :");
	    	name = sc.nextLine();
	    	name = sc.nextLine();
	    	customer = new PrimeCustomer(name);
	    	System.out.println("Enter number of Items :");
	    	item = sc.nextInt();
	    	double items2[] = new double[item];
	    	System.out.println("Please Enter the Item Name and Price :");
	    	
	    	for(int i=0; i<items2.length; i++)
	    	{	    		
	    		System.out.print(i+1+")Item Name :");
	    		String itemName = sc.nextLine();
	    		itemName = sc.nextLine();
	    		System.out.print("  Item Price :");
	    		int itemPrice = sc.nextInt();
	    		items2[i] = itemPrice;	    		
	    	}
	    	generateBill(customer, items2);
	    	
	    	
	    	break;
	    }    
     
 }

 
 public static void generateBill(Customer customer, double... prices)
 {
	 System.out.println("Welcome to Hyderabad Mall :");
     customer.calculateBill(prices);
     System.out.println();
 }
}