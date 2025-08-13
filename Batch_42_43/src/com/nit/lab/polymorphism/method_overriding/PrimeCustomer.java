package com.nit.lab.polymorphism.method_overriding;

class PrimeCustomer extends Customer 
{
 protected double discountRate = 10.0; 

 public PrimeCustomer(String name) 
 {
     super(name);
 }

 @Override
 public void calculateBill(double... prices) 
 {
     double total = 0;
     for (double price : prices) 
     {
    	 if (price < 0) 
         {
             System.out.println("Item price cannot be negative.");
             System.exit(0);
         }
         total += price;
     }
     double discount = (total * discountRate) / 100;
     double finalAmount = total - discount;

     System.out.println("Customer: " + name);
     System.out.println("Total cost RS :" +  total);
     System.out.println("Discount RS :" + discount);
     System.out.println("Final amount RS :" + finalAmount);
 }
}

