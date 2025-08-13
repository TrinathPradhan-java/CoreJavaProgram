package pratice.short21_mar;


public class Car extends Vehicle
{
	@Override
	public int fuelCapacity()
	{
		return 18;
	}

	public void printTankCapacity()
	{
		System.out.println(super.fuelCapacity());
	}
}
