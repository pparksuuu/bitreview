package step18.ex06;

import java.util.List;

public class Exam06 {
    public static void main(String[] args) throws Exception {
        ApplicationContext appContext = new ApplicationContext("step18");
        List<Class> classes = appContext.classes;
        for (Class clazz : classes) {
            System.out.println(clazz.getName());
        }
    }
}
