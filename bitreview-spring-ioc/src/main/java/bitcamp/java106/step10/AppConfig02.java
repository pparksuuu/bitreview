package bitcamp.java106.step10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // AppConfig02 클래스가 스프링 설정 정보를 갖고 있는 클래스임을 선포한다!
// 그러면 AnnotationConfigApplicationContext에서
// 이 클래스를 찾아 적절한 작업을 수행할 것이다.
public class AppConfig02 {
    // AnnotationConfigApplicationContext 는 @Bean이 붙은 메서드를 호출하여
    // 그 리턴 값을 컨테이너에 저장한다.
    // 객체의 이름을 지정하지 않으면 메서드 이름을 객체 이름으로 사용한다.

    @Bean 
    public Car car2() {
        Car c = new Car(null);
        c.setMaker("비트자동차");
        c.setModel("티코");
        c.setCc(890);
        c.setAuto(true);
        return c;
    }
    
    public Car car3() {
        Car c = new Car(null);
        c.setMaker("비트자동차");
        c.setModel("티코");
        c.setCc(890);
        c.setAuto(true);
        return c;
    }
}
