package pratice.lmabdaExpressions;
interface Cal
{
	void doSum(int x,int y);
}
public class Calculator 
{

	public static void main(String[] args) 
	{
	Cal sum = (x,y) ->  System.out.println("Sum of Two number is :"+(x+y));
	
	sum.doSum(12, 15);

	}

}
