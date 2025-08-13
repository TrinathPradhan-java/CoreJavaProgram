package com.nit.lab.abstracts01_04;
import java.util.Scanner;

public class CalculateAll
{
public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	Shape sh = null;
	System.out.println("Type" );
	System.out.println("1)Rectangle /n 2)Circle /n 3)Triangle");
	String Type = sc.nextLine();
	switch(Type)
	{
	case "Rectangle":
		sh= new Rectangle(30.3,45.4);
		sh.printDetails();
		break;
		
	case "Circle":
		sh = new Circle(23.2);
		sh.printDetails();
		break;
		
	case "Triangle":
		sh= new Triangle(146.2,40.0);
		sh.printDetails();
		
	}
	
}
}



