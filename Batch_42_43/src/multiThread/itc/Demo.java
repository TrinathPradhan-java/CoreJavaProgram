package multiThread.itc;

public class Demo extends Thread

{
private int data =0;

public void run()
{
	synchronized(this)
	{
		System.out.println("Child thread got lock and starts execution");
		for(int i =0;i<=10;i++)
		{
			this.data=this.data+i;
			
		}
		System.out.println("Child thread sending notification ");
		notify();
		
	}//lock will be free
}


public int getData()
{
	return this.data;
}

public static void main(String[] args) throws InterruptedException
{
	System.out.println("Main Thread Started...");
	Demo d1= new Demo();//lock
	d1.start();
	//d1.join();

synchronized(d1)
{
	System.out.println("Mainthread is going to wait aftre releasing the lock");
	d1.wait();
	System.out.println("Main thread got notification and lock");
	System.out.println(d1.getData());
	
	
}
}
}

