package pratice.EXCEPTION.differentCriteriaException;

import java.util.Scanner;

public class NullPointerException
{

	public static void main(String[] args) 
	{
		/**1st case**/
//		String str = null;
//		System.out.println(str.toUpperCase());

		/**2nd case**/
//		String str = "null";
//		System.out.println(str.length());
//		System.out.println(str.toUpperCase());
		
		/**3rd case**/
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		System.out.println(str.length());
		sc.close();
	}

}
