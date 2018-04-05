// 클래스의 종류 : 패키지 멤버 클래스 사용
package step17.ex01;

import java.io.File;
import java.io.FilenameFilter;

// Exam01_1 또한 패키지 멤버 클래스이다.
public class Exam01_4 {
    

    
    public static void main(String[] args) throws Exception {
        
        //local class
        // => 특정 메서드 안에서만 사용할 클래스라면 "메서드" 안에 클래스를 저으이
        // => 메서드 안에 정의된 클래스를 local class라 한다.
        class JavaFilter implements FilenameFilter {

            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith(".java"))
                    return true;
                return false;
            }
            
        }
        
        File dir = new File(".");
        
        JavaFilter javaFilter = new JavaFilter();
        
        String[] names = dir.list(javaFilter);
        for (String name : names) {
            System.out.println(name);
        }

    }
}
