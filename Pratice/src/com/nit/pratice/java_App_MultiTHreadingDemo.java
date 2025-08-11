package com.nit.pratice;

class Alpha extends Thread
{
	/*
	 * public void run() override method of Thread Class
	 */
	@Override
	public void run()
	{
		/*
		 * name of current Thread
		 */
		
		Thread t= Thread.currentThread();//it is ststic native method..
		String name = t.getName();
		
		/*
		 * b1 new object created in separate stack memory. .
		 * 
		 */
		Beta b1 = new Beta();//create new Thread 
		b1.setName("Beta Thread");//set the name of Thread.
		b1.start();//Runnable state.to run
		try
		{
			b1.join();
			System.out.println("Alpha Thread Restarted...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		for(int i =0;i<10;i++)
		{
			System.out.println(i+" "+name);
		}
	}
}

class Beta extends Thread
{
	/*
	 * override method declare 
	 */
	
	public void run()
	{
		
		
		Thread t2= Thread.currentThread();
		String name = t2.getName();
		
		for(int i=0;i<10;i++)
		{
			System.out.println(i+" "+name);
			try
			{
				sleep(1000);
				
			}
			catch(InterruptedException e)
			{
			   System.out.println(e.getMessage());
			}
		}
		System.out.println("Beta Thread Ended");
	}
}

public class java_App_MultiTHreadingDemo 
{

	public static void main(String[] args) 
	{
	Alpha a= new Alpha();
	a.setName("Alpha Thread");
	a.start();

	}

}
