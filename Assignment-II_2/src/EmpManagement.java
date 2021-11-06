import java.util.Scanner;
public class EmpManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee M1=new Manager(1001,27,"F");
		Employee L1=new Labour(2001,30,"M");
		
		M1.calSalary(20000, 1000);
		L1.calSalary(10000, 200);
	}

}
