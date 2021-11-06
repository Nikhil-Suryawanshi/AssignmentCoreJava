
public class CurrentAccount extends Account{
	int credit;
	
	public void addCredit(int credit) {
		this.credit +=credit;
	}
	
	public void getBalance() {
		int bal=super.bankBal-credit;
		System.out.println("Bank Balance : "+bal);
	}
}
