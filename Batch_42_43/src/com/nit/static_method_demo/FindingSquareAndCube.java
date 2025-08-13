package com.nit.static_method_demo;

import java.util.Scanner;

public class FindingSquareAndCube {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number ");
		int num = sc.nextInt();
     int result =Calculate.getCubeandSquare(num);
     System.out.println(result);
     sc.close();
	}
	
	
}
