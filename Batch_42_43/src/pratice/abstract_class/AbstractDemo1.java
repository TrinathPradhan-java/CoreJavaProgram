//Program that describes how to override abstract method in the sub classes 
package pratice.abstract_class;
abstract class Shape
{
	public abstract void draw();
}
class Rectangle extends Shape
{
	@Override
	public void draw()
	{
		System.out.println("Draw Rectangle !.....");
	}
}
class Square extends Shape
{
	@Override
	public void draw()
	{
		System.out.println("Draw Square!........");
	}
}
class Circle extends Shape
{
	@Override
	public void draw() {
		System.out.println("Draw Circle !..........");
		
		
	}
}


public class AbstractDemo1 
{
	

	public static void main(String[] args) 
	{
		
      Shape shape = null;
      shape = new Circle();shape.draw();
   shape = new Rectangle();
      shape.draw();
      shape = new Square();shape.draw();
	}

}
