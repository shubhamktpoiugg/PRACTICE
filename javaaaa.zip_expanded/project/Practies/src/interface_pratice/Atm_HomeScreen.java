     package interface_pratice;

public class Atm_HomeScreen {

	public static void main(String[] args) {
		
		
		
		System.out.println("       BALANCE CHECK \n");
		System.out.println("*****************************");
		
		Balance_Check b=new Balance_Check();
		b.balance_Check();
		
		b.deposit_Cash();
		b.withdrawal_Cash();
		System.out.println("*****************************");
		System.out.println("\n");
		
		System.out.println("      WIDTHDRAWAL \n");
		System.out.println("*****************************");
		Withdrawal_Cash w=new Withdrawal_Cash();
		w.balance_Check();
		w.withdrawal_Cash();
		w.deposit_Cash();
		System.out.println("*****************************");
		System.out.println("\n");
		
		
		System.out.println("        DESPOSIT\n");
		System.out.println("*****************************");
		Deposit_Cash d=new Deposit_Cash();
		d.balance_Check();
		d.deposit_Cash();
		d.withdrawal_Cash();
		System.out.println("*****************************");
		System.out.println("\n"); 
		
	
	
		

	}

}
