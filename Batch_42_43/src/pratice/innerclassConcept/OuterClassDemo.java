package pratice.innerclassConcept;
class Outer
{
	private int data=120;
	public class Inner
	{
		public void showData()
		{
		System.out.println("Outer class Data is : "+data);	
		}
	}
}
public class OuterClassDemo {

	public static void main(String[] args) 
	{
		Outer out = new Outer();
	Outer.Inner  in  = out.new Inner();
	in.showData();

	}

}
