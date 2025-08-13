package com.nit.lab.abstracts.assignment27_03;
import java.util.Scanner;
public class CakeOrder {

	public static void main(String[] args) 
	{ 
		
		
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter [1/2/3]");
	  Cake c =null;
	int ch = sc.nextInt();
	switch(ch)
	{
	case 1:
		 c= new OrderedCake();
		 System.out.println(c);
		 
		 break;
		 
	case 2:
		System.out.println("Enter shape");
		String shape = sc.nextLine();
		shape = sc.nextLine();
		System.out.println("Enter flavor");
		String flavor = sc.nextLine();
		System.out.println("Quantity");
		int quantity = sc.nextInt();
		
		c= new OrderedCake(shape,flavor,quantity);
		System.out.println(c);
		
		break;
		
	case 3:
		
		System.out.println("Enter shape");
		String shape1 = sc.nextLine();
		shape1 = sc.nextLine();
		System.out.println("Enter flavor");
		String flavor1 = sc.nextLine();
		System.out.println("Quantity");
		int quantity1 = sc.nextInt();
		System.out.println("Enter message");
		sc.nextLine();
		String msg = sc.nextLine();
		
		c= new OrderedCake(shape1,flavor1,quantity1,msg);
		System.out.println(c);
		c.setPrice();
		
		/*OrderedCake cake3= new OrderedCake(shape1,flavor1,quantity1,msg);
		System.out.println(cake3);*/
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
}