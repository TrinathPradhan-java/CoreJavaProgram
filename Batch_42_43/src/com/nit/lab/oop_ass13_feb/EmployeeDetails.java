package com.nit.lab.oop_ass13_feb;

public class EmployeeDetails {

	public static void main(String[] args) {
		Employee allen = new Employee();
	
		allen.setEmployeeData(101, "Allen", "Walker",25, 50000);
		allen.calculatedEmployeeSalary();
		allen.employeeDetails();

	}

}
