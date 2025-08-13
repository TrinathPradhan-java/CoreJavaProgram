package pratice.predefinedFunctionalInterface.consumer;
import java.util.Scanner;
import java.util.function.Consumer;
public class ReverseNumber
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Consumer <Integer> reverseNumber = n ->{
			int reverse =0;
			int temp= n;
			while(temp!=0)
			{
				int remainder = temp%10;
				 reverse = (reverse * 10)+remainder;
				 temp/=10;
			}
			if(n==reverse)
			{
				System.out.println(n+" number is palindrom number ");
			}
			else System.out.println(n+" The number is not pallindrom number");
		};
		System.out.println("Enter a number");
		int num = sc.nextInt();
		reverseNumber.accept(num);
		
		sc.close();

	}

}
