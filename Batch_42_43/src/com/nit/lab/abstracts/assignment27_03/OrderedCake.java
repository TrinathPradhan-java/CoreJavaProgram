package com.nit.lab.abstracts.assignment27_03;

public class OrderedCake extends Cake
{
    private String message;

    public OrderedCake()
    {
    	super("Round", "Vanilla", 1);
          
    }
    public OrderedCake(String shape,String flavor,int quantity)
    {
        super(shape,flavor,quantity);
    }
    public OrderedCake(String shape,String flavor,int quantity,String message)
    {
      super(shape,flavor,quantity);
      this.message = message;  
      super.setPrice();
    }
    public String toString()
    {
    	if(message !=null){
    		return "A " + getShape() + " " + getFlavor() + " Cake of " + getQuantity() + "KG is Ready with " + message + " message @ Rs." +setPrice();
        }

            
            return super.toString();
    }
}