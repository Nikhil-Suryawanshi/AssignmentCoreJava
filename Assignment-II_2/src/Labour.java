
public class Labour extends Employee{

	Labour(int empid, int age, String gender) {
		super(empid, age, gender);
		// TODO Auto-generated constructor stub
	}
	
	public void calSalary(int sal ,int overtime) {
		System.out.println("Total Salary of Labour: "+(sal+overtime));
	}

}
