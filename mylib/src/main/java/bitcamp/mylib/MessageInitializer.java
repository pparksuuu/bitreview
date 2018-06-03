package bitcamp.mylib;

import java.util.Map;

public interface MessageInitializer {
    void onStartUp(Map<String,String> msgMap);
}
