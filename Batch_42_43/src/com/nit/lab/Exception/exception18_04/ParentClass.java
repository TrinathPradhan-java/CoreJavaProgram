package com.nit.lab.Exception.exception18_04;

public class ParentClass 
{
public void loadingClass(String load)
{
	try {
	Class <?> clas =Class.forName(load);
	}
	catch(ClassNotFoundException e)
	{
		System.out.println("Enter right class");
	}
}
}
