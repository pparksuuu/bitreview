package bitcamp.java106.step04_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam04 {
	public static void main(String[] args) {
		ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
				"bitcamp/java106/step04_1/application-context-04.xml");
	
	}
}
