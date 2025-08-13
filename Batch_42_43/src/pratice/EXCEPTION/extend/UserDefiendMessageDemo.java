package pratice.EXCEPTION.extend;

public class UserDefiendMessageDemo {

	public static void main(String[] args) 
	{
		
	try {
		String str= "null";
		System.out.println("The message "+str.length());
		throw new ArithmeticException();
	}
	catch(ArithmeticException e)
	{
		System.out.println(e.getLocalizedMessage());
	}
	}

}
