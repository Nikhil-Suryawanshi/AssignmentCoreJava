package ExceptionAssignment3;

public class SavingsAccount /*throws IlligalBankTransactionException,InSufficientBalanceException*/{
	long id;
	double balance;
	
	void setId(long id,long bal) {
		this.id=id;
		balance=bal;
	}
	
	public double withdraw(double amt) throws InSufficientBalanceException,IlligalBankTransactionException{
		if(balance<amt||balance==0) {
			throw new InSufficientBalanceException("Insufficient Balance in account");
		}
		else if(amt<0) {
			throw new IlligalBankTransactionException("Negative number is Illegal");
		}
		else {
			balance -= amt;
			return balance;
		}
	}

	
	double deposit(double amt) {
		return 0;	
	}

}
