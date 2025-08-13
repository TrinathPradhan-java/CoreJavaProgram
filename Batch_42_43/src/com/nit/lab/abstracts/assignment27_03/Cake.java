package com.nit.lab.abstracts.assignment27_03;

public class Cake 
{
private String shape;
private String flavor;
private int quantity;
private double price;

//

public Cake(String shape,String flavor,int quantity)
{
	this.shape= shape;
	this.flavor = flavor;
	this.quantity=quantity;
	this.setPrice();
}

public String getShape() {
	return shape;
}

public void setShape(String shape) {
	this.shape = shape;
}

public String getFlavor() {
	return flavor;
}

public void setFlavor(String flavor) {
	this.flavor = flavor;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

/*public void setPrice(double price)
{
    price = quantity*400;
}
public double getPrice()
{
	return price;
}*/
public double setPrice(){
	{
		return price = quantity*400;
	}
}
public String toString()
{
    return "A"+shape+ flavor+"Cake of "+quantity+"KG is Ready @ Rs."+price+".";
}

}
