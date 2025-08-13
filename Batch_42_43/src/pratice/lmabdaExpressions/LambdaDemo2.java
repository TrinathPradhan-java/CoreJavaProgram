package pratice.lmabdaExpressions;
interface Vehicle
{
	void run();
}
public class LambdaDemo2 
{
public static void main(String [] args)
{
	Vehicle bike = () -> System.out.println("Bike is Running");
	Vehicle car = () -> System.out.println("car  is Running");
	Vehicle auto = () ->System.out.println("Auto is Running");
	
	bike.run();
	auto.run();
	car.run();
}

}
