
public class Menu {
	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount();
		CurrentAccount currentAccount = new CurrentAccount();
		Account acc=new Account();
		
		savingsAccount.addAmount(3000);
		currentAccount.addAmount(6000);
		acc.addAmount(400);
		
		savingsAccount.getBalance();
		currentAccount.getBalance();
		acc.getBalance();
		
		savingsAccount.addFD(400);
		currentAccount.addCredit(500);
		
		savingsAccount.getBalance();
		currentAccount.getBalance();
		acc.getBalance();
		
	}

}
