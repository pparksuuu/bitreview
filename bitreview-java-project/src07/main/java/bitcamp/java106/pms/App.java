package bitcamp.java106.pms;

import java.util.Scanner;

import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.domain.Team;

// ver 0.2 - 사용자에게 yes/no를 묻는 코드를 메서드로 분리한다.
//           confirm() 추가
// ver 0.1 - 팀명으로 배열에서 팀 정보를 찾는 코드를 함수로 분리한다.
//           => getTeamIndex() 추가
//           회원 아이디로 배열에서 회원 정보를 찾는 코드를 함수로 분리한다.
//           => getMemberIndex() 추가
public class App {

    static Scanner keyScan = new Scanner(System.in);

    static Team[] teams = new Team[1000];
    static Member[] members = new Member[1000];

    static int teamIndex = 0;
    static int memberIndex = 0;

    static String option = null;

    static boolean confirm(String message) {
        System.out.printf("%s (y/N)", message);
        String input = keyScan.nextLine();
        if (input.equalsIgnoreCase("y")) 
            return true;
        else
            return false;
    }

    static int getTeamIndex(String name) {
        for (int i = 0; i < teamIndex; i++) {
            if (teams[i] == null) continue;
            if (option.equalsIgnoreCase(teams[i].name)) {
                return i;
            }
        }
        return -1;
    }

    static int getMemberIndex(String id) {
        for (int i = 0; i < memberIndex; i++) {
            if (members[i] == null) continue;
            if (option.equalsIgnoreCase(members[i].id)) {
                return i;
            }
        }
        return -1;
    }


    static String[] prompt() {
        System.out.print("명령 > ");
        return keyScan.nextLine().split(" ");
    }

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

    static void onTeamAdd() {
        System.out.println("[팀 정보 입력]");
        Team team = new Team();

        System.out.print("팀명? ");
        team.name = keyScan.nextLine();

        System.out.print("설명? ");
        team.description = keyScan.nextLine();

        System.out.print("최대인원? ");
        team.maxQty = keyScan.nextInt();
        keyScan.nextLine();

        System.out.print("시작일? ");
        team.startDate = keyScan.nextLine();

        System.out.print("종료일? ");
        team.endDate = keyScan.nextLine();

        teams[teamIndex++] = team;
    }

    static void onTeamList() {
        System.out.println("[팀 조회]");

        for (int i = 0; i < teamIndex; i++) {
            if (teams[i] == null) continue;
            System.out.printf("%s, %d, %s ~ %s\n",
                    teams[i].name,
                    teams[i].maxQty,
                    teams[i].startDate, teams[i].endDate);
        }
        System.out.println();
    }

    static void onTeamView() {
        System.out.println("[팀 정보 조회]");

        if (option == null) {
            System.out.println("팀명을 입력하시기 바랍니다.");
            return;
        }


        int i = getTeamIndex(option);

        if (i == -1) {
            System.out.println("해당 이름의 팀이 없습니다.");
        } else {
            Team team = teams[i];
            System.out.printf("팀명: %s\n", team.name);
            System.out.printf("설명: %s\n", team.description);
            System.out.printf("최대인원: %d\n", team.maxQty);
            System.out.printf("기간: %s ~ %s\n", 
                    team.startDate, team.endDate);
        }
    }

    static void onTeamUpdate() {
        if (option == null) {
            System.out.println("팀명을 입력해주세요");
            return;
        }


        int i = getTeamIndex(option);

        if (i == -1) {
            System.out.println("해당 이름의 팀이 없습니다.");
        } else {
            Team updateTeam = new Team();

            System.out.printf("팀명(%s)?", teams[i].name);
            updateTeam.name = keyScan.nextLine();

            System.out.printf("설명(%s)?", teams[i].description);
            updateTeam.description = keyScan.nextLine();

            System.out.printf("최대인원(%d)?", teams[i].maxQty);
            updateTeam.maxQty = keyScan.nextInt();
            keyScan.nextLine();

            System.out.printf("시작일(%s)?", teams[i].startDate);
            updateTeam.startDate = keyScan.nextLine();

            System.out.printf("종료일(%s)?", teams[i].endDate);
            updateTeam.endDate = keyScan.nextLine();
            teams[i] = updateTeam;

        }
    }

    static void onTeamDelete() {

        if (option == null) {
            System.out.println("팀명을 입력하시기 바랍니다.");
            System.out.println();
            return;
        }

        Team team = null;

        int i = getTeamIndex(option);

        if (i == -1) {
            System.out.println("해당 이름의 팀이 없습니다.");
        } else {
            if (confirm("정말 삭제하시겠습니까?")) {
                teams[i] = null;
                System.out.println("삭제하였습니다.");
            } 
        }
    }

    static void onMemberAdd() {
        System.out.println("[회원 정보 입력]");
        Member member = new Member();

        System.out.print("아이디? ");
        member.id = keyScan.nextLine();

        System.out.print("이메일? ");
        member.email = keyScan.nextLine();

        System.out.print("암호?");
        member.password = keyScan.nextLine();

        members[memberIndex++] = member;
    }

    static void onMemberList() {
        System.out.println("[회원 목록]");
        for (int i = 0; i < memberIndex; i++) {
            if (members[i] == null) continue;
            System.out.printf("%s, %s, %s\n",
                    members[i].id,
                    members[i].email,
                    members[i].password);
        }
    }

    static void onMemberView() {
        if (option == null) {
            System.out.println("팀명을 입력해주세요");
            return;
        }

        Member member = null;

        int i = getMemberIndex(option);

        if (i == -1) {
            System.out.println("해당 이름의 회원이 없습니다.");
        } else {
            System.out.printf("아이디 : %s\n", members[i].id);
            System.out.printf("이메일 : %s\n", members[i].email);
            System.out.printf("암호 : %s\n", members[i].password);
        }
    }

    static void onMemberUpdate() {
        if (option == null) {
            System.out.println("아이디를 입력해주세요");
            return;
        }

        Member member = null;

        int i = getMemberIndex(option);

        if (i == -1) {
            System.out.println("해당 이름의 회원이 없습니다.");
        } else {
            Member updateMember = new Member();

            System.out.printf("아이디(%s)?", members[i].id);
            updateMember.id = keyScan.nextLine();

            System.out.printf("이메일(%s)?", members[i].email);
            updateMember.email = keyScan.nextLine();

            System.out.printf("비밀번호(%s)?", members[i].password);
            updateMember.password = keyScan.nextLine();

            members[i] = updateMember;
        }
    }

    static void onMemberDelete() {

        if (option == null) {
            System.out.println("아이디를 입력하시기 바랍니다.");
            System.out.println();
            return;
        }

        Member member = null;

        int i = getMemberIndex(option);

        if (i == -1) {
            System.out.println("해당 이름의 회원이 없습니다.");
        } else {
            if (confirm("정말 삭제하시겠습니까?")) {
                members[i] = null;
                System.out.println("삭제하였습니다.");
            } 
        }
    }

    public static void main(String[] args) {

        while (true) {
            String[] arr = prompt();

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
                onTeamAdd();
            } else if (menu.equalsIgnoreCase("team/list")) {
                onTeamList();
            } else if(menu.equalsIgnoreCase("team/view")) {
                onTeamView();
            } else if(menu.equalsIgnoreCase("team/update")) {
                onTeamUpdate();
            } else if(menu.equalsIgnoreCase("team/delete")) {
                onTeamDelete();
            } else if (menu.equalsIgnoreCase("member/add")) {
                onMemberAdd();
            } else if (menu.equalsIgnoreCase("member/list")) {
                onMemberList();
            } else if (menu.equalsIgnoreCase("member/view")) {
                onMemberView();
            } else if(menu.equalsIgnoreCase("member/update")) {
                onMemberUpdate();
            } else if(menu.equalsIgnoreCase("member/delete")) {
                onMemberDelete();
            }

            System.out.println();
        }
    }
}
