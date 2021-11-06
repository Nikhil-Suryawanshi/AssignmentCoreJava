package GenericsAssignment1;

public class Employee {
	int id,salary;
	String name,dept;
	
	public void setDetails(int id,int sal,String name,String dept) {
		this.id=id;
		salary=sal;
		this.name=name;
		this.dept=dept;
	}
	
	public void displayDetails() {
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("dept : "+dept);
		System.out.println("Salary : "+salary);
	}
}
