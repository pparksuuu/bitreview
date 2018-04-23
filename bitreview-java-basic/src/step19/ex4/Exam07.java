package step19.ex3;

import java.util.List;

public class Exam06 {
    public static void main(String[] args) throws Exception throws Exception {
        ApplicationContext5 appContext = new ApplicationContext5("step19.ex1");
        List<String> classnames = appContext.getFiles();
        for (String name : classnames ) {
            System.out.println(name);
        }
    }
}
