package pratice;


class Hetro
{
	public void acceptHetro(Object ...obj)
	{
		for(Object x : obj)
		{
			System.out.println(x);
		}
	}
}
public class VarArgsDemo3 
{
	public static void main(String[] args) 
	{
		Hetro h = new Hetro();
		h.acceptHetro(12,23.90,'A',"NIT", false, new String("NIT"));

	}

}