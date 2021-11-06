package GenericsAssignment1;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class MainMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashSet<Employee> Empset=new HashSet();
		int ch;
		boolean isTrue=true;
		while(isTrue) {
			System.out.println("\n1.Add Employee ");
			System.out.println("2.Show details ");
			System.out.println("0.Exit ");
			System.out.print("\n\nEnter your choice :");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				Employee emp=new Employee();
				int id,salary;
				String name,dept;
				System.out.print("\nEnter Employee id : " );
				id=sc.nextInt();
				System.out.print("\nEnter Employee name : " );
				name=sc.next();
				System.out.print("\nEnter Employee Department : " );
				dept=sc.next();
				System.out.print("\nEnter Employee Salary : " );
				salary=sc.nextInt();
				emp.setDetails(id, salary, name, dept);
				Empset.add(emp);
				System.out.println("Employee added successfully....");
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				/*System.out.println("Enter empid to search");
				id=sc.nextInt();
				*/
				Iterator<Employee> it=Empset.iterator();
				while(it.hasNext()) {
					it.next().displayDetails();	
				}
				
			}
		}
		
	}

}
