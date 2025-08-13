package com.nit.lab.polymorphism;

public class Employee {
	  private double hoursWorked;
	    private double hourlyRate;
	    private double annualSalary;
	    private double salesAmount;
	    private int commissionRate;

	   
	    public Employee(double hoursWorked, double hourlyRate) {
	        this.hoursWorked = hoursWorked;
	        this.hourlyRate = hourlyRate;
	    }

	 
	    public Employee(double annualSalary) {
	        this.annualSalary = annualSalary;
	    }

	    public Employee(double salesAmount, int commissionRate) {
	        this.salesAmount = salesAmount;
	        this.commissionRate = commissionRate;
	    }

	   
	    public double calculateSalary() {
	        return hoursWorked * hourlyRate;
	    }

	   
	    public double calculateSalary(double annualSalary) {
	        return annualSalary / 12;
	    }

	  
	    public double calculateSalary(double salesAmount, double commissionRate) {
	        return salesAmount * commissionRate;
	    }
	}




