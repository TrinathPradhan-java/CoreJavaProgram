package pratice.EXCEPTION;
class Demo extends RuntimeException
{
	public void show() throws ClassNotFoundException
	{
		Class.forName("pratice.EXCEPTION.Demo");
		System.out.println("The demo Method is calling!!!");
		throw new ClassNotFoundException();
	}
}
public class ThrowsDemo 
{

	public static void main(String[] args) 
	{
		Demo obj = new Demo();
		
		
		System.out.println();
	try {
		obj.show();
		System.out.println(Demo.class.getName());
		System.out.println("The method success fully calling!!!");
		
		//throw new ClassNotFoundException();
		
	}
	catch(ClassNotFoundException e)
	{
		System.out.println("Class Is not found!!! ");
	}

	}

}




