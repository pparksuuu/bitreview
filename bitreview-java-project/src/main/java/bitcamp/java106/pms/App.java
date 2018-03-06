package bitcamp.java106.pms;

public class App {
    public static void main(String[] args) {
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        String teamName, description, startDate, endDate;
        int maxQty;

        System.out.print("팀명? ");
        teamName = keyScan.nextLine();

        System.out.print("설명? ");
        description = keyScan.nextLine();

        System.out.print("최대인원? ");
        maxQty = keyScan.nextInt();
        keyScan.nextLine();//nextInt()에서 남은 Enter를 받아와 Line을 바꿈.

        System.out.print("시작일? ");
        startDate = keyScan.nextLine();

        System.out.print("종료일? ");
        endDate = keyScan.nextLine();

        System.out.println("===========================");

        System.out.println("팀명: " + teamName);
        System.out.println("설명: \n" + description);
        System.out.print("최대인원: ");
        System.out.print(maxQty);
        System.out.println("명");
        System.out.println("일자 : " + startDate + " ~ " + endDate);
        

    }
}