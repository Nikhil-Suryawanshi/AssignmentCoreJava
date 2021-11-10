package MavenDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	private static ApplicationContext context;
	public static void main(String[] args) {
		context =new ClassPathXmlApplicationContext("beans.xml");
		HelloBean hellobean =(HelloBean) context.getBean("HelloBean");
		hellobean.helloWorld();
		
		
	}

}
