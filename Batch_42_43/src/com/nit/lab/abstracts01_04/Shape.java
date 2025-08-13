package com.nit.lab.abstracts01_04;

abstract class Shape 
{
public abstract double getArea();
public abstract void printDetails();
}

class Rectangle extends Shape
{
	protected double length;
	protected double breadth;
	
	public Rectangle(double length,double breadth)
	{
		this.length =length;
		this.breadth = breadth;
	}
	public double getArea()
	{
		double shape = length* breadth;
		return shape;
	}
	public void printDetails()
	{
		System.out.println("Length ="+length);
		System.out.println("Breadth ="+breadth);
		System.out.println("Area = "+getArea());
	}
}

class Circle extends Shape
{
	protected double radius;
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	public double getArea()
	{
		double shape = 3.14* radius*radius;
		return shape;
	}
	public void printDetails()
	{
		System.out.println("Radius ="+radius);
		System.out.println("Area = "+getArea());
	}
}

class Triangle extends Shape
{
	protected double base;
	protected double height;
	
	public Triangle(double base,double height)
	{
		this.base = base;
		this.height = height;
		
	}
	public double getArea()
	{
		double shape =0.5*(base*height) ;
		return shape;
	}
	public void printDetails()
	{
		System.out.println("Base ="+base);
		System.out.println("Height ="+height);
		System.out.println("Area = "+getArea());
	}
	
}
