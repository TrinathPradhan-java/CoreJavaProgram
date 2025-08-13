package com.nit.lab.oop_ass13_feb;

import java.util.Scanner;

public class Employee {

	int employeeId;
	String firstName;
	String lastName;
	double salary;
	int noOfProject;
	
	public void setEmployeeData(int Id,String fName,String lName,int project,double sal) {
         employeeId = Id;
         firstName = fName;
         lastName = lName;
         salary = sal;
         noOfProject = project;
	}
	public void calculatedEmployeeSalary() {
		if(noOfProject >=5 && noOfProject<=10 ) {
			salary = salary + 5000;
		}
		else if(noOfProject >10 && noOfProject<=20) {
			salary = salary + 10000;
		}
		else if(noOfProject >20) {
			salary = salary + 15000;
		}
	}
	public void employeeDetails() {
		System.err.println("Emplyoee Id is : "+employeeId);
		System.err.println("Emplyoee First Name is : "+firstName);
		System.err.println("Emplyoee Last Name is : "+lastName);
		System.err.println("Emplyoee Salary is : "+salary);
		System.err.println("Emplyoee Total Project is : "+noOfProject);
	}
}
