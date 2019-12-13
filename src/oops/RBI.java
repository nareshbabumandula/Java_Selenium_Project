package oops;

public interface RBI 
{

	int NoOfCustomers =1000;
	
	//default method
	public default void MutualFunds()
	{
		System.out.println("MutualFunds is a deafult method");
	}
	
	
	public static void AccountTypes()
	{
		System.out.println("AccountTypes is a static method");
	}
	
	//abstract methods
	public void MinBalance();
	public void MinDeposit();
	public void MaxDeposit();
	public void MinWithdrawl();
	public void MaxWithdrawl();
	public void PFAccount();
	public void DematAccount();
	public void Loans();
	public void NoOfCustomers();
	public void KYC();
	

	public static void main(String args[])
	{
		AccountTypes();
	}
	
}
