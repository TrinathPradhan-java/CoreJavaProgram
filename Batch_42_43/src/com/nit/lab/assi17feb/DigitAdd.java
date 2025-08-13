package com.nit.lab.assi17feb;
import java.util.Scanner;

public class DigitAdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int num = sc.nextInt();		
		System.out.println(SumofDigits.twoDigitSum(num));		
		sc.close();

	}

}
