package com.nit.pratice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThreadDemo2 
{
public static void main(String[] args) 
{
System.out.println("Main thread Exceute!");	
	Thread t1 = Thread.currentThread();
	t1.setName("Parent Thread!");
	
	Thread university=new Thread()
			{
		
		@Override
		public void run()
		{
			try
			{
				System.out.println("Child thread Execute!");
				String name = Thread.currentThread().getName();
				if(name !=null && name.equalsIgnoreCase("placement"))
				{
					this.PlacementBatch();
				}
				else if(name!=null && name.equalsIgnoreCase("Regular"))
				{
					this.Regular();
				}
				 System.out.println("Child thread Ended");
			}
			catch(InputMismatchException e)
			{
				System.out.println(e.getMessage());
			}
		}
			public void PlacementBatch()
			{
			System.out.println("I am Placement Batch....");	
			}
			public void Regular()
			{
				System.out.println("I am a Regular Batch Student.....");
			}
	        
			};
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter name Of batch : ");
			String name1= sc.nextLine();
			
		university.setName(name1);
		university.start();
		t1.start();
		System.out.println("Main Thread Ended!");
}
}
