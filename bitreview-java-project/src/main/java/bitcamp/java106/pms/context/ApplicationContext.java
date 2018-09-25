package bitcamp.java106.pms.context;

import java.util.HashMap;
import java.util.Map;

public class ApplicationContext {
    private HashMap<String, Object> objPool = new HashMap<>();
    
    public ApplicationContext(String packageName, Map<String, Object> beans) throws Exception {
        // 다른 맵에서 들어있는 객체를 이 컨테이너에 복사한다.
        if (beans != null) {
            objPool.putAll(beans);
        }
         
        
    }
}
