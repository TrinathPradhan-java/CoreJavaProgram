package com.nit.String;

public class java_App_StringDemo1 
{

	public static void main(String[] args) throws InterruptedException
	{
		
	
		//java_App_StringDemo1 obj=new java_App_StringDemo1("gudu");
//		str="rama";
//		Local local=new Local();
//		local.print();
//		
		
	
//	String a="Trinath";
//	a="hari";
//	String b =  a;
//	b ="Rama";
		
		
//		String a ="trinath";
//		System.out.println("Uppercase is : "+a.toUpperCase());
//		/*
//		 * concat is nonstatic predefined function if current String is Empty then it return empty and if current String is value then it return helpermethod obj and simple String.
//		 */
//		System.out.println("Concat Two String : "+a.concat("Java"));
//	System.out.println("a output is : "+a);
	

	//System.out.println("b output is : "+b);
	
		
		
		
		
	
	
	
//	static String  str;
//	
//	static class Local
//	{
//		void print()
//		{
//			System.out.println(str.toUpperCase());
//		};
		/*
		 * WAP in Java that describes String objects created by using String literals are not eligible for Garbage Collector.
		 */
	
	String str ="Rama";
	System.out.println("1st : "+str.hashCode());
	str=null;
	System.gc();
	Thread.sleep(5000);
	System.out.println(str);
	String str2="Rama";
	System.out.println("2nd : "+str2.hashCode());
	}
	
}
