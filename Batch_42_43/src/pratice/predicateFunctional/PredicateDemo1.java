package pratice.predicateFunctional;
import java.util.function.*;
import java.util.Scanner;

public class PredicateDemo1 
{

	public static void main(String[] args) 
	{
		Predicate <Integer> p1 = (num)-> num%2==0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value is");
		int n = sc.nextInt();
		//Create boolean Value for even or odd condition.
		boolean isEven = p1.test(n);
		System.out.println("The value is "+isEven);
		sc.close();

	}

}
