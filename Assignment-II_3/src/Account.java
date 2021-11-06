
public class Account {
	int accNum,bankBal;
	String Name,Branch;
	
	void setAccountDetails(){
		
	}
	
	public void addAmount(int amt) {
		bankBal += amt;
	}
	
	public void getBalance() {
		System.out.println(this.bankBal);
	}
	
}
