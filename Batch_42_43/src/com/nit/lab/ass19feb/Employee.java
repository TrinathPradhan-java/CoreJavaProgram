package com.nit.lab.ass19feb;

public class Employee {
	String empfirstName;
	String empLastName;
	int empId;
	double salary;
	int noOfProject;
	
public Employee(String  empfirstName,String empLastName,int empId,double salary,int noOfProject) {
	this.empfirstName= empfirstName;
	this.empLastName=empLastName;
	this.empId = empId;
	this.salary=salary;
	this.noOfProject=noOfProject;
}
public void calCulateSalary() {
	
	if(noOfProject>=5 && noOfProject<10) {
		salary=salary+5000;
	}
	else if(noOfProject>=10 && noOfProject<20) {
		salary=salary+10000;
	}
	else if(noOfProject>=20) {
		salary=salary+15000;
	}
	else {
		System.out.println("no increment");
	}
	
}
public String getEmployeeFName() {
	return this.empfirstName;
}
public void setEmployeeFName(String empfirstName) {
	this.empfirstName = empfirstName;
}
public String getEmployeeLName() {
	return this.empLastName;
}
public void setEmployeeLName(String empLastName) {
	this.empLastName = empLastName;
	
}

public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getNoOfProject() {
	
	return noOfProject;
	
}
public void setNoOfProject(int noOfProject) {
	this.noOfProject = noOfProject;
}
@Override
public String toString() {
	return "Employee [empfirstName=" + empfirstName + ", empLastName=" + empLastName + ", empId=" + empId + ", salary="
			+ salary + ", noOfProject=" + noOfProject + "]";
}
	
	

}
