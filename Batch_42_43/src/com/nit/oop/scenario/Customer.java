package com.nit.oop.scenario;

public class Customer 
{
//Initialized two instance variable or non static field.	
private String customerName;
private int creditpoint;
           //create a userdefined parametrized constructor.
           public Customer(String customerName,int creditpoint) 
           {
        	   //"this" is refers current object reference it points to  instance variable and non static field. 
        	   this.customerName = customerName;
        	   this.creditpoint = creditpoint;
           }         
                    //create userdefined method and return creditpoint.
                     public int getCreditPoint() 
                     {
                    	 //this.creditpoint refer to instance variable or non static field.
                    	 return this.creditpoint;
                     }
                     //To print Object properties (Instance Variable)

					@Override
					public String toString() {
						return this.customerName;
					}
                              
}
