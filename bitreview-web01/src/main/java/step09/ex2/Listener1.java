package step09.ex2;

import java.util.Date;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class Listener1 implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // 서블릿 컨테이너가 시작될 때 호출
        // => 여기에는 모든 서블릿들이 사용할 도구를 준비시키는 코드를 둔다.
        System.out.printf("Listener1.contextInitialized() - %s", new Date());
        
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // 서블릿 컨테이너가 종료될 떄 호출
        // => 여기에는 서블릿 컨테이너가 시작될 때 준비한 도구나 자원을 해제시키는 코드를 둔다.
        System.out.printf("Listener1.contextDestroyed() - %s", new Date());
    }
}
