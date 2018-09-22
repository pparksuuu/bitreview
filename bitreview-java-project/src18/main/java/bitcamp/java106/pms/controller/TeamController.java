package bitcamp.java106.pms.controller;

import java.sql.Date;
import java.util.Scanner;

import bitcamp.java106.pms.dao.TeamDao;
import bitcamp.java106.pms.domain.Team;
import bitcamp.java106.pms.util.Console;

public class TeamController {
    Scanner keyScan;
    TeamDao teamDao;
    
    public TeamController(Scanner scanner, TeamDao teamDao) {
        this.keyScan = scanner;
        this.teamDao = teamDao;
    }
    
    public void service(String menu, String option) {
        if (menu.equals("team/add")) {
            onTeamAdd();
        } else if (menu.equals("team/list")) {
            onTeamList();
        } else if (menu.equals("team/view")) {
            onTeamView(option);
        } else if (menu.equals("team/update")) {
            onTeamUpdate(option);
        } else if (menu.equals("team/delete")) {
            onTeamDelete(option);
        } else {
            System.out.println("명령어가 올바르지 않습니다.");
        }

    }
    
 
    
    private void onTeamAdd() {
        System.out.println("[팀 정보 입력]");
        Team team = new Team();

        System.out.print("팀명? ");
        team.setName(this.keyScan.nextLine());

        System.out.print("설명? ");
        team.setDescription(this.keyScan.nextLine());

        System.out.print("최대인원? ");
        team.setMaxQty(this.keyScan.nextInt());
        this.keyScan.nextLine(); 

        System.out.print("시작일? ");
        team.setStartDate(Date.valueOf(this.keyScan.nextLine()));

        System.out.print("종료일? ");
        team.setEndDate(Date.valueOf(this.keyScan.nextLine()));

        teamDao.insert(team);
    }

    private void onTeamList() {
        System.out.println("[팀 목록]");
        Team[] teams = teamDao.list();
        for (Team team : teams) {
            System.out.printf("%s, %d, %s ~ %s\n", 
                    team.getName(), team.getMaxQty(), 
                    team.getStartDate(), team.getEndDate());
        }
    }

    private void onTeamView(String name) {
        System.out.println("[팀 정보 조회]");
        if (name == null) {
            System.out.println("팀명을 입력하시기 바랍니다.");
            return; // 값을 리턴하면 안되기 때문에 return 명령만 작성한다.
                    // 의미? 즉시 메서드 실행을 멈추고 이전 위치로 돌아간다.
        }
        
        Team team = teamDao.get(name);

        if (team == null) {
            System.out.println("해당 이름의 팀이 없습니다.");
        } else {
            System.out.printf("팀명: %s\n", team.getName());
            System.out.printf("설명: %s\n", team.getDescription());
            System.out.printf("최대인원: %d\n", team.getMaxQty());
            System.out.printf("기간: %s ~ %s\n", 
                team.getStartDate(), team.getEndDate());
        }
    }

    private void onTeamUpdate(String name) {
        System.out.println("[팀 정보 변경]");
        if (name == null) {
            System.out.println("팀명을 입력하시기 바랍니다.");
            return;
        }
        
        Team team = teamDao.get(name);

        if (team == null) {
            System.out.println("해당 이름의 팀이 없습니다.");
        } else {
            Team updateTeam = new Team();
            System.out.printf("팀명 : %s\n ", team.getName());
            updateTeam.setName(team.getName());
            System.out.printf("설명(%s)? ", team.getDescription());
            updateTeam.setDescription(this.keyScan.nextLine());
            System.out.printf("최대인원(%d)? ", team.getMaxQty());
            updateTeam.setMaxQty(this.keyScan.nextInt());
            this.keyScan.nextLine();
            System.out.printf("시작일(%s)? ", team.getStartDate());
            updateTeam.setStartDate(Date.valueOf(this.keyScan.nextLine()));
            System.out.printf("종료일(%s)? ", team.getEndDate());
            updateTeam.setEndDate(Date.valueOf(this.keyScan.nextLine()));
            teamDao.update(updateTeam);
            System.out.println("변경하였습니다.");
        }
    }

    private void onTeamDelete(String name) {
        System.out.println("[팀 정보 삭제]");
        if (name == null) {
            System.out.println("팀명을 입력하시기 바랍니다.");
            return; 
        }
        
        Team team = teamDao.get(name);

        if (team == null) {
            System.out.println("해당 이름의 팀이 없습니다.");
        } else {
            if (Console.confirm("정말 삭제하시겠습니까?")) {
                teamDao.delete(team.getName());
                System.out.println("삭제하였습니다.");
            }
        }
    }

}
