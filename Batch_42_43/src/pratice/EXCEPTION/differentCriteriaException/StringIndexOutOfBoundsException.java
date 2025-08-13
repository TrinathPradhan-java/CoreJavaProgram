package pratice.EXCEPTION.differentCriteriaException;

public class StringIndexOutOfBoundsException 
{

	public static void main(String[] args)
	{
	String str = "hydrabad";
	System.out.println(str.substring(2,5));
	System.out.println(str.substring(-2,5));

	}

}
