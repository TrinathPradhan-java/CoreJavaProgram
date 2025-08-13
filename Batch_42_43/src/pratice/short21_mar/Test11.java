package pratice.short21_mar;

public class Test11
{
	public static void main(String [] args)
	{
		Animal a = new Animal();
		Animal b = new Horse();
		a.eat();
		b.eat();
		//b.buck();
	}
}
class Animal
{
	public void eat()
	{
		System.out.println("Generic Animal eating");

	}
	
	
}
class Horse extends Animal
{
	public void eat()
	{
		System.out.println("Horse Eating");
	}
		public void buck()
	{
			
			System.out.println("Printing");
	}
}
