package pratice.predicateFunctional.copy;
import java.util.function.Predicate;
import java.util.Scanner;
public class LeapYear 
{

	public static void main(String[] args) 
	{
		Predicate <Integer> leap = n -> (n%4==0 && n%100 !=0 || n%400==0) ;
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Year :");
		 int year = sc.nextInt();
		 boolean isLeapYear = leap.test(year);
		 System.out.println("Is Leap Year Or not Checked : "+isLeapYear);
	}

}
