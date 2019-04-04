package bitcamp.java106.step06_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam01 {
	public static void main(String[] args) {
		Car c = CarFactory.create("티코");
		System.out.println(c);
		ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
				"bitcamp/java106/step06_1/application-context-01.xml");
		
		System.out.println(iocContainer.getBean("c1"));
		System.out.println(iocContainer.getBean("c2"));
	}
}
