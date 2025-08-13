package com.nit.oop.scenario;

public class CardType 
{
	//initialized two instance variable or non static field
	private Customer customer;
	private String cardType;
	        // //create a userdefined parametrized constructor.
	        public CardType(Customer customer,String cardType) 
	        {
	        	//"this" is refers current object reference it points to  instance variable and non static field.
	        	this.customer = customer;
	        	this.cardType = cardType;
	        }

	      //To print Object properties (Instance Variable)
			@Override
			public String toString() {
				return "The Customer '"+ this.customer +"' Is Eligible For '"+ this.cardType + "' Card";
			}
	          //why this.customer -> because customer is Customer  object type variable   and it returns Customer object properties.
	                  
	

}
