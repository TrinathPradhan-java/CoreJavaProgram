package com.nit.oop.scenario;

public class CardsOnOffer {
	
	public static CardType getOfferedCard(Customer cust) 
	{
		int creditpoint = cust.getCreditPoint() ;
		if(creditpoint >= 100 && creditpoint <= 500)
		{
			return new CardType(cust,"Silver");
		}
		else if(creditpoint >= 501 && creditpoint <= 1000)
		{
			return new CardType(cust,"Gold");
		}
		else if( creditpoint >=1001) {
			return new CardType(cust,"Plantinum");
		}
		else
		{
			return new CardType(cust,"EMI");
		}
	}
	

}
