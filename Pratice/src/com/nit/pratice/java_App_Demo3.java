package com.nit.pratice;

public class java_App_Demo3 
{
public static void main(String[] args) {
	Runnable r1 = new Runnable()
			{
		public void run()
		{
			String ame = Thread.currentThread().getName();
			System.out.println("name of thread is"+ame);
		}
			};
			Thread t1= new Thread(r1,"Child Thread");
			t1.start();
}
}
