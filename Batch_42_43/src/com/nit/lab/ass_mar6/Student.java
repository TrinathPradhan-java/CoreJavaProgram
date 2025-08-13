package com.nit.lab.ass_mar6;



public class Student {
	protected int studentId;
	protected String name;
	protected double examFee;
	
	public Student(int studentId,String name,double examFee) {
		if(studentId <=0 && examFee<=0) {
			System.out.println("Invalid");
			System.exit(0);
		}
		else {
		this.studentId = studentId;
		this.name = name;
		this.examFee=examFee;
		}
		
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + ", displayDetails()="
				+ displayDetails() + ", payFee()=" + payFee() + "]";
	}

	public String displayDetails() {
		
 		
		return toString();
	}

	public double payFee() {
		return examFee ;
	}
	

}
