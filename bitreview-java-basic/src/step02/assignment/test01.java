package step02.assignment;

public class test01 {
    public static void main(String[] args) {
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        String name;
        int kor, eng, math;

        System.out.print("이름? ");
        name = keyScan.nextLine();

        System.out.print("국어? ");
        kor = keyScan.nextInt();

        System.out.print("영어? ");
        eng = keyScan.nextInt();

        System.out.print("수학? ");
        math = keyScan.nextInt();

        int sum = kor + eng + math;
        float average = sum / 3;

        System.out.println("========================");

        System.out.print(name);
        System.out.print(" " + kor);
        System.out.print(" " + eng);
        System.out.print(" " + math);
        System.out.print(" " + sum);
        System.out.print(" " + average);
        
        
        
    }
}