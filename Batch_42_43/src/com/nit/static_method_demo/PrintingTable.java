package com.nit.static_method_demo;

import java.util.Scanner;

public class PrintingTable {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number upto which you want to print :");
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++)//creating for input table 
        {
        	Table.printTable(i);
        }
        
        sc.close();
		
	}

}
