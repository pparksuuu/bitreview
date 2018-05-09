package bitcamp.java106.pms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bitcamp.java106.pms.AppConfig;
import bitcamp.java106.pms.controller.Controller;

// 하는 일:
// => 클라이언트 요청이 들어오면 그 요청을 컨트롤러에게 위임하는 역할
// => 스프링 IoC 컨테이너를 사용하여 컨트롤러 및 DAO 등을 관리한다.

@WebServlet("/*") // 클라이언트의 모든 요청을 이 서블릿이 처리하겠다는 선언
public class DispatcherServlet implements Servlet{

    ApplicationContext iocContainer;
    ServletConfig config;   
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        //최초의 요청이 들어오면 딱 한 번 실행.
        // 서블릿이 실행하는데 필요한 자원을 준비하는 코드를 여기에 두면 된다.
        this.config = config;
        
        // 스프링 IoC 컨테이너 객체 생성
        // => 파라미터로 넘기는 값은 스프링 IoC 컨테이너 관련 설정작업을 수행하는 클래스 정보.
        iocContainer = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // 클라이언트 요청이 들어올 때 마다 서블릿 컨테이너가 호출하는 메서드
        // => 여기에 클라이언트 요청을 처리하는 코드를 두면 된다.
        // 파라미터의 값을 원래의 객체로 평변환 한다.
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        
        
        response.setHeader("Content-Type", "text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String path = request.getPathInfo();
        Controller controller = (Controller) iocContainer.getBean(path);
        
        if (controller != null) {
            controller.service(new ServerRequestAdapter(request), 
                    new ServerResponseAdapter(response));
        } else {
            out.println("해당 명령을 처리할 수 없습니다");
        }
        
    }

    @Override
    public String getServletInfo() {
        // TODO Auto-generated method stub
        return "요청 처리를 중계하는 서블릿";
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        
    }

}
