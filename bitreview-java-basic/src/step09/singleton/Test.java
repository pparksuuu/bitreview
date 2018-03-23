package step09.singleton;

public class Test {

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        
        System.out.println("Singleton 적용 전 클래스");
        
        //Singleton 생성 후
        Car2 x1 = Car2.getInstance();
        Car2 x2 = Car2.getInstance();
        Car2 x3 = Car2.getInstance();
        if (x1 == x2) System.out.println("x1 == x2");
        if (x2 == x3) System.out.println("x2 == x3");
    }

}
