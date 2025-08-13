package com.nit.lab.Exception.exception16_04;

public class ClassNotFoundExpDemo 
{
public ClassNotFoundExpDemo(String name)
{
	try {
	Class<?> cls = Class.forName(name);
	 System.out.println("Class '" + name + "' found: " + cls.getName());
	//throw new ClassNotFoundException();
	}
	catch(ClassNotFoundException e)
	{
		System.out.println("");
		e.printStackTrace();
	}
	
}
	public static void main(String[] args) 
	{
		
     new ClassNotFoundExpDemo("java.util.ArrayList");
	}

}
