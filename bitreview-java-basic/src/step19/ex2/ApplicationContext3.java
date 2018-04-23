package step19.ex2;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ApplicationContext3 {
    private ArrayList<File> list = new ArrayList<>();
    
    public ApplicationContext3(String packageName) {
        // 1) 패키지 이름에 포함된 .을 파일 경로의 /로 변경한다.
        String path = packageName.replace(".", "/");
        System.out.print(path);
        
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        URL url = classLoader.getResource(path);
        // 2) 해당 경로의 디렉터리를 classpath에서 찾아 실제 경로를 알아낸다.
        
        File dir = new File(url.getPath());
        
        if (!dir.isDirectory()) {
            return;
        }
        
        findFiles(dir);
        
    }
    
    private void findFiles(File dir) {
        File[] files = dir.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                findFiles(f);
            } else {
                this.list.add(f);
            }
        }
    }
    
    public List<File> getFiles() {
        return this.list;
    }
}
