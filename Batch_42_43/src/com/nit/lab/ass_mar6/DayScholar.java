package com.nit.lab.ass_mar6;

public class DayScholar extends Student {
protected double transportFee;

public DayScholar(int studentId, String name, double examFee,double transportFee) {
	super(studentId, name, examFee);
	this.transportFee = transportFee;
	
}
public double payFee(double amount) {
    double totalFee = super.payFee() + transportFee;
    return amount - totalFee;
}


}
