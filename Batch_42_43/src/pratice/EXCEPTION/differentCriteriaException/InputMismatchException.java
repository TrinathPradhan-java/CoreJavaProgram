package pratice.EXCEPTION.differentCriteriaException;

import java.util.Scanner;

public class InputMismatchException 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		System.out.println(num);
		sc.close();
	}

}

//Enter number : 
//12.5
