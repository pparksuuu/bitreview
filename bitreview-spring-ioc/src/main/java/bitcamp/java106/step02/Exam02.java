package bitcamp.java106.step02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam02 {
    public static void main(String[] args) {
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step02/application-context-03.xml");
        
        BeanUtils.printBeanList(iocContainer);
        
        // 빈의 아이디로 객체를 꺼내기
        Car obj1 = (Car) iocContainer.getBean("c1");
        Car obj2 = (Car) iocContainer.getBean("c1");
        if (obj1 == obj2) System.out.println("obj1 == obj2");
        
        Car obj3 = (Car) iocContainer.getBean("c2");
        Car obj4 = (Car) iocContainer.getBean("c2");
        if (obj3 == obj4) System.out.println("obj3 == obj4");
        
        Car obj5 = (Car) iocContainer.getBean("c3");
        Car obj6 = (Car) iocContainer.getBean("c3");
        if (obj5 != obj6) System.out.println("obj5 != obj6");
    }
}
