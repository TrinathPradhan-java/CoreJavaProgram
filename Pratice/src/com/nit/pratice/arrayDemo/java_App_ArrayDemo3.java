package com.nit.pratice.arrayDemo;

import java.util.Arrays;
import java.util.Scanner;

public class java_App_ArrayDemo3 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);	
System.out.println("Enter size of array : ");
int size = sc.nextInt();
int arr[]=new int[size];
for(int i =0;i<arr.length;i++)
{
	System.out.println("Enter the element of  "+i+" index of");
	arr[i]=sc.nextInt();
}
System.out.println(Arrays.toString(arr));

for(int i=arr.length-1;i>=0;--i)//reverse logic...
{
	System.out.println(arr[i]);
}
}
}
