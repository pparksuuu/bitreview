// 프로퍼티 호출 
package bitcamp.java106.step06;

import java.sql.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam05 {

    public static void main(String[] args) {
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step06/application-context-05.xml");
        
        System.out.println(iocContainer.getBean("c1"));
    }

}