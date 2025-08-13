package pratice;

public class Test {

	public static void main(String[] args) {
		new C();

	}

}
class A
{
	public A() {
		System.out.println("A");//A
	}
}
class B extends A
{
	public B(){
		super();
	}
	
}
class C extends B{
	public C()
	{
		this(10);
		System.out.println("C");//C
	}
	public C(int x) {
		super();
		System.out.println("X is "+x);//10
	}
}
