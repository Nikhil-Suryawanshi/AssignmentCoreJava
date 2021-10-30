import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[][] =new int [3][3];
		String sub[]= {"A","B","C"};
		for(int i=0;i<3;i++) {
			
			System.out.println("Enter the marks of Student "+(i+1));
			for(int j=0;j<3;j++) {
				System.out.println("Entet the marks of Subject "+sub[i]+" : ");
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<3;i++) {
			int sum = totalScore(arr[i]);
			System.out.println("\nTotal Score of Student "+(i+1)+" = "+sum);
			System.out.println("Average Score of Student "+(i+1)+" = "+avg(sum));
		}
		
		for(int i=0;i<3;i++) {
			int sum=0;
			for(int j=0;j<3;j++) {
				sum += arr[j][i];
			}
			System.out.println("\nTotal Score of Subject "+sub[i]+" scored by every student : "+sum);
			System.out.println("Average Score of Subject "+sub[i]+" = "+avg(sum));
		}
		
		
	}
	
	static double avg(int sum) {
		return sum/3;
	}
	
	static int totalScore(int arr[]) {
		int sum=0;
		for(int i=0;i<3;i++) {
			sum += arr[i];			
		}
		return sum;
	}
	

}
