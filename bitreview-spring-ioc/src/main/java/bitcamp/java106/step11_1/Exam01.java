package bitcamp.java106.step11_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam01 {
	public static void main(String[] args) {
		ApplicationContext iocContainer = new AnnotationConfigApplicationContext(
				AppConfig.class);
		
		BeanUtils.printBeanNames(iocContainer);
		
		System.out.println(iocContainer.getBean("car"));
	}
}
