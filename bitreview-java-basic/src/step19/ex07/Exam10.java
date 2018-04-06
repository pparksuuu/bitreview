package step19.ex07;

import java.util.List;

public class Exam10 {
    
    int value;
    
    public Exam10() {
        this.value = 200;
    }
    
    public void print() {
        System.out.printf("value=%d\n", this.value);
    }
    public static void main(String[] args) throws Exception {
        ApplicationContext appContext = new ApplicationContext("step19.ex07");
        Exam10 obj = (Exam10) appContext.getBean("step19.ex07.Exam10");
        obj.print();
    }
}
