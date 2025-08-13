package com.nit.lab.abstract02_april;

import java.util.Scanner;


public class ProductStore {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1)Digital Product  \n  2)Physical Product");
		System.out.println("Enter a choice");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter name of book :");
			String name = sc.nextLine();
			name = sc.nextLine();
			System.out.println("Enter a price :");
			double price = sc.nextDouble();
			System.out.println("Enter Catagory :");
			String catagory = sc.nextLine();
			catagory = sc.nextLine();
			System.out.println("Enter Licence :");
			String licence = sc.nextLine();
			System.out.print("Enter discount :");
			int discount = sc.nextInt();
			
		DigitalProduct dp = new DigitalProduct(name, price, catagory, licence);
		System.out.println(dp);
		dp.applyDiscount(discount);
		System.out.println("Tax is :"+dp.calculateTax());
		
		
		break;
		
		case 2:System.out.println("Enter name of book :");
		String name1 = sc.nextLine();
		name1 = sc.nextLine();
		System.out.println("Enter a price :");
		double price1 = sc.nextDouble();
		System.out.println("Enter Catagory :");
		String catagory1 = sc.nextLine();
		catagory1 = sc.nextLine();
		System.out.println("Enter Shhiping  :");
		double shipping = sc.nextInt();
		System.out.print("Enter discount :");
		int discount1 = sc.nextInt();
		
		PhysicalProduct pp = new PhysicalProduct(name1, price1, catagory1, shipping);
	System.out.println(pp);
	pp.applyDiscount(discount1);
	System.out.println("Tax is :"+pp.calculateTax());
	
	System.out.println("Shipping value is :"+pp.calculateShippingCost());
			
		}

	}

}
