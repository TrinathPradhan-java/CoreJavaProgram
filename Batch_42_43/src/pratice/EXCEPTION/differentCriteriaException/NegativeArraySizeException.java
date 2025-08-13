package pratice.EXCEPTION.differentCriteriaException;

public class NegativeArraySizeException
{

	public static void main(String[] args) 
	{
      
      int [] arr = new int[-12];
      System.out.println(arr[2]);

	}

}
