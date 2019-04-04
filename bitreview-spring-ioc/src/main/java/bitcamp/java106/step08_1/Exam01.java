package bitcamp.java106.step08_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam01 {
	public static void main(String[] args) {
		ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
				"bitcamp/java106/step08_1/application-context-01.xml");
		
		// Car 객체를 꺼내 Engine 객체가 주입되었는지 확인해보자 !
		System.out.println(iocContainer.getBean("c1"));
	}
}
