package com.nit.lab.assi17feb;

public class SumofThreeRounded {
	public static int sumOfRoundedValues(int num1,int num2,int num3) {
		return num1+num2+num3;
	}
		
		public static int roundedofSum(int num) {
			
			int remainder = num%10;
			if(remainder<5) {
			return num-remainder;
			}
			else {
				return num + (10 - remainder);
			}
			
		
		
		
		
	}

}
