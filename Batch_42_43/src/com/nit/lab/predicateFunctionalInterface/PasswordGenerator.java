package com.nit.lab.predicateFunctionalInterface;
import java.util.Random;
import java.util.function.Supplier;

public class PasswordGenerator
{
	public static void main(String[] args)
	{
		String upper ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower="abcdefghijklmnopqrstuvwxyz";
		String number = "0123456789";
		String special="@#$%!&*";
		
		
		//it is mainly used to Combine all Character...
		String totalChar= upper+lower+number+special;
		
		
		Supplier <String> pwdSupplier = () ->
		{
			int index;
			//import random class for generate random number
			Random random =  new Random();
			String password ="";
			
			for(int i =0;i<=8;i++)
			{
				//Calculate total length
				 index = random.nextInt(totalChar.length());
				 System.out.println(index);
				 password = password+totalChar.charAt(index);
				
				
			}
			return password;
		};
		
		String pwd = pwdSupplier.get();
		System.out.println("Generated password :"+pwd);
	}
}