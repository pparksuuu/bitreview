package bitcamp.java106.pms.controller;

import java.sql.Date;
import java.util.Scanner;

import bitcamp.java106.pms.dao.MemberDao;
import bitcamp.java106.pms.dao.TeamDao;
import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.domain.Team;
import bitcamp.java106.pms.util.Console;

public class TeamMemberController {
    Scanner keyScan;

    TeamDao teamDao = new TeamDao();
    MemberDao memberDao = new MemberDao();

    public TeamMemberController(Scanner scanner) {
        this.keyScan = scanner;
    }

    public void service(String menu, String option) {
        if (menu.equals("team/member/add")) {
            onTeamMemberAdd(option);
        } else if (menu.equals("team/member/list")) {
            onTeamMemberList(option);
        } else if (menu.equals("team/member/delete")) {
            onTeamMemberDelete(option);
        } else {
            System.out.println("명령어가 올바르지 않습니다.");
        }

    }



    private void onTeamMemberAdd(String teamName) {
        System.out.println("[팀 회원 추가]");
        if (teamName == null) {
            System.out.println("팀명을 입력하시기 바랍니다.");
            return; 
        }

        Team team = teamDao.get(teamName);

        if (team == null) {
            System.out.println(teamName + "팀은 존재하지 않습니다.");
            return;
        } 
        
        System.out.print("추가할 멤버의 아이디는? ");

        String id = keyScan.nextLine();
        Member member = memberDao.get(id);
        
        if (member == null) {
            System.out.println(id + "회원은 존재하지 않습니다.");
            return;
        }
        
        if (team.isExist(id)) {
            System.out.println("이미 등록된 회원입니다.");
            return;
        }
        
        team.addMember(member);
    }

    private void onTeamMemberList(String teamName) {
        System.out.println("[팀 목록]");
        Team[] list = teamDao.list();
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) continue;
            System.out.printf("%s, %d, %s ~ %s\n", 
                    list[i].name, list[i].maxQty, 
                    list[i].startDate, list[i].endDate);
        }
    }

    private void onTeamMemberDelete(String teamName) {
        System.out.println("[팀 정보 삭제]");
        if (teamName == null) {
            System.out.println("팀명을 입력하시기 바랍니다.");
            return; 
        }

        Team team = teamDao.get(teamName);

        if (team == null) {
            System.out.println("해당 이름의 팀이 없습니다.");
        } else {
            if (Console.confirm("정말 삭제하시겠습니까?")) {
                teamDao.delete(team.name);
                System.out.println("삭제하였습니다.");
            }
        }
    }

}
