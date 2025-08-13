package com.nit.static_method_demo;

import java.util.Scanner;

public class FindingAreaOfCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a radius ");
		double radius = sc.nextDouble();
		String areaofCircle = AreaOfCircle.getAreaOfCircle(radius);
		float area = Float.parseFloat(areaofCircle);
		System.out.printf("Area of Circle is :%.2f",area);
		sc.close();

	}

}
