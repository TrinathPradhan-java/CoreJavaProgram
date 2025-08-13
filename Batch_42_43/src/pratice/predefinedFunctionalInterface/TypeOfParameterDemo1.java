package pratice.predefinedFunctionalInterface;



class Accept<T>
{
	private T data;
	
	
	public Accept(T data)
	{
		super();
		this.data= data;
		
	}
	public T getData()
	{
		return data;
	}
}


public class TypeOfParameterDemo1 
{

	public static void main(String[] args) 
	{
     Accept <Integer> intType = new Accept<Integer>(12);
     System.out.println("The Data is "+intType.getData());
     
     
     Accept <Float> str = new Accept<Float>(12f);
     System.out.println("The value is "+str.getData());
    
     Accept<Student> stdType = new Accept<Student>(new Student());
     System.out.println("What is Your Name "+stdType.getData());

	}
	
}
	class Student
	{
		@Override
		public String toString()
		{
			return "My Name is Trinath";
		}
	}


