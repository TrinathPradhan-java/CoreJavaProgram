package com.nit.pratice.arrayDemo;

import java.util.Arrays;

public class java_App_ArrayDemo 
{
public static void main(String[] args) 
{
int [] x = new int[3];
 x[0]=10;
 x[1]=20;
 x[2]=30;

 
 System.out.println("Print array for loop!");
 System.out.println("[");
 /*
  * Using ordinary loop to extract all value of arry
  */
 for(int i =0;i<3;i++)
 {
	 System.out.print(x[i]+",");
 }
 System.out.println("]");
 
 
 
 /*
  * using for each loop to fetch all value of array.
  */
 System.out.println("Using for each loop!");
 int y[]= {10,40,200};
 for(int arr:y)
 {
	 System.out.println(arr);
 }
 
 
 
 /*
  * By using toString method to print array."public static String toString(int[] a)".always useing  this method to print arrays.
  */
 
 System.out.println("print array using toString!");
 
 int z[]= new int[] {100,200,300};
 /*
  * int z[] is object type array ,if we declared those type then arry is default length.
  */
 
 System.out.println(Arrays.toString(z));
}
}
