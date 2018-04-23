package step19.ex3;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;

public class ApplicationContext4 {
    private ArrayList<File> list = new ArrayList<>();
    
    public ApplicationContext4(String packageName) {
        String path = packageName.replace(".", "/");
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        URL url = classLoader.getResource(path);
        File dir = new File(url.getPath());
        if (!dir.isDirectory())
            return;
        filndFiles(dir);
    }
}
