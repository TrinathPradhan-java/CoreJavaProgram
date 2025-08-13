package pratice.diffrentTypeVarInLambdaBody;


@FunctionalInterface
interface Main
{
	 void draw();
	public static void m1()
	{
		
		System.out.println("The static variable are Declared");
	}
	private void m2()
	{
		System.out.println("It is private method");
	}
	default void m3()
	{
		m2();
	}
}
class Product extends Object
{
	public static Product getproduct(Product pd)
	{
		System.out.println("The product Name is ");
		return new Product();
	}
}
public class DifferentTypeOfLambdaBody1 
{

	public static void main(String[] args) 
	{
	String shapeType = "Circular";
//	shapeType ="Square";
	int base = 12;
	
	Product p1 = new Product();
	Product p2 =p1.getproduct(p1);
	
	Main m1 = () ->System.out.println("Drawble :"+shapeType);
	m1.draw();
	Main.m1();
	m1.m3();
	m1.hashCode();
Main m2= () ->System.out.println("Darawable value is "+base);
m2.draw();
Main p3 =()->System.out.println("Product Is :"+p2);
p3.draw();
	}

	

}
