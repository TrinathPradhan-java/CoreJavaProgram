package com.nit.encapsulation;
import java.util.*;

public class CustomerDetails {

	public static void main(String[] args) {
		//create input noof object
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of customer");
		int customer = sc.nextInt();
		
		//continous create object using loop.
		for(int i =0;i<customer;i++) {
		Customer ct = Customer.getCustomer();
		System.out.println(ct);
		}

		sc.close();
		
	}

}
