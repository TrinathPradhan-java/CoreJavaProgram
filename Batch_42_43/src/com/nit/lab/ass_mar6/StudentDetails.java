package com.nit.lab.ass_mar6;

import java.util.Scanner;

public class StudentDetails {
	
	
 	public static void main(String[] args) {
 		
 		
 		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter Id ");
 		int id = sc.nextInt();
 		sc.nextLine();
 		System.out.print("Enter name ");
 		String name = sc.nextLine();
 		System.out.print("Enter exam fee ");
 		double examFee= sc.nextDouble();
 		System.out.print("Enter hostel Fee ");
 		double hostelFee = sc.nextDouble();
 		if(id <=0) {
 			
 			System.out.println("Invalid");
 			System.exit(0);
 		}
 		else {
 		Hosteller host = new Hosteller(id,name,examFee,hostelFee);
 		System.out.println(host);
 		System.out.print("Enter a payement");
 		double amount = sc.nextDouble();
 		double remainpay = host.payFee(amount);
 	if(remainpay == 0) {
 		System.out.println("payment Clear");
 	}
 	else {
 		System.out.println("remain Balance "+remainpay);
 	      }
 	}
 		
 	
}
 		

}

