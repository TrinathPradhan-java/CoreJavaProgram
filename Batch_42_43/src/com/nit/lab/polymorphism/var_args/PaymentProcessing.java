package com.nit.lab.polymorphism.var_args;

public class PaymentProcessing 
{
	public static void paymentGateway(Payment...payments )
	{
		for(Payment x :payments)
		{
			x.processPayment();
		}
	}
	public static void main(String[] args) 
	{
		
	Payment creditCard = new CreditCardPayment();
	Payment debitCard = new DebitCardPayment();
	Payment  upiPay = new UPIPayment();
	paymentGateway(creditCard,debitCard,upiPay);
		

	}
	


}
