package bitcamp.java106.step02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam03 {
    public static void main(String[] args) {
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step02/application-context-03.xml");
        
        BeanUtils.printBeanList(iocContainer);
        Car c1 = (Car) iocContainer.getBean("c1");
        Car c2 = (Car) iocContainer.getBean("c2");
        
        if (c1 != c2) System.out.println("c1 != c2");
        
        Car c3 = (Car) iocContainer.getBean("c3");
        if (c2 == c3) System.out.println("c2 == c3");
        
        System.out.println("------------------------------");
        BeanUtils.printBeanAliases(iocContainer, "c1");
        BeanUtils.printBeanAliases(iocContainer, "c2");
        BeanUtils.printBeanAliases(iocContainer, "c3");
    }
}
