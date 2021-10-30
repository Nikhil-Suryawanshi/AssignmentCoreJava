import java.util.Scanner;
public class Income_Tax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Annual CTC");
		int ctc =sc.nextInt();
		if(ctc<=180000) {
			System.out.println("Tax Amount : Nil");
		}
		if(ctc>180000 && ctc<=300000) {
			System.out.println("Tax Amount : "+ctc*0.1);
		}
		if(ctc>300000 && ctc<=500000) {
			System.out.println("Tax Amount : "+ctc*0.2);
		}
		if(ctc>500000 && ctc<=1000000) {
			System.out.println("Tax Amount : "+ctc*0.3);
		}
	}
	

}
