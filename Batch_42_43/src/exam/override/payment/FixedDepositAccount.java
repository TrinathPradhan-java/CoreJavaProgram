package exam.override.payment;

public class FixedDepositAccount extends BankAccount
{
	
	protected double interestRate = 6.5;
	protected int depositeTerm;
	public FixedDepositAccount(String accountHolderName , String accountNumber,double balance,int depositeTerm)
	{
		super(accountHolderName,accountNumber,balance);
		this.depositeTerm=depositeTerm;
	}
	public void calculateinterest()
	{
		double interest = (balance*interestRate*depositeTerm)/100;
		System.out.println("Savings Account Interest RS: " + interest);
		
	}
}
