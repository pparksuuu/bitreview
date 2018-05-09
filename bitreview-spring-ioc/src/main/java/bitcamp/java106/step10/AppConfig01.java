package bitcamp.java106.step10;

import org.springframework.context.annotation.Bean;

public class AppConfig01 {
    // AnnotationConfigApplicationContext 는 @Bean이 붙은 메서드를 호출하여
    // 그 리턴 값을 컨테이너에 저장한다.
    // 객체의 이름을 지정하지 않으면 메서드 이름을 객체 이름으로 사용한다.
    @Bean
    public Car getCar() {
        Car c = new Car(null);
        c.setMaker("비트자동차");
        c.setModel("티코");
        c.setCc(890);
        c.setAuto(true);
        return c;
    }
    
    @Bean("car")
    public Car getCar2() {
        Car c = new Car(null);
        c.setMaker("비트자동차");
        c.setModel("티코");
        c.setCc(890);
        c.setAuto(true);
        return c;
    }

    @Bean 
    public Car car2() {
        Car c = new Car(null);
        c.setMaker("비트자동차");
        c.setModel("티코");
        c.setCc(890);
        c.setAuto(true);
        return c;
    }
}
