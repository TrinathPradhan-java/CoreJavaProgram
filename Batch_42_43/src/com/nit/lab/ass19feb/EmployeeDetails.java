package com.nit.lab.ass19feb;
import java.util.*;

public class EmployeeDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee first name");
		String empfirstName = sc.nextLine();
		System.out.print("Enter employee Last name");
		String empLastName = sc.nextLine();
		
		System.out.print("Enter employee Salary");
		double salary = sc.nextDouble();
		System.out.print("Enter employee Id");
		int empId = sc.nextInt();
		System.out.print("Enter employee no of Project");
		int noOfProject = sc.nextInt();
		sc.close();
		
		Employee emp = new  Employee(empLastName, empLastName, noOfProject, salary, noOfProject);
	   if(noOfProject<=0) {
		   System.out.println("negative not allow "+emp.getSalary());
	   }
	   else {
		System.out.println("original data Employee"+emp);
		System.out.println("_____________________________________________________________________________");
		
		
		
		System.out.println("updating data");
		emp.calCulateSalary();
		System.out.println(emp.getSalary());
	}
	
	
		
		
		
		
		
		
		
		
		
		
		
	}
}
	
	
	     
	


