package exam.override.payment;

public class BankAccount 
{
	
	protected String accountHolderName ;
	protected String accountNumber ;
	protected double balance;
	public static final String IFSC_CODE ="SBIHYD151285";
	
	public BankAccount(String accountHolderName,String accountNumber,double balance)
	{
		if(accountHolderName.trim().isEmpty())
			{
				System.err.println("Invalid account Holder name");
			}
		
		else if(accountNumber.trim().isEmpty())
		{
			System.err.println("Invalid account Number");
		}
		else if(balance<0)
		{
			System.err.println("Invalid Balance");
		}
		else
		{
	
		this.accountHolderName=accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		}
		
	}
	
	public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance RS: " + balance);
        System.out.println("IFSC CODE: " + IFSC_CODE);
    }
}
