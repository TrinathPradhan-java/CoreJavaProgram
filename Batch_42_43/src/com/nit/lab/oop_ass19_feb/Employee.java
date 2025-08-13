package com.nit.lab.oop_ass19_feb;

public class Employee {
String eFName;
String eLName;
int employeeId;
double salary;
int noOfProject;
public Employee(String eFName, String eLName, int employeeId, double salary, int noOfProject) {
	super();
	this.eFName = eFName;
	this.eLName = eLName;
	this.employeeId = employeeId;
	this.salary = salary;
	this.noOfProject = noOfProject;
}
public String geteFName() {
	return eFName;
}
public void seteFName(String eFName) {
	this.eFName = eFName;
}
public String geteLName() {
	return eLName;
}
public void seteLName(String eLName) {
	this.eLName = eLName;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
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
	return "Employee [eFName=" + eFName + ", eLName=" + eLName + ", employeeId=" + employeeId + ", salary=" + salary
			+ ", noOfProject=" + noOfProject + "]";
}




}
