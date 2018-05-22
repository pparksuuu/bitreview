package step09.ex1;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/step09/ex1/*")
public class Filter1 implements Filter{
    FilterConfig config;
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // 최초로 필터 객체가 생성될 때 호출된다.
        // 필터가 작업할 때 사용할 도구를 준비시키는 코드를 여기에 둔다.
        this.config = filterConfig;
        System.out.println("Filter1.init()");
    }
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // 서블릿을 실행하기 전에 필터가 적용될 때마다 호출된다.
        // 서블릿이 클라이언트 요청을 처리하는데 필요한 것들은 여기에서 준비
        
        System.out.println("Filter1.doFilter() : before");
        
        // 필터의 작업을 수행한 후 다음 필터를 실행한다.
        // 만약 다음 필터가 없으면 원래 목적지인 서블릿을 실행.ㅌ`
        chain.doFilter(request, response);
        
        // 서블릿을 실행한 후에 수행할 작업이 있다면 바로 chain.doFilter() 다음에 두어라 !
        System.out.println("Filter1.doFilter() : after");
    }

}
