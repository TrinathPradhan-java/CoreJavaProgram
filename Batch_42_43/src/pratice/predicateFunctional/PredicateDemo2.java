package pratice.predicateFunctional;
import java.util.function.Predicate;
import java.util.Scanner;

public class PredicateDemo2 
{

	public static void main(String[] args) 
	{
		
		// Verify whether my name starts with R or not
        Predicate <String> p2 = s->s.startsWith("R");	
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name :");
        String name = sc.nextLine();
        		boolean isTrue = p2.test(name);
        System.out.println(" "+isTrue);

	}

}
