package bitcamp.java106.step01_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Exam02 {
	public static void main(String[] args) {
		// 스프링 IoC 컨테이너는 ApplicationContext를 구현한다.
		ApplicationContext iocContainer = null;
		
		// FileSystemXmlApplicationContext 사용
		// => OS 파일시스템에서 지정된 경로의 파일을 찾는다.
		// => 파일시스템의 실제 경로를 지정하게 되면, 
		//    나중에 그 경로가 바뀌면 또 소스 코드를 변경해야 하는 문제가 있다.
		//    그래서 보통 ClassPathXmlApplicationContext를 많이 사용
		iocContainer = new FileSystemXmlApplicationContext(
				"file:///Users/SUHYEON/git/bitreview/bitreview-spring-ioc/src/main/java/bitcamp/java106/step01_1/application-context.xml");
		
		// IoC 컨테이너에 보관된 객체를 꺼내기
		Car car = (Car) iocContainer.getBean("c1");
		System.out.println(car);
	}
}
