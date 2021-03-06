package bitcamp.java106.step09_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam03 {
	public static void main(String[] args) {
		ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
				"bitcamp/java106/step09_1/application-context-03.xml");
		
		BeanUtils.printBeanNames(iocContainer);
		System.out.println(iocContainer.getBean("car"));
	}
}
