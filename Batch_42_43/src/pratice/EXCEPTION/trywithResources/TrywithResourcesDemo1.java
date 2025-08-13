package pratice.EXCEPTION.trywithResources;

import java.io.Closeable;
import java.io.IOException;

class FileResource implements Closeable
{
	public void close() throws IOException 
	{
		System.out.println("Auto closable Demo !!!");
	}
}
class DatabaseResourse implements AutoCloseable
{
	@Override
	public void close() throws ArithmeticException 
	{
		System.out.println("Database Resourse Closed Successfully!!!");		
	}

}



public class TrywithResourcesDemo1 
{

	public static void main(String[] args) 
	{
//		DatabaseResourse dr = new DatabaseResourse();
//		FileResource fr = new FileResource();
		
        //try(dr; fr)
		try(DatabaseResourse dr = new DatabaseResourse();
		FileResource fr = new FileResource();)
        {
        	System.out.println(10/0);
        }
        catch(IOException | ArithmeticException e)
        {
        	if(e instanceof IOException)
        	System.out.println(e);
        	else if(e instanceof ArithmeticException)
        		System.out.println(e);
        }
     

	}

}
