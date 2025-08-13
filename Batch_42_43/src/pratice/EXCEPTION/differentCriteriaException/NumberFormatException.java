package pratice.EXCEPTION.differentCriteriaException;

public class NumberFormatException
{

	public static void main(String[] args)
	{
		/**It is 1st case of NumberFormatException(String to primitive)....**/
//		String str = "india";
//		int number = Integer.parseInt(str);
//		System.out.println(number);
//
		
		/**It is the 2nd case of NumberFormatException(String to Wrapper calss)......**/
//		String str = "India";
//		Integer val = Integer.valueOf(str);
//		System.out.println(val);
		
		String str ="121";
		System.out.println(Integer.valueOf(str));
	}
	

}
