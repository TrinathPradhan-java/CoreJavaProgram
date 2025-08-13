package pratice.Interface;


interface Alpha
{
	//default method...........
	default void m1()
	{
		System.out.println("Default method of Alpha Interface....");
	}
}

class Beta
{    //concrete method (it's most priority)..........
	public void m1()
	{
		System.out.println("Concrete Method of Beta class...");
	}
}

class Gamma extends Beta implements Alpha
{
	
}
public class Priority 
{

	public static void main(String[] args) 
	{
		//Object create 	
	Gamma g = new Gamma();
	g.m1();
	}

}
//Concrete Method of Beta Class...
