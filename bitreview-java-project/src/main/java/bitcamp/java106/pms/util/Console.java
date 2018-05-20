package bitcamp.java106.pms.util;

import java.util.Scanner;

public class Console {
    public static Scanner keyScan;
    
    public static boolean confirm(String message) {
        System.out.printf("%s (y/N)", message);
        String input = keyScan.nextLine();
        if (input.equalsIgnoreCase("y")) 
            return true;
        else
            return false;
    }
    
    public static String[] prompt() {
        System.out.print("명령 > ");
        return keyScan.nextLine().split(" ");
    }

}
