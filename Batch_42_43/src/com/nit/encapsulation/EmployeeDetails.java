package com.nit.encapsulation;
import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Id :");
		int id = sc.nextInt();
		System.out.print("Enter Employee Name :");
		String name = sc.nextLine();
		name = sc.nextLine();
		System.out.print("Enter Employee Salary :");
		double salary  = sc.nextDouble();
		
		Employee scott = new Employee(id, name, salary);
		System.out.println("Original Data :"+scott);
		
		System.out.print("Enter the updated Salary :");
		double increment = sc.nextDouble();
		
		if(increment <= 0)
		{
			System.err.println("Increment amount must be positive");
		}
		else
		{		
		scott.setEmployeeSalary(scott.getEmployeeSalary() + increment);
		System.out.println("After Salary Increment :"+scott);
		}
		
		/*Based on the Salary print whether the Employee is Developer, Designer
		  OR Tester
		   Salary >= 50000  -> Developer
		   Salary >= 35000  -> Designer
		   else Tester		
		*/
		
		double employeeSalary = scott.getEmployeeSalary();
		
		if(employeeSalary >=50000)
		{
			System.out.println(scott.getEmployeeName()+" is a Developer");
		}
		else if(employeeSalary >=35000)
		{
			System.out.println(scott.getEmployeeName()+" is a Designer");
		}
		else
		{
			System.out.println(scott.getEmployeeName()+" is a Tester");
		}		
		sc.close();		
	}

}
