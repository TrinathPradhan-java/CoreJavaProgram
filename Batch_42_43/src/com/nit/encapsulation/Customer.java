package com.nit.encapsulation;
import java.util.*;
public class Customer
{
	//Instance variable declare with private keyword
	private int customerId;
	private String customerName;
	private double salary;
	//create userdefined constructor
	public Customer (int customerId,String customerName,double salary) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.salary = salary;
	}
     //print all properties of object.
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", salary=" + salary + "]";
	}
	//customer details in user.
	public static Customer getCustomer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter customer id :");
		int id = sc.nextInt();//new declaration because cannot nonstatic field declare inside static method.
		System.out.print("Enter customer name :");
		String name = sc.nextLine();
		name = sc.nextLine();//using buffer problem to solve
		System.out.print("Enter customer salary :");
		double bill = sc.nextDouble();
		//create customer.
		Customer cust = new Customer(id,name,bill);
		return cust;
		
	}
		
		
	
}
