//The following program explains that we can execute the constructor of abstract class from sub class object by using super().
package pratice.abstract_class;
abstract class Bike
{
	protected int speed =80;
	public Bike()
	{
		super();
		System.out.println("Bike is created as Constructor.........!");
	}
	
	public void bikeDetails()
	{
		System.out.println("Bike are Use MOved one to another direction......!");
	}
	public abstract void run();
}

class KTM extends Bike
{
	
	
	
	public void run()
	{
		System.out.println("Bike is Running...........!");
	}
}

public class InterviewQuestion
{

	public static void main(String[] args)
	{
		Bike bike = new KTM();
		System.out.println("Bike Details "+bike.speed);
		bike.bikeDetails();
		bike.run();

	}

}
