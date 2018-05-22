package step09.ex2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step09/ex2/exam01")
public class Exam01 extends HttpServlet {
    @Override
    protected void doGet(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        // 1) 파라미터 값을 꺼낸다.
        String name = request.getParameter("name");
        String age= request.getParameter("age");
        
        // 2) ServletRequest에 저장한다.
        request.setAttribute("이름", name);
        request.setAttribute("나이", age);
        System.out.println("-----------------------");
        
        // 3) ServletRequest에 저장된 값을 변경한다.
       request.setAttribute("이름", "박슈슈ㅜ");
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("  <meta charset='UTF-8'>");
        out.println("  <title>exam01</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>exam01 실행!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
