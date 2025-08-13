package pratice;

public class ConstructorChainingDemo2 {

	public static void main(String[] args) {
		new Sub();

	}

}

class Super{
	public Super(String name) {
	super();
	System.out.println("My name is :"+name);
	}
}
class Sub extends Super
{
	public Sub(){
		super("Smith");
		System.out.println("No argument Constructor");
		
	}
}

