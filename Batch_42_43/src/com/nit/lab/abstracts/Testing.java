package com.nit.lab.abstracts;

import java.util.Scanner;

public class Testing 
{
	public static void main(String[] args)
	{
	
      Scanner sc = new Scanner(System.in);
      System.out.println("1 - Bread Type");
      System.out.println("2 - Egg Type");
      System.out.println("Plese Enter your Type");
      int type = sc.nextInt();
      switch(type)
      {
      case 1:
    	  
    	  System.out.println("enter  proteins");
    	  double proteins = sc.nextDouble();
    	  System.out.println("enter fats ");
    	  double fats = sc.nextDouble();
    	  System.out.println("enter carbs ");
    	  double carbs = sc.nextDouble();
    	  Food f1 = new Bread(proteins, fats, carbs);
    	  Bread e =(Bread)f1;  
    	  System.out.println(type+" is Breed");
    	  System.out.println(f1.getClass().getSimpleName()+" is "+e.getType());
    	  f1.getMacroNutrients();
    	  break;
      case 2:
    	  System.out.println("enter  proteins");
    	   proteins = sc.nextDouble();
    	  System.out.println("enter fats ");
    	   fats = sc.nextDouble();
    	  System.out.println("enter carbs ");
    	   carbs = sc.nextDouble();
    	  Food f2 = new Egg(proteins, fats, carbs);
    	   Egg e1 =(Egg)f2;  
    	  System.out.println(type+" is Egg");
    	  System.out.println(f2.getClass().getSimpleName()+" is "+e1.getType());
    	  f2.getMacroNutrients();
    	         
      }

	}

}