package com.nit.lab.abstracts;

 public abstract  class Food 
{
	double proteins;
	double fats;
	double carbs;
	double testyScore;

	public Food(double proteins, double fats, double carbs) 
	{
		super();
		this.proteins = proteins;
		this.fats = fats;
		this.carbs = carbs;
	}

	public abstract void getMacroNutrients();
}
//========================

class Egg extends Food
{
	int  testyScore = 7;
	String type ="non-vegetarian";
	public Egg(double proteins,double fats,double carbs)
	{
		super(proteins,fats,carbs);
		super.testyScore=testyScore;
		
	}
	@Override
	public  void getMacroNutrients()
	{
		System.out.println("an egg has "+this.proteins+" gms of proteen "+this.fats+" gms of facts and "+this.carbs+" gms of carbohydrates.");
	}
	public int getTestyScore() {
		return testyScore;
	}
	public String getType() {
		return type;
	}
	
	
	
}
//==========================
class Bread extends Food
{
	int  testyScore = 8;
	String type ="vegetarian";
	public Bread(double proteins, double fats, double carbs)
	{
		super(proteins, fats, carbs);
		super.testyScore = this.testyScore;
	}

	@Override
	public  void getMacroNutrients()
	{
		System.out.println("A Slice of Bread HAs"+ this.proteins+" gms proten "+ this.fats+" gms facts and "+ this.carbs+" gms of gms of carbohydrates.");
	}
	
	public int getTestyScore() {
		return testyScore;
	}
	public String getType() {
		return type;
	}
}