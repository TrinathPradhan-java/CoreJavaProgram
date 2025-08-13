package pratice_interface;

public interface HotDrink 
{
void prepare();
}

class Tea implements HotDrink
{
	@Override
	public void prepare()
	{
		System.out.println("Preparing Tea");
	}
}

class Coffe implements HotDrink
{
	@Override
	public void prepare()
	{
		System.out.println("Prepare Cofee");
	}
}


 class ExpressTea implements HotDrink 
{

	@Override
	public void prepare() 
	{
	  System.out.println("Premimum Tea is preparing");	
	}

}
 
 class Resturant
 {
	 public static void prepareHotDrink(HotDrink hd)
	 {
		 hd.prepare();
	 }
 }
