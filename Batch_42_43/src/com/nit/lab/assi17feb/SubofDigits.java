package com.nit.lab.assi17feb;


public class SubofDigits {
	
	
	public  static int twoDigitSub(int num) {
		int sub=0;
		while(num >0) {
			 sub  =  num%10-sub;
			num = num/10;
		}
		
		
	return sub;	
	}
	

}
