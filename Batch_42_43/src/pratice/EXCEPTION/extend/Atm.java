package pratice.EXCEPTION.extend;
import java.util.Scanner;
public class Atm 
{

	public static void main(String[] args) 
	{
	double accountAmount = 5000;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter amount withdrow : ");
	
	
	try 
	{
		double amount=sc.nextDouble();
		
		if(amount>accountAmount)
		{
			throw new Exception("In sufficent Balance !!! Plz Try again ....."+accountAmount);
		}
		accountAmount-=amount;
		System.out.println("The Balance is Debited !!! Thank You for Withdraw.... \n The Balance is -"+accountAmount);
	}
	catch(Exception a)
	{
		System.out.println("Message : "+a.getMessage());
	}

	System.out.println("ThankYou using ATM");
	}

}
