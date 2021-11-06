package ExceptionAssignment1;
import java.util.*;

public class AEHandling {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		double a,b;
		System.out.println("Enter two numbers :");
		System.out.println("a= ");
		a=sc.nextInt();
		System.out.println("b= ");
		b=sc.nextInt();
		sc.close();
		try {
			double c=(a/b);
			System.out.println("a/b = "+c);
		}catch(ArithmeticException ae) {
			System.out.println("Exception :"+ae.getMessage());
		}
	}

}
