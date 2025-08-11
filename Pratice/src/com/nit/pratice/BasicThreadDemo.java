package com.nit.pratice;




public class BasicThreadDemo 
{
public static void main(String[] args) 
{
	Thread demo = new Thread()
			{
		     @Override
		     public void run()
		     {
		    	 String name = Thread.currentThread().getName();
		    	 System.out.println("Current Thread name : "+name);
		     }
			};
			//Create main thread name....
			Thread t1 = Thread.currentThread();
//			Thread t1 = new Thread();
//		t1.currentThread();
			String name=Thread.currentThread().getName();
			System.out.println("name of main thread :"+name);
			
			
			
			demo.setName("child thread");
			t1.setName("parent!");
			demo.start();
			String name1 =Thread.currentThread().getName();
			System.out.println(name1);
			
			System.out.println("Main thread execute...");
			
}
}
