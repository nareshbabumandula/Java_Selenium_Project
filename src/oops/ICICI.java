package oops;

public class ICICI implements RBI, Bank
{

	public void PrivilageBanking()
	{
		System.out.println("Executing PrivilageBanking method.");
	}
	
	public static void main(String[] args) {
		ICICI ic = new ICICI();
		ic.PrivilageBanking();
		System.out.println(ic.NoOfCustomers);
		ic.MutualFunds();
		ic.MinBalance();
		ic.MinDeposit();
		ic.MaxDeposit();
		ic.MaxDeposit();
		ic.MinWithdrawl();
		ic.MaxWithdrawl();
		ic.Loans();
		ic.KYC();
		ic.DematAccount();
	}


	public void MinBalance() 
	{
		System.out.println("Min balance is 1000 rupees per month");
	}


	public void MinDeposit() {
		System.out.println("Min deposit should be 500 rupees");
	}


	public void MaxDeposit() 
	{
		System.out.println("Max deposit should be 10 lakhs rupees");
	}


	public void MinWithdrawl() 
	{
		System.out.println("Min Withdrawl is 100 rupees");
	}


	public void MaxWithdrawl() 
	{
		System.out.println("Min Withdrawl is 50000 per day");
	}


	public void PFAccount() {
		
		System.out.println("PFAccount can be opened by a customer");
	}


	public void DematAccount()
	{
		System.out.println("DematAccount can be opened by a customer");
	}


	public void Loans() {
		System.out.println("Loans can be given to a customer");
	}


	public void NoOfCustomers() {
		System.out.println("NoOfCustomers should be more than 1000");
		
	}

	
	public void KYC() {
		System.out.println("KYC is being taken care");
		
	}

	

}
