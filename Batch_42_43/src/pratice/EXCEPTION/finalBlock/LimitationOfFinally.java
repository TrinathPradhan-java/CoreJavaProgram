package pratice.EXCEPTION.finalBlock;
import java.util.InputMismatchException;
import java.util.Scanner;



public class LimitationOfFinally 
{

	public static void main(String[] args)
	{
		Scanner sc = null;
	    try
	    {
	    	 sc = new Scanner(System.in);
	    	System.out.println("Enter your Salary :");
	    	double salary = sc.nextDouble();
	    	System.out.println("Your Salary is :"+salary);
	    	
	    }
	    catch(InputMismatchException e)
	    {
	    	System.err.println("Input is not in a proper format");
	    }
	    finally
	    {
	    	System.out.println();
	    	System.out.println("Inside finally Block");
	    	sc.close();
	    }

	}

}
