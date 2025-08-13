package pratice.EXCEPTION.extend;
class Demo1 extends Throwable
{
	public Demo1(String errorMessage)
	{
		super(errorMessage);
	}
}
public class ThrowableDemo 
{

	public static void main(String[] args) 
	{
		try
		{
			
			throw new Demo1("This message error");
		}
		catch(Throwable e)
		{
			System.out.println(e.getMessage());
		}
	}

}

