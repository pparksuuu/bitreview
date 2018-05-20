package bitcamp.java106.pms;

import java.util.Scanner;

import bitcamp.java106.pms.controller.MemberController;
import bitcamp.java106.pms.controller.TeamController;
import bitcamp.java106.pms.util.Console;

// ver 0.1 - 팀 관리 기능(메서드)을 별도의 클래스로 옮긴다.
//           => controller.TeamController 클래스 추가
//           사용자 입력 기능을 별도의 클래스로 옮긴다.
//           => util.Console 클래스 추가
public class App {

    static Scanner keyScan = new Scanner(System.in);


    static String option = null;
    
    static void onQuit() {
        System.out.println("안녕히 가세요!");
    }

    static void onHelp() {
        System.out.println("팀 등록 명령 : team/add");
        System.out.println("팀 조회 명령 : team/list");
        System.out.println("팀 상세조회 명령 : team/view 팀명");

        System.out.println("=======================");

        System.out.println("회원 등록 명령 : member/add");
        System.out.println("회원 조회 명령 : member/list");
        System.out.println("회원 상세조회 명령 : member/view 아이디");

        System.out.println("=======================");
        System.out.println("종료 : quit");
    }

  

    public static void main(String[] args) {
        TeamController.keyScan = keyScan;
        MemberController.keyScan = keyScan;
        Console.keyScan = keyScan;
        
        while (true) {
            String[] arr = Console.prompt();

            String menu = arr[0];
            if (arr.length == 2) {
                option = arr[1];
            } else {
                option = null;
            }

            if (menu.equalsIgnoreCase("quit")) {
                onQuit();
                break;
            } else if (menu.equalsIgnoreCase("help")) {
                onHelp();
            } else if (menu.equalsIgnoreCase("team/add")) {
                TeamController.onTeamAdd();
            } else if (menu.equalsIgnoreCase("team/list")) {
                TeamController.onTeamList();
            } else if(menu.equalsIgnoreCase("team/view")) {
                TeamController.onTeamView(option);
            } else if(menu.equalsIgnoreCase("team/update")) {
                TeamController.onTeamUpdate(option);
            } else if(menu.equalsIgnoreCase("team/delete")) {
                TeamController. onTeamDelete(option);
            } else if (menu.equalsIgnoreCase("member/add")) {
                MemberController.onMemberAdd();
            } else if (menu.equalsIgnoreCase("member/list")) {
                MemberController.onMemberList();
            } else if (menu.equalsIgnoreCase("member/view")) {
                MemberController.onMemberView(option);
            } else if(menu.equalsIgnoreCase("member/update")) {
                MemberController.onMemberUpdate(option);
            } else if(menu.equalsIgnoreCase("member/delete")) {
                MemberController.onMemberDelete(option);
            }

            System.out.println();
        }
    }
}
