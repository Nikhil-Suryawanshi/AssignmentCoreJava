
public class Manager extends Employee{

	
	Manager(int empid, int age, String gender) {
		super(empid, age, gender);
		// TODO Auto-generated constructor stub
	}

	public void calSalary(int sal ,int incentive) {
		System.out.println("Total Salary of Manager: "+(sal+incentive));
	}
}
