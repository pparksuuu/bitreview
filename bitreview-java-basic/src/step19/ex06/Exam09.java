package step19.ex06;

import java.util.List;

public class Exam09 {
    public static void main(String[] args) throws Exception {
        ApplicationContext appContext = new ApplicationContext("step19.ex06");
        List<Object> objects = appContext.getObjects();
        for (Object obj : objects) {
            System.out.println(obj.getClass().getName());
        }
    }
}
