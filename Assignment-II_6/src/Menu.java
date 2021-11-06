import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Persistence P1;
		Persistence P2;
		
		System.out.println("1. Store in Database \n2. Store in File \nEnter Your Choice : ");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			P1=new DatabasePersistence();
			P1.persist();
			break;
		case 2:
			P1=new FilePersistence();
			P1.persist();
			break;
		}
		

	}

}
