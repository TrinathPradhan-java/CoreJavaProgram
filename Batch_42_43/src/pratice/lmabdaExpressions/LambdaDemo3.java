package pratice.lmabdaExpressions;
interface Test
{
	public abstract int getLength(String str);
}
public class LambdaDemo3 
{
public static void main(String [] args)
{
	Test l = (str) -> str.length();
	System.out.println("Length is :"+l.getLength("Hyderabad"));
}
}
