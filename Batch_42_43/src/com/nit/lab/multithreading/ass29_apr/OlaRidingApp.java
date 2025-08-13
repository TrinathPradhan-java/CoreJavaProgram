package com.nit.lab.multithreading.ass29_apr;

public class OlaRidingApp 
{

	public static void main(String[] args) throws Exception
	{
		//RideRequest ride = new RideRequest();
		
		FareCalculation fare = new FareCalculation();
		Thread t5 = new Thread(fare);
		Thread t1 = new Thread()
				{
			@Override
			  public void run()
			  {
				System.out.println("User requested a Ride......");
				try
				{
					
					Thread.sleep(2000);
					
					System.out.println("Searching for near Drivers!!!");
				}
				catch(Exception e)
				
				{
					System.out.println(e);
				}
				 
			  }
				};
		t1.start();
		t5.start();
		t1.join();
		//t5.join();
		
		DriverAssignment driver = new DriverAssignment();
		Thread t6 = new Thread(driver);
		
		t6.start();
		t6.join();
		
		
		LiveTracking track =new LiveTracking();
		Thread t3 = new Thread(track);
		t3.start();
		t3.join();
		
		
		
		PaymentProcessing ppro= new PaymentProcessing();
		Thread t2 = new Thread(ppro);
		t2.start();
		t2.join();
		
		
		
		
		Thread t4 = new Thread()
				{
			@Override
			public void run()
			{
				System.out.println("Requiesting user rating ....");
				try
				{
					Thread.sleep(1000);
					System.out.println("User rated the ride: 5 star");
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
				};
				
				t4.start();
				//t4.join();
		

	}

}
