package com.nit.lab.Exception.exception16_04;

public class ClassCastExceptionDemo 
{
public static void handleClassCastException() 
{
	Object arr[] = {"java",true,"Welcome"};
	for (int i = 0; i < arr.length; i++) {
        try {
            String s = (String) arr[i]; // Risky cast
            System.out.println("Type casting successfully: " + s);
        } catch (ClassCastException e) {
        	//getClass() print fullyqulifiedname and getname() print cla
            System.out.println("ClassCastException: Cannot cast " + arr[i].getClass().getName() + " to String.");
            e.printStackTrace(); // Optional: Shows the full stack trace
        }
	}
}
public static void main(String [] args)
{
	
	handleClassCastException();
	
	
}
}
