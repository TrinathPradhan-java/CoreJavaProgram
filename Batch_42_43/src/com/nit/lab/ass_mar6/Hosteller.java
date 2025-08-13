package com.nit.lab.ass_mar6;

public class Hosteller extends Student {
	protected double hostelFee;

	public Hosteller(int studentId, String name, double examFee,double hostelFee) {
		super(studentId, name, examFee);
		
		this.hostelFee=hostelFee;
	}

	@Override
	public String toString() {
		return "Hosteller [hostelFee=" + hostelFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";/*(super.toString())*/
	}
	public double payFee(double amount) {
	    double totalFee = super.payFee() /*(or payFee())*/+ hostelFee;
	    
	    return totalFee - amount;
	    
	}
	
	
	

	public String displayDetails() {
		return toString();
	}


	
	   

	
	
}
