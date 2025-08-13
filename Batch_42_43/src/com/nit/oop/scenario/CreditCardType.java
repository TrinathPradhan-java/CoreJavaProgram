package com.nit.oop.scenario;
import java.util.*;

public class CreditCardType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Customer Name : ");
		String customerName = sc.nextLine();
		System.out.print("Enter credit point : ");
        int creditpoint = sc.nextInt();
        
        Customer c1 = new Customer(customerName, creditpoint);
        CardType offerCard = CardsOnOffer.getOfferedCard(c1 );
        System.out.println(offerCard);
        
        
	}

}
