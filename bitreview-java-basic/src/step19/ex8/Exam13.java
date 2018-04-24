package step19.ex8;

// 의존 객체(dependancy Object)
// => 작업을 수행하기 위해 사용해야만 하는 객체
// => Car 클래스의 경우 Engine 클래스가 Car의 의존 객체이다.
// => Car의 move()를 실행하려면 Engine 객체가 있어야 한다.
//
// 의존 객체 준비
// => 일반적으로 의존 객체는 그 객체를 사용하는 측에서 생성한다.
// => 즉 Car 클래스에서 Engine 클래스를 사용하니까,
//    Car이 생성자에서 Engine 객체를 생성하였다.
public class Exam13 {
    public Exam13() {
        System.out.println("===> Exam13()");
    }
    
    public static void main(String[] args) throws Exception {
        // 새 Engine을 준비한다.
        UltraEngine engine = new UltraEngine();
        
        // Car 클래스는 Engine을 자체적으로 생성하여 사용하기 때문에
        // 새로 만든 엔진을 꼽을 수가 없다.
        Car car = new Car();
        car.move();
        System.out.println("==============================");
        Car2 car2 = new Car2(engine);
        car2.move();
    }
}
