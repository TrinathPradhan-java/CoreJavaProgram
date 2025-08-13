package com.nit.lab.polymorphism.method_overriding;
import java.util.Scanner;

class Customer 
{
 protected String name;

 public Customer(String name) 
 {
     if (name == null || name.isEmpty()) 
     {
         System.err.println("Customer name cannot be empty.");
         System.exit(0);
     }
     this.name = name;
 }

 // Method to calculate total and discount, to be overridden
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
     System.out.println("Customer: " + name);
     System.out.println("Total cost RS : " + total);
     System.out.println("Discount: No discount for regular customers.");
 }
}
