package bitcamp.java106.pms;


import java.util.Scanner;
import bitcamp.java106.pms.domain.Team;
import bitcamp.java106.pms.domain.Member;

public class App {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);

        Team[] teams = new Team[1000];
        int teamCount = 0;

        Member[] members = new Member[1000];
        int memberCount = 0;

        while (true) {
            System.out.print("명령>");
            String[] arr = keyScan.nextLine().toLowerCase().split(" ");

            String menu = arr[0];

            String option = null;
            if (arr.length == 2) {
                option = arr[1];
            }


            if (menu.equals("help")) {
                System.out.println("팀 등록 명령 : team/add");
                System.out.println("팀 조회 명령 : team/list");
                System.out.println("팀 상세조회 명령 : team/view 팀명");
                System.out.println("회원 등록 명령 : member/add");
                System.out.println("회원 조회 명령 : member/list");
                System.out.println("회원 상세조회 명령 : member/view 아이디");
                System.out.println("종료 : quit");

            } else if (menu.equals("quit")) {
                System.out.println("안녕히 가세요!");
                break;

            } else if (menu.equals("team/add")) {
                System.out.println("[팀 등록]");
                
                Team team = new Team();

                System.out.print("팀명? ");
                team.teamName = keyScan.nextLine();

                System.out.print("설명? ");
                team.description = keyScan.nextLine();

                System.out.print("최대인원? ");
                team.maxQty = keyScan.nextInt();
                keyScan.nextLine();

                System.out.print("시작일? ");
                team.startDate = keyScan.nextLine();

                System.out.print("종료일? ");
                team.endDate = keyScan.nextLine();

                teams[teamCount++] = team;


            } else if (menu.equals("team/list")) {
                System.out.println("[팀 목록]");
                for (int i = 0; i < teamCount; i++) {
                    System.out.printf("%s, %s, %s ~ %s\n", 
                    teams[i].teamName, teams[i].maxQty, 
                    teams[i].startDate, teams[i].endDate);
                }

            } else if (menu.equals("team/view")) {
                if (option == null) {
                    System.out.println("팀명을 입력하시기 바랍니다.");
                    System.out.println();
                    continue;
                }

                for (int i = 0; i < teamCount; i++) {
                    if (option.equals((teams[i].teamName).toLowerCase())) {
                        System.out.printf("팀명: %s\n", teams[i].teamName);
                        System.out.printf("설명: %s\n", teams[i].description);
                        System.out.printf("최대인원: %s\n", teams[i].maxQty);
                        System.out.printf("기간: %s ~ %s\n", 
                        teams[i].startDate, teams[i].endDate);                        
                    } else {
                        System.out.println("해당 이름의 팀이 없습니다.");
                    }
                }


            } else if (menu.equals("member/add")) {
                System.out.println("[팀 등록]");
                
                Member member = new Member();

                System.out.print("아이디? ");
                member.id = keyScan.nextLine();

                System.out.print("이메일? ");
                member.email = keyScan.nextLine();

                System.out.print("암호? ");
                member.password = keyScan.nextLine();

                members[memberCount++] = member;


            } else if (menu.equals("member/list")) {
                System.out.println("[회원 목록]");
                for (int i = 0; i < memberCount; i++) {
                    System.out.printf("%s, %s, %s\n", 
                    members[i].id, members[i].email, members[i].password);
                }

            } else if (menu.equals("member/view")) {
                if (option == null) {
                    System.out.println("아이디를 입력하시기 바랍니다.");
                    System.out.println();
                    continue;
                }

                for (int i = 0; i < memberCount; i++) {
                    if (option.equals((members[i].id).toLowerCase())) {
                        System.out.printf("아이디: %s\n", members[i].id);
                        System.out.printf("이메일: %s\n", members[i].email);
                        System.out.printf("암호: %s\n", members[i].password);
                    } else {
                        System.out.println("해당 이름의 팀이 없습니다.");
                    }
                }


            } else {
                System.out.println("명령어가 올바르지 않습니다.");
            }

            System.out.println();
        }

    }
}