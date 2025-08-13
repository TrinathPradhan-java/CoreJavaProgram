package com.nit.lab.jan_30th_01;

public class Palindrom {
	
	public static void main(String [] args){
		int x = 121;
		int y= x/100;
		int z = (x%100)/10;
		int c = (x%100)%10;
		int total = c*100 +z*10+y;
		if(x==total) {
			System.out.println("number is palindrom : "+total);
		}
		
		else {
			System.out.println("number is not palindrom :" +total);
		}
		}

		

}
