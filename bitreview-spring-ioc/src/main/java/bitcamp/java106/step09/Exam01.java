// 프로퍼티 호출 
package bitcamp.java106.step09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam01 {

    public static void main(String[] args) {
        
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step10/application-context-01.xml");
        BeanUtils.printBeanNames(iocContainer);
        
        System.out.println(iocContainer.getBean("car"));
    }

}