package bitcamp.java106.step06_1;

import java.sql.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam03 {
	public static void main(String[] args) {
		ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
				"bitcamp/java106/step06_1/application-context-03.xml");
		
		System.out.println(iocContainer.getBean("c1"));
		
	}
}
