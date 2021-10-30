import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double P,R,T,num;
		int ch;
		do {
			System.out.println("1. Simple Interest");
			System.out.println("2. Compound Interest");
			System.out.println("0. Exit");
			System.out.print("Enter Your choice:");
			ch=sc.nextInt();
			switch(ch) {
			case 0:
				System.out.println("Exiting...");
				break;
			case 1:
				System.out.println("Enter Principle Amount P :");
				P=sc.nextDouble();
				System.out.println("Enter Rate of Interest R :");
				R=sc.nextDouble();
				System.out.println("Enter Time in Years T :");
				T=sc.nextDouble();
				System.out.println("Simple Interest :"+ SI(P,R,T)+"\n\n");
				break;
			
			case 2:
				System.out.println("Enter Principle Amount P :");
				P=sc.nextDouble();
				System.out.println("Enter Rate of Interest R :");
				R=sc.nextDouble();
				System.out.println("Enter Time in Years T :");
				T=sc.nextDouble();
				System.out.println("Enter  number of times that interest is compounded per unit T (Num):");
				num=sc.nextDouble();
				System.out.println("Compound Interest :"+ CI(P,R,T,num)+"\n\n");
				break;
			default:
				System.out.println("Invalid Input");
				
			}	
		}while(ch!=0);
		
	}
	
	static double SI(double P,double R,double T){
		return (P*R*T)/100;
	}
	
	static double CI(double P,double R,double T,double num){
		return P * (Math.pow((1 + R/num), (T * num))) - P;
	}

}
