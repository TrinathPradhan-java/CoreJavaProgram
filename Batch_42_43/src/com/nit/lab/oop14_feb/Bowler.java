package com.nit.lab.oop14_feb;

public class Bowler {

String name;
int wicket;
int matches;
int balls_bowled;
int runs_conceded;
double average;
double strikeRate;


public void bowlerDetails(String bowlerName,int totalWickets,int totalMatches,int totalBalls,int totalRuns) {
	name = bowlerName;
	wicket = totalWickets;
	matches = totalMatches;
	balls_bowled = totalBalls;
	runs_conceded = totalRuns;
}
public void computeBowlingAverage() {
	if(wicket>0 && matches >0 && balls_bowled >0 && runs_conceded >0) {
		average = (double)runs_conceded/wicket;
		strikeRate = (double) runs_conceded/balls_bowled;
		
		System.out.println("Name : "+name);
		System.out.println("Average : "+average);
		System.out.println("StrikeRate : "+strikeRate);
	}
	else if(runs_conceded>0 && balls_bowled>0  ) {
		if(matches ==0) {
			System.out.println("Error");
		}
		
		}
	else {
		System.out.println("error");
	}
	System.out.println("--------------------------------");
}
public void showDetails() {
	System.out.println("Name : "+name);
	System.out.println("No of Wicket : "+wicket);
	System.out.println("No of Matches : "+matches);
	System.out.println("total  Balls : "+balls_bowled);
	System.out.println("Total run : "+runs_conceded);
}




}


