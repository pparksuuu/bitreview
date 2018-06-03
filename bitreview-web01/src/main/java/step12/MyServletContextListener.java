package step12;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("==>MyServletContextListener.contextInitialized()");
        
        // 웹 애플리케이션을 시작하자 마자 이 메서드를 호출하기 때문에
        // 이 메서드에서는 서블릿 컨테이너가 본격적으로 서블릿읋 실행하기 전에
        // 그 서블릿들이 작업하는데 필요한 도구를 준비시키는 코드를 둔다.
        // 예 ) 스프링 IoC 컨테이너를 준비.
    }

}
