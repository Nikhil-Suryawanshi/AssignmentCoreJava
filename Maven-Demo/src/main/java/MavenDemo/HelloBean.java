package MavenDemo;

public class HelloBean {
	private String name;
	private int age;

	public HelloBean(String name) {
		this.name=name;
	}
	
	public HelloBean(int age) {
		this.age=age;
	}
	
	public HelloBean(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	/*
	public void setName(String name) {
		this.name = name;
	} 
	 */
	
	
	public void helloWorld() {
		System.out.println("Hello "+getName()+"  Age: "+getAge());
		
	}
}
