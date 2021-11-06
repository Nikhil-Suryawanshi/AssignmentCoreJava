
public class Main {
	public static void main(String args[]) {
		SingletoneClass obj1= SingletoneClass.getInstance();
		obj1.showValue();
		SingletoneClass obj2=SingletoneClass.getInstance();
		obj2.showValue();
	}
}
