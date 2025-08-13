package com.nit.lab.Exception.exception14_04;

public class IllegalStateExceptionDemo1 
{
	 public static void main(String [] args)
	 {
		 throwIllegalException( );
//		 try{ 
//				throw new IllegalStateException("MyException"); 
//			} catch(IllegalStateException objA){
//				System.out.println("caught:" +objA); 
//			}
	 }

	static void throwIllegalException( ) { 
			try{ 
				throw new IllegalStateException("MyException"); 
			} catch(IllegalStateException objA){
				System.out.println("caught:" +objA); 
			}
		    }
	 

}
