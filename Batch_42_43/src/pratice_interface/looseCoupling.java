package pratice_interface;

public class looseCoupling {

	public static void main(String[] args)
	{
		
      Resturant.prepareHotDrink(new Tea());
      Resturant.prepareHotDrink(new Coffe());
      Resturant.prepareHotDrink(new ExpressTea());
	}

}
