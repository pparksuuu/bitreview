package bitcamp.java106.step08_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam03 {
	public static void main(String[] args) {
		// @Autowired 애노테이션을 처리할 객체를 등록해야만
		// 의존 객체가 자동으로 주입된다.
		// [동작원리]
		// 1) 스프링 IoC 컨테이너는 객체를 만든다.
		// 2) 프로퍼티 값을 설정한다.
		// 3) 객체 생성 후 @Autowired 애노테이션을 처리한다.
		//    => 단 @Autowired 애노테이션을 읽고 처리할 객체가 등록되어 있어야 한다.
		//
		ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
				"bitcamp/java106/step08_1/application-context-03.xml");
		
		System.out.println(iocContainer.getBean("c1"));
	}
}
