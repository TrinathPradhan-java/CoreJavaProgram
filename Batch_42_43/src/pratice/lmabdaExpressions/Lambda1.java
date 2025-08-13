package pratice.lmabdaExpressions;
interface Printable
{
	void print();
}
public class Lambda1
{
public static void main(String [] args)
{
	Printable p1 = () -> System.out.println("Printing");
	p1.print();
}
}
