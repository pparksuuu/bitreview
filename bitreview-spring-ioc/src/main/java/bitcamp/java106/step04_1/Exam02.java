package bitcamp.java106.step04_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam02 {
	public static void main(String[] args) {
		ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
				"bitcamp/java106/step04_1/application-context-02.xml");
		
		System.out.println(iocContainer.getBean("c1"));
		System.out.println(iocContainer.getBean("c2"));
	}
}
