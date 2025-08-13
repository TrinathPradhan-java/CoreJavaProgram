package exam.override.payment;

public class CurrentAccount extends BankAccount
{
	protected double overdraftLimit = 5000.0;	
	
public CurrentAccount(String accountHolderName , String accountNumber,double balance)
{
	super(accountHolderName,accountNumber,balance);
}
public void calculateinterest()
{
	
	System.out.println("Current accounts do not earn interest.");
	
}
public void checkOverdraftLimit()
{
	System.out.println(" Overdraft limit RS :"+overdraftLimit);
}

}
