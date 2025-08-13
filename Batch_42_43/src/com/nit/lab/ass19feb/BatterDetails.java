package com.nit.lab.ass19feb;

import java.util.Scanner;

public class BatterDetails {

	public static void main(String[] args) {
		//Scanner class use  to input the user 
		Scanner sc = new Scanner(System.in);
		System.out.print("enter name of batsman");
		String name=sc.nextLine();
		int matches = sc.nextInt();
         int run = sc.nextInt();
         
        
         //create object 
         Batter bat = new Batter(name,matches,run);
         bat.batting_Average();
         //check condition name is empty or not and runs less 0 or not.
         if(name.isEmpty()) {
 			System.err.println("Error");
 		}
 		else if(run<0) {
 			System.err.println("error");
 		}
 		else {
 			System.out.println(bat);
 		}
        
	}

}
