// 클래스의 종류 : 패키지 멤버 클래스 사용
package step17.ex01;

import java.io.File;
import java.io.FilenameFilter;

// Exam01_1 또한 패키지 멤버 클래스이다.
public class Exam01_5 {
    

    
    public static void main(String[] args) throws Exception {
        
      
        // anonymous class
        // => 인스턴스를 여러 개 만들 게 아니라면 클래스 이름 없이 nested class 정의
        // => 클래스 이름이 없기 때문에 나중에 new 연산자로 따로 인스턴스를 생성할 수 없다.
        //    그래서 nested class를 저으이하느 ㄴ순간 즉시 인스턴스를 만든다
        
        FilenameFilter javaFilter = new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith(".java"))
                    return true;
                return false;
            }
            
        };
        
        File dir = new File(".");
        
        
        String[] names = dir.list(javaFilter);
        for (String name : names) {
            System.out.println(name);
        }

    }
}
