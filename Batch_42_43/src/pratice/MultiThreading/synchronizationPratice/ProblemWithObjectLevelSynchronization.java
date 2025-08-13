package pratice.MultiThreading.synchronizationPratice;





class Prinatble
{
	public synchronized void printable(int x)
	{
		for(int i =1;i<=10;i++)
		{
			System.out.println("print the number : "+(x*i));
			
			try {
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
public class ProblemWithObjectLevelSynchronization 
{

	public static void main(String[] args) 
	{
		Prinatble p1 = new Prinatble();
		Prinatble p2 = new Prinatble();
		Thread t1 = new Thread()  //Anonymous inner class concept
				
				{
			       @Override
			       public void run()
			       {
			    	  p1.printable(5); //lock1
			       }			   
				};
				
				Thread t2 = new Thread()
						{
					
					@Override
					public void run()
					{
						p1.printable(5);
					}
						};

	
	
	Thread t3 = new Thread()
			{
		
		     @Override
		     public void run()
		     {
		    	 p2.printable(8);
		     }
		
		    
			};
	
			Thread t4 = new Thread()
			{
		
		     @Override
		     public void run()
		     {
		    	 p2.printable(4);
		     }
		
		    
			};
			
			t1.start();
			t2.start();
			t3.start();t4.start();
	
	
	
	
	
	}
	
	

}
