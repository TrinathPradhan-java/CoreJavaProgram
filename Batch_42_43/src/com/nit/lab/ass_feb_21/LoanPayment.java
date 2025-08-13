package com.nit.lab.ass_feb_21;

public class LoanPayment {
	private double principle;
	private double intrestRate;
	private int monthDuration;
	
	
	public LoanPayment(double principle, double intrestRate, int monthDuration) {
		if(principle==0 || intrestRate==0 || monthDuration==0) {
			System.err.println("Error");
		}
		else {
		this.principle = principle;
		this.intrestRate = intrestRate;
		this.monthDuration = monthDuration;
		}
	}


	public double claculateLoan() {//formula=                   intrestRate*(1+intrestRate)^duration
		                            //         principle     *    -------------------------------------
		                            //                          (1+intrestRate)^duration -1
		 double monthlyRate = (intrestRate / (12*100)) ;
		    double numerator = principle * monthlyRate * Math.pow(1 + monthlyRate, monthDuration);
		    double denominator = Math.pow(1 + monthlyRate, monthDuration) - 1;
		    return numerator / denominator;
		
	}
	public double getPrinciple() {
		return this.principle;
	}
	
	
}
