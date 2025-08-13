package pratice.predicateFunctional.copy;
import java.util.function.*;

public class isPrime 
{

	public static void main(String[] args) 
	{
		Predicate <Integer> isPrime = n -> {
			if(n<=1) {
				return false;
			}
			else if(n%2==0) {
				return false;
			}
			if(n==2)
				{
					return true;
				}
				for(int i =3;i<=Math.sqrt(n);i+=2)
				{
					if(n%i ==0) {
						
					
					return false;
					}
				}
				return true;
			
		};
		
		boolean primeNumber = isPrime.test(11);
   System.out.println("The number is Prime or Not "+primeNumber);
   
		}
		
	}
	


