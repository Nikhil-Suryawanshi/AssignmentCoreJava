import java.util.Scanner;
public class ArrayOperations {
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,13,6,7,8,18,10,11,19,16,54,15};
		Scanner sc =new Scanner(System.in);
		int val;
		System.out.println("Enter the number to be searched");
		val = sc.nextInt();
		
		if(search(arr,val)) {
			System.out.println("Found the number");
		}
		else {
			System.out.println("The number is not present in the Array");
		}
		//Sorting code
		for(int i=0;i<15;i++) {
			for(int j=0;j<15-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					arr[j]=arr[j]+arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];
				}	
			}
		}
		for(int i=0;i<15;i++) {
			System.out.println("Arr["+i+"] = "+arr[i]);
		}
	}
	
	static boolean search(int arr[],int val) {
		int i;
		for(i=0;i<15;i++) {
			if(arr[i]==val) {
				break;
			}
		}
		if(i==15) {
			return false;
		}
		else
			return true;
	}
	
}