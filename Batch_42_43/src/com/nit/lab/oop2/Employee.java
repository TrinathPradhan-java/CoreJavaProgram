package com.nit.lab.oop2;
import java.util.*;

public class Employee {

	int employeeId;//instance variable or non-static field
	String employeeName;
	double employeeSalary;
	
	
	public void setEmployeeDetails() {
		/*employeeId = id;
		employeeName = name;
		employeeSalary = salary;*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee ID");
		employeeId= sc.nextInt();
		System.out.print("Enter employee name");
		employeeName = sc.next();
		System.out.print("Enter employee salary");
		employeeSalary = sc.nextDouble();
	}
	public void getEmployee() {
		System.out.println("--------------------------------------");
			System.out.println("After printing product is");
			System.out.println("---------------------------------");

		System.out.println("Print product ID : "+employeeName);
		System.out.println("Print product Name : "+employeeId);
		System.out.println("Print product price : "+employeeSalary);
		
		System.out.println("--------------------------------------");}
	
	
}
