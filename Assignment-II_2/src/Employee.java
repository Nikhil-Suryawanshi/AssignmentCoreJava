
public class Employee {
	int empid,age;
	String gender;
	
	Employee(int empid,int age,String gender){
		this.empid=empid;
		this.age=age;
		this.gender=gender;
	}
	public void calSalary(int sal,int bonus) {
		System.out.println("Inside Employee");
	}
	
}
