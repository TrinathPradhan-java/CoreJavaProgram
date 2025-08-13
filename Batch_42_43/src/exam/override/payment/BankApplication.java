package exam.override.payment;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) 
	{
	
		System.out.println("Please select the Account Type :");
		System.out.println("1) Saving Account \n 2) Current Account \n 3)Fixed Deposite Account");
		System.out.println("Please enter the type of account you want to open : [1/2/3]");
		
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		System.out.print("Enter Account Holder Name :");
		String name = sc.nextLine();
		name = sc.nextLine();
		System.out.print("Enter Account Number :");
		String number = sc.nextLine();
		System.out.print("Enter Amount :");
		int balance = sc.nextInt();
		
		System.out.println("-----------------------------------------------------------------------------------------");
		
		
		
		switch(ch)
		{
		case 1:
			SavingsAccount sa = new SavingsAccount(name,number,balance);
			sa.displayAccountDetails();
			sa.calculateinterest();
			break;
			
		case 2:
			CurrentAccount ca = new CurrentAccount(name,number,balance);
			ca.displayAccountDetails();
			ca.calculateinterest();
			ca.checkOverdraftLimit();
		case 3:
			
			System.out.print("Enter Deposite Term");
			int deposite = sc.nextInt();
			FixedDepositAccount fda = new FixedDepositAccount(name,number,balance,deposite );
			fda.displayAccountDetails();
			fda.calculateinterest();
			
		}
		
		
	}

}
