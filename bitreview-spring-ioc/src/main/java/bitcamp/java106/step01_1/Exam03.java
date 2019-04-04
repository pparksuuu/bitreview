package bitcamp.java106.step01_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Exam03 {
	public static void main(String[] args) {
		// 스프링 IoC 컨테이너는 ApplicationContext를 구현한다.
		ApplicationContext iocContainer = null;
		
		// AnnotationConfigApplicationContext 사용
		// => 스프링 설정정보를 담고 있는 클래스 정보를 넘긴다.
		iocContainer = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car car = (Car) iocContainer.getBean("c1");
		System.out.println(car);
	}
}
