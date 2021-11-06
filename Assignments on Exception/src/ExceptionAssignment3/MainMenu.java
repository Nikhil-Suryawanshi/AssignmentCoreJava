package ExceptionAssignment3;
import java.util.Scanner;

public class MainMenu {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		long id,bal,amt;
		int ch;
		SavingsAccount acc=new SavingsAccount();
		System.out.println("Set Account and balance :");
		System.out.print("Set Id : ");
		id=sc.nextLong();
		System.out.print("\nSet bal : ");
		bal=sc.nextLong();
		acc.setId(id, bal);
		boolean isTrue = true;
		while(isTrue) {
			System.out.println("\n1. Balance info");
			System.out.println("2. Withdraw ");
			System.out.println("\n0. Exit\nEnter your choice");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				break;
			case 2:
				System.out.println("Enter amt :");
				amt=sc.nextLong();
				try {
					System.out.print("Balance after withdrawal : "+acc.withdraw(amt));
				}catch(InSufficientBalanceException e) {
					System.out.println("Error :"+e.getMessage());
				}
				catch(IlligalBankTransactionException e) {
					System.out.println("Error :"+e.getMessage());
				}
				break;
			case 0:
				isTrue=false;
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
		}
	}
}
