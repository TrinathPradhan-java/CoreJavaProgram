package com.nit.lab.oop14_feb;

public class Batter {
	
	String name;
	int matches;
	int runs;
	float battin_avg;
	
	
	public void batterDetails(String batterName,int totalMatches,int totalRuns) {
		
		name = batterName;
		matches = totalMatches;
		runs=totalRuns;
		
		
	}
	
	public void computeBattingAverage() {
		if(runs > 0 && matches >0) {
			battin_avg = (float)runs/matches;
			System.out.println("Name : "+name);
			System.out.println("Average : "+battin_avg);
			
		}
		else if(runs>0) {
			if(matches ==0) {
				System.out.println("Error");
			}
		}
		else {
			System.out.println("Error");
		}
		
		
		
	}
	public void getStatistics() {
		if(runs<0 && matches<0) {
			System.out.println("Error");
		}
		else if(runs >0 || matches == 0) {
			System.out.println("Error");
		}
		else {
			System.out.println("Name :"+name);
			System.out.println("Runs :"+runs);
			System.out.println("matches :"+matches);
			
		}

}
}