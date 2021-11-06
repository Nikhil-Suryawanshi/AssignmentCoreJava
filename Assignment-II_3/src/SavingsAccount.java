
public class SavingsAccount extends Account {
	int FD;
	
	public void addFD(int fd) {
		FD += fd;
	}
	
	public void getBalance() {
		int bal=super.bankBal+this.FD;
		System.out.println("Bank Balance : "+bal);
		this.FD=0;
	}
	
}
