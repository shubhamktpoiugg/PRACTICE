package interface_pratice;

public class Deposit_Cash implements Atm_Machine{
	
	public void balance_Check()
	{
		System.out.println("DO U WANT TO CHECK BALANCE FIRST.");
	}
	public void deposit_Cash()
	{
		System.out.println("PLEASE ENTER AMOUNT YOU WANT TO DEPOSIT.");
	}
	public void withdrawal_Cash()
	{
		System.out.println("DO U WANT WITHDRAWAL CASH.");
	}

}
