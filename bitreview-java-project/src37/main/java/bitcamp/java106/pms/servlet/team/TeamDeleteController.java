// Controller 규칙에 따라 메서드 작성
package bitcamp.java106.pms.servlet.team;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bitcamp.java106.pms.dao.TaskDao;
import bitcamp.java106.pms.dao.TeamDao;
import bitcamp.java106.pms.dao.TeamMemberDao;
import bitcamp.java106.pms.servlet.InitServlet;

@SuppressWarnings("serial")
@WebServlet("/team/delete")
public class TeamDeleteController extends HttpServlet {

    TeamDao teamDao;
    TeamMemberDao teamMemberDao;
    TaskDao taskDao;
    
    @Override
    public void init() throws ServletException {
        teamDao = InitServlet.getApplicationContext().getBean(TeamDao.class);
        teamMemberDao = InitServlet.getApplicationContext().getBean(TeamMemberDao.class);
        taskDao = InitServlet.getApplicationContext().getBean(TaskDao.class);
    }

    
    @Override
    protected void doGet(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta http-equiv='Refresh' content='1;url=list'>");
        out.println("<title>팀 삭제</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>팀 삭제 결과</h1>");
        
        try {
            teamMemberDao.delete(name);
            taskDao.deleteByTeam(name);
            int count = teamDao.delete(name);
    
            if (count == 0) {
                out.println("해당 이름의 팀이 없습니다.");
            } else {
                out.println("삭제하였습니다.");
            }
        } catch (Exception e) {
            out.println("삭제 실패!");
            e.printStackTrace(out);
        }
    }
    
}

//ver 31 - JDBC API가 적용된 DAO 사용
//ver 28 - 네트워크 버전으로 변경
//ver 26 - TeamController에서 delete() 메서드를 추출하여 클래스로 정의.
//ver 23 - @Component 애노테이션을 붙인다.
//ver 22 - TaskDao 변경 사항에 맞춰 이 클래스를 변경한다.
//ver 18 - ArrayList가 적용된 TeamDao를 사용한다.
//ver 16 - 인스턴스 변수를 직접 사용하는 대신 겟터, 셋터 사용.
// ver 15 - TeamDao를 생성자에서 주입 받도록 변경.
// ver 14 - TeamDao를 사용하여 팀 데이터를 관리한다.
// ver 13 - 시작일, 종료일을 문자열로 입력 받아 Date 객체로 변환하여 저장.