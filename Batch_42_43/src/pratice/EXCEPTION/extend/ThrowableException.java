package pratice.EXCEPTION.extend;

class Demo extends Throwable
{

	public Demo() {
		
	}
	public Demo(String errorMessage,Throwable cause)
	{
		super(errorMessage,cause);
	}
	

}
public class ThrowableException 
{
public static void main(String [] args)
{
	try
	{
		Throwable e1 =new Throwable("It's java program");
	
		
		System.out.println(e1.toString());
		
		throw new Demo("Error like",e1);
		
	}
	catch(Demo e)
	{
		System.out.println(e.toString());
		
		
	}
	
}
}
