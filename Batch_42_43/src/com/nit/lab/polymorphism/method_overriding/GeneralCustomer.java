package com.nit.lab.polymorphism.method_overriding;


class GeneralCustomer extends Customer 
{
 public GeneralCustomer(String name) 
 {
     super(name);
 }

 @Override
 public void calculateBill(double... prices) 
 {
     super.calculateBill(prices); 
 }
}