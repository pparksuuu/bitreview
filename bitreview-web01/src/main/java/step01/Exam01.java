package step01;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/step01/exam01")
public class Exam01 implements Servlet {
    ServletConfig config;

    public Exam01() {
        System.out.println("Exam01()");
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        // 객체 생성 (생성자가 호출된 후 ) 후 호출된다.
        // => 서블릿이 작업하는데 필요한 자원을 준비시키는 코드를 여기에 둔다.
        System.out.println("Exam01.init()");
        this.config = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        // 서블릿 프로그래밍을 하면서 서블릿에 대한 설정 정보가 필요할 때 호출한다.
        // => init()에서 파라미터로 받은 객체를 그대로.
        return this.config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res)
            throws ServletException, IOException {
        // 클라이언트가 이 서블릿의 실행을 요청할 때마다 호출됨.
        // => 서블릿이 해야할 일을 처리하는 코드를 여기에 둔다.
        System.out.println("Exam01.service()");
    }

    @Override
    public String getServletInfo() {
        // 서버 관리자 메뉴에서 서블릿에 대한 간단한 정보를 출력하려 할 때 호출된다.
        // => 서블릿에 대한 간단한 정보를 리턴한다.
        return "Exam01 서블릿!";
    }

    @Override
    public void destroy() {
        // 웹 애플리케이션을 멈추거나 서블릿 컨테이너를 종료할 때 호출된다.
        // => init() 에서 준비한 자원을 해제시키는 코드를 여기에 둔다.
        System.out.println("Exam01.destroy()");
    }
    
    
}
