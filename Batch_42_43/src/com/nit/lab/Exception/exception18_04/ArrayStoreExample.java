package com.nit.lab.Exception.exception18_04;

public class ArrayStoreExample 
{

	public static void storeObjects()
	{
		Object arr[] = {"java",123,"world"};
		for(Object ar : arr )
		try {
			
			
				String str = (String) ar;
				
			
			System.out.println("String is "+str);
		 
		}
		catch(ClassCastException e)
		{
			System.out.println(e.getClass().getName());
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
	storeObjects();	

	}

}
