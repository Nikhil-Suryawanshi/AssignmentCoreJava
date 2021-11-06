
public class SingletoneClass {
	int value=1;
	static SingletoneClass object=new SingletoneClass();
	
	private SingletoneClass() {
		
	}
	
	public static SingletoneClass getInstance() {
		return object;
	}
	
	public void showValue() {
		value++;
		System.out.println(value);
	}
}
