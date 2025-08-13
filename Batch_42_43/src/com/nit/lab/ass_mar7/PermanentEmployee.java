package com.nit.lab.ass_mar7;

public class PermanentEmployee extends Employee {
	protected double providentfund;

public PermanentEmployee(int employeeId, String employeeName, double employeeSalary) {
	super(employeeId, employeeName, employeeSalary);

}

public void setProvidentfund() {
	providentfund = employeeSalary*0.12;
}




public double netSalary() {
	double salary = (double)employeeSalary+providentfund; 
	return salary;
}

@Override
public String toString() {
	return "PermanentEmployee [providentfund=" + providentfund + ", employeeId=" + employeeId + ", employeeName="
			+ employeeName + ", employeeSalary=" + employeeSalary + ", netSalary()=" + netSalary() + "]";
}




}
