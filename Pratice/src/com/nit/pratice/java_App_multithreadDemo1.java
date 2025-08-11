package com.nit.pratice;


class TatkalTicket implements Runnable
{
	
	@Override
	public void run()
	{
		String t1= Thread.currentThread().getName();
		System.out.println("TatkalTicketBooking !!!");
	}
}

class LocalTicket implements Runnable
{
	
	@Override
	public void run()
	{
		String t1= Thread.currentThread().getName();
		System.out.println("LocalTicketBooking !!!");
	}
}


class GeneralTicket implements Runnable
{
	
	@Override
	public void run()
	{
		String t1= Thread.currentThread().getName();
		System.out.println("GeneralTicketBooking !!!");
	}
}














public class java_App_multithreadDemo1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		Thread allen= new Thread(new TatkalTicket(),"Allen");
		Thread scott= new Thread(new GeneralTicket(),"Scott");
		Thread smith= new Thread(new TatkalTicket(),"Smith");
		

		allen.start();
		scott.start();
		scott.join();
		smith.start();
	}

}
