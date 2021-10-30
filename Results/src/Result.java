import java.util.Scanner;
public class Result {

	public static void main(String[] args) {
		int marks[] =new int[3],gt60=0,lt60=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of 3 Subjects");
		for(int i=0;i<3;i++) {
			marks[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++) {
			if(marks[i]>=60) {
				gt60++;
			}
		}
		switch(gt60)
		{
			case 0:
				System.out.println("You are failed");
				break;
			case 1:
				System.out.println("You are failed");
				break;
			case 2:
				System.out.println("You are Promoted");
				break;
			case 3:
				System.out.println("You are Passed");
				break;
		}
	}

}
