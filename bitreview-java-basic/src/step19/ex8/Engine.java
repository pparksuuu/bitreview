package step19.ex8;

public class Engine {
    public Engine() {
        System.out.println("===> Engine()");
    }
    
    public void run() {
        System.out.println("엔진을 가동한다.");
    }

    @Override
    public String toString() {
        return "Engine [getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }
    
    
}
