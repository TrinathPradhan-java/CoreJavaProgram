package pratice.MultiThreading.priorityPratice;

public class PriorityDemo1 {

	public static void main(String[] args) {
		//int t1 = Thread.currentThread().getPriority(); 
		//System.out.println(t1);
		
		Thread t2 = new Thread();
		System.out.println("Child Thread priority is :"+t2.getPriority());
		
		
		Thread t3 = new Thread();
	t3.setPriority(Thread.MAX_PRIORITY);
	System.out.println("Child Thread priority is :"+t3.getPriority());

	}

}
