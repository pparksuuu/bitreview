package bitcamp.java106.pms;


import bitcamp.java106.pms.util.Console;
import bitcamp.java106.pms.controller.TeamController;
import bitcamp.java106.pms.controller.MemberController;
import java.util.Scanner;

// ver 0.1 - 팀명으로 배열에서 팀 정보를 찾는 코드를 함수로 분리
//           => getTeamIndex() 추가
//           회원아이디로 배열에서 회원 정보를 찾는 코드를 함수로 분리
//           => getMemberIndex() 추가

public class App {
    // 클래스 변수 = 스태틱 변수
    // => 클래스 안에서 어디에서나 사용할 수 있는 변수이다.
    static Scanner keyScan = new Scanner(System.in);
    static String option = null; 

   

    public static void main(String[] args) {
        while (true) {
            Console.keyScan = keyScan;
            TeamController.keyScan = keyScan;
            MemberController.keyScan = keyScan;

            String[] arr = Console.prompt();

            String menu = arr[0];
            if (arr.length == 2) {
                option = arr[1];
            } else {
                option = null;
            }

            if (menu.equals("quit")) {
                Console.onQuit();
                break;
            }  else if (menu.equals("help")) {
                Console.onHelp();
            }  else if (menu.startsWith("team/")) {
                TeamController.service(menu, option);
            } else if(menu.startsWith("member/")) {
                MemberController.service(menu, option);
            }  else {
                System.out.println("명령어가 올바르지 않습니다.");
            }

            System.out.println();
        }
    }
}