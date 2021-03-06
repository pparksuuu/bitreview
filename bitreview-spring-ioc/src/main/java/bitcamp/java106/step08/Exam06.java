// 프로퍼티 호출 
package bitcamp.java106.step08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam06 {

    public static void main(String[] args) {
        // @Autowired 애노테이션을 인스턴스 변수에 붙여도 된다.
        // => 그러면 의존 객체를 직접 변수에 주입
        // => 셋터를 호출하지 않는다.
        // => 인스턴스 변수에 직접 의존 객체를 주입한다는 것은
        //    캡슐화, 즉 외부에서 직접 인스턴스 변수에 접근하는 것을 막는 기법, 를 
        //    위배하는 측면이 있기 때문에
        //    이 방식은 "객체지향을 파괴하는 방식"이라는 비난을 받는다.
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step08/application-context-06.xml");
        
        System.out.println(iocContainer.getBean("c1"));
    }

}