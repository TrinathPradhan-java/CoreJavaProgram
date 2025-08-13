package com.nit.encapsulation;

public class Demo {
	public static void main(String [] args) {
		DemoDetails demo = new DemoDetails(10);
		System.out.println(demo);
	}

}

class DemoDetails{
	int x;
	DemoDetails(int x){
		this.x= x;
	}
	public String toString() {
		return""+x;
	}
	public static DemoDetails m1(){
		System.out.println("Demo details");
		DemoDetails de= new DemoDetails(10);
		return de;
		
	}
}
