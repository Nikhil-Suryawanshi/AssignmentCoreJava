package ExceptionAssignment3;

public class InSufficientBalanceException extends Exception{
	public InSufficientBalanceException(String msg){
		super(msg);
	}
}
