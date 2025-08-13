package pratice;

class Alpha{
	//create no argumentuserdefined Constructor.
	public Alpha() {
		super();
		System.out.println("It is 1st constructor");
	}
	//The super(10); statement calls Alpha's parameterized constructor
	public Alpha(int x) {
		this(10,20);
		//super();
		System.out.println("X is "+x);
	}
	public Alpha(int x ,int y) {
		this();
		System.out.println("X and Y is "+ x + y);
	}
}
//This triggers Beta's constructor(1st stpe)
class Beta extends Alpha{
	public Beta(){
		
		super(10);
		
		System.out.println("2nd Constructor ");
	}
}



public class ConstructorChainingDemo1 {

	public static void main(String[] args) {
		//In the main method, we create an instance of Beta
		new Beta();
	}

}
