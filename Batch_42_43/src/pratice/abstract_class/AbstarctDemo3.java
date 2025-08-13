package pratice.abstract_class;

public  class AbstarctDemo3 implements Test1 , Test2
{

	public static void main(String[] args) 
	{
		new AbstarctDemo3().draw();
		new AbstarctDemo3().m2();

	}
	@Override
	public void draw()
	{
		System.out.println("The abstract method");
	}

	@Override
	public void m2()
	{
		System.out.println("The 2nd  method");
	}
}

interface Test1
{
	public abstract void draw();
}
interface Test2
{
	public abstract void m2();
}