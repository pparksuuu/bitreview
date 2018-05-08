// 프로퍼티 호출 
package bitcamp.java106.step08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam07 {

    public static void main(String[] args) {
        // @Qualifier 애노테이션을 붙이면,
        // 같은 타입의 객체가 여러 개 있다 하더라도 그 중 지정된 이름을 갖는 객체가 주입된다.
        // 얘도 BeanPostProcessor 등록해야한다.
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step08/application-context-07.xml");
        
        System.out.println(iocContainer.getBean("c1"));
        System.out.println("-------------------------------");
        
        BeanUtils.printBeanNames(iocContainer);
    }

}