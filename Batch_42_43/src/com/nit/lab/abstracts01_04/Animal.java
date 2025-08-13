package com.nit.lab.abstracts01_04;

 abstract class Animal 
 {
 public abstract void roam();
}
 
 class Lion extends Animal
 {
	 public void roam()
	 {
		 System.out.println("Lion is Roming");
		
	 }
	 public void roar()
	 {
		 System.out.println("Lion is hoooow"); 
	 }
 }
 class Dog extends Animal
 {
	 public void roam()
	 {
System.out.println("Dog is roaming");
	 }
	 public void bark()
	 {
		 System.out.println("Dog is Bow Bow"); 
	 }
 }
