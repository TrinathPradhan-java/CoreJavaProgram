package com.nit.lab.functionalInterface10_04;
import java.util.Scanner;
import java.util.function.*;


public class ValueModifier 
{
	public static void modifyValue(int value,Consumer<Integer> cansumer)
	{
		 cansumer.accept(value);
	}

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number : ");
	int number = sc.nextInt();
	
	Consumer<Integer> doubleValue = n -> System.out.println(n+n);
	Consumer<Integer> incrementValue = n-> System.out.println(n+3);
	Consumer <Integer> squareValue = n->System.out.println(Math.pow(number, 2));
	
	

	modifyValue(number,doubleValue);
	modifyValue(number,incrementValue);

	modifyValue(number,squareValue);

	}

}


