package com.nit.lab.jan_30th_01;

public class BasicSalary {

	public static void main(String[] args) {
		int basic = Integer.parseInt(args[0]);
		int hra = basic*15/100;
		int conavayallow = basic * 15/100;
		int entertainallo = basic * 10/100;
		int total= basic+ hra + conavayallow + entertainallo;
		
		
		
		System.out.println("total Basic_salary is  : "+total);
		
	}

}
