package com.nit.lab.ass_feb_21;

public class LoanDetails {
	public static void main(String [] args) {
		LoanPayment pay = new LoanPayment(100000, 5, 24);
		System.out.println(pay.claculateLoan());
		System.out.println(pay.getPrinciple());
		
	}

}
