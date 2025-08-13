package com.nit.lab.ass19feb;

public class Batter {

	String name;
	int matches;
	int run;
	float batting_Avg;
	public Batter() {
		this.name=null;
		this.matches=0;
		this.run=0;
		this.batting_Avg=0.0f;
	}
	
	//initialize constructor 
	public Batter(String name,int matches,int run) {
		
		this.name= name;
		this.matches =matches;
		this.run = run;
		this.batting_Avg = batting_Avg;
		
	}
	//create batting_Average method to calculate batting average.
	public void batting_Average() {
		if(run<=0 && matches<=0) {
		System.err.println("Error");
		}
		else if(run>=0 && matches<=0) {
			System.err.println("Error");
		}
		else {
			batting_Avg=(float) run/matches;
			   System.out.println("Name: " + name);
		        System.out.println("Batting_Avg: " + batting_Avg);
		}
	}
	//getter method to return name value.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	
	@Override
	public String toString() {
		return "Batter [name=" + name + ", matches=" + matches + ", run=" + run + ", batting_Avg=" + batting_Avg + "]";
	}
	
	
}
