
package com.nit.lab.assi17feb;


public class SumofDigits {
	
	
	public  static int twoDigitSum(int num) {
		int sum=0;
		while(num >0) {
			 sum  = sum +  num%10;
			num = num/10;
		}
		
		
	return sum;	
	}
	

}
