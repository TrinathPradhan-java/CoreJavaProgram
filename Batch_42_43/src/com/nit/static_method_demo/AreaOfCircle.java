package com.nit.static_method_demo;

public class AreaOfCircle 
{
  public static String getAreaOfCircle(double radius)
  {
     if(radius<=0)
     {
    	 return ""+(-1);
     }
     else
     {
    	 final double PI = 3.14;
    	 double area = PI * radius * radius;
    	 
    	 return ""+area;
    	 
     }
	  
	 
  }
}
