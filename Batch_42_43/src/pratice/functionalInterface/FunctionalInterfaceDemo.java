package pratice.functionalInterface;
interface Bird
{
	//it's default method 
	void sleep();
}
public class FunctionalInterfaceDemo 
{

	public static void main(String[] args) 
	{
		
		//create parrot class inside main method using super class reference ,it is Anonymous class
		//If we declare a class inside a method body without any class name then it is called Anonymous inner class
	Bird parrot = new Bird()
			{
		
		public void sleep()
		{
			System.out.println("Parrot are sleeping Like a Beautiful Lady");
		}
			};
			
			Bird peacock = new Bird()
					{
				
				public void sleep() 
				{
				System.out.println("It's Look Like Eligent");	
				}
					};
                       //call sleep class to sub class.
					parrot.sleep();
					peacock.sleep();
	}

}
