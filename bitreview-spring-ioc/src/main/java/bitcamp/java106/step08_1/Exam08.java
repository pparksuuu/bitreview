package bitcamp.java106.step08_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam08 {
	public static void main(String[] args) {
		// @Qualifier 애노테이션을 붙이면,
		// 같은 타입의 객체가 여러 개 있다 하더라도 그 중에 지정된 이름을 갖는 객체가 주입된다.
		// 그러나, 막상 실행을 하면 Engine 객체가 여러 개 있다고 오류가 발생
		// 이유는?
		// => @Qualifier 애노테이션을 처리할 BeanPostProcessor가 없기 떄문
		// 해결책?
		// => @Qualifier 애노테이션을 처리할 BeanPostProcessor를 등록하면 된다.
		//
		// @Autowired 애노테이션을 처리할 객체를 등록해야만
		// 의존 객체가 자동으로 주입된다.
		// [동작원리]
		// 1) 스프링 IoC 컨테이너는 객체를 만든다.
		// 2) 프로퍼티 값을 설정한다.
		// 3) 객체 생성 후 @Autowired 애노테이션을 처리한다.
		//    => 단 @Autowired 애노테이션을 읽고 처리할 객체가 등록되어 있어야 한다.
		//
		ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
				"bitcamp/java106/step08_1/application-context-08.xml");
		
		System.out.println(iocContainer.getBean("c1"));
		BeanUtils.printBeanNames(iocContainer);
	}
}
