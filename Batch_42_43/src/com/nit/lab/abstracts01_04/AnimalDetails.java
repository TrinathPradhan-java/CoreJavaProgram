package com.nit.lab.abstracts01_04;

public class AnimalDetails {

	public static void main(String[] args) {
		Animal an = new Lion();
		
		an.roam();
		 Lion l = (Lion) an;
		
		
			
		
		
  

	
	
	  an = new Dog();
	  an.roam();
	  Dog d = (Dog) an;
	  System.out.println("Before");
	  System.out.println("---------------------------------");
	  
	  System.out.println("After Iupdate unique method");
	 
	  l.roar();
    d.bark();
    
    
    getAnimal(new Lion());
    getAnimal(new Dog());
	}
	

	
	public static void getAnimal(Animal a1)
	{
		a1.roam();
		if(a1 instanceof Lion)
		{
			((Lion)a1).roar();
		}
		else if(a1 instanceof Dog)
		{
			((Dog)a1).bark();
		}
		
	}

}
