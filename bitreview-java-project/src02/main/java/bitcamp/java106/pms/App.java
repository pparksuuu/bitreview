package bitcamp.java106.pms;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("팀명? ");
        String teamName = keyScan.nextLine();
        
        System.out.print("설명? ");
        String description = keyScan.nextLine();
        
        System.out.print("최대인원? ");
        int maxQty = keyScan.nextInt();
        
        keyScan.nextLine();
        
        System.out.print("시작일? ");
        String startDate = keyScan.nextLine();
        
        System.out.print("종료일? ");
        String endDate = keyScan.nextLine();
        
        System.out.println("----------------------------");
        
        System.out.printf("팀명: %s\n", teamName);
        System.out.printf("설명: %s\n", description);
        System.out.printf("최대인원: %d\n", maxQty);
        System.out.printf("일자: %s ~ %s\n", startDate, endDate);
    }
}
