package ExceptionAssignment2;

import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double a,b;
		System.out.println("Enter two numbers :");
		System.out.println("a= ");
		a=sc.nextInt();
		System.out.println("b= ");
		b=sc.nextInt();
		try {
			check(a,b);
		}catch(UnOpExcep uoe) {
			System.out.println("Error: "+uoe.getMessage());
			  
			if (uoe.getCause()!=null) {
				
				System.out.println("Cause by :"+ uoe.getCause());	
			}
		}
	}
	
	public static void check(double a,double b) throws UnOpExcep{
		try {
			double c=a/b;
			System.out.println("a/b = "+c);	
			System.out.println(""+c);	
		}catch(Exception e) {
			throw new UnOpExcep("Exception",e);
		}
	}

}
