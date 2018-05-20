package bitcamp.java106.pms.controller;

import java.util.Scanner;

import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.util.Console;

public class MemberController {
    
    public static Scanner keyScan;
    
    static Member[] members = new Member[1000];
    static int memberIndex = 0;
    
    static int getMemberIndex(String id) {
        for (int i = 0; i < memberIndex; i++) {
            if (members[i] == null) continue;
            if (id.equalsIgnoreCase(members[i].id)) {
                return i;
            }
        }
        return -1;
    }
    

    public static void onMemberAdd() {
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

    public static void onMemberList() {
        System.out.println("[회원 목록]");
        for (int i = 0; i < memberIndex; i++) {
            if (members[i] == null) continue;
            System.out.printf("%s, %s, %s\n",
                    members[i].id,
                    members[i].email,
                    members[i].password);
        }
    }

    public static void onMemberView(String id) {
        if (id == null) {
            System.out.println("아이디를 입력해주세요");
            return;
        }

        Member member = null;

        int i = getMemberIndex(id);

        if (i == -1) {
            System.out.println("해당 아이디의 회원이 없습니다.");
        } else {
            System.out.printf("아이디 : %s\n", members[i].id);
            System.out.printf("이메일 : %s\n", members[i].email);
            System.out.printf("암호 : %s\n", members[i].password);
        }
    }

    public static void onMemberUpdate(String id) {
        if (id == null) {
            System.out.println("아이디를 입력해주세요");
            return;
        }

        Member member = null;

        int i = getMemberIndex(id);

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

    public static void onMemberDelete(String id) {

        if (id == null) {
            System.out.println("아이디를 입력하시기 바랍니다.");
            System.out.println();
            return;
        }

        Member member = null;

        int i = getMemberIndex(id);

        if (i == -1) {
            System.out.println("해당 이름의 회원이 없습니다.");
        } else {
            if (Console.confirm("정말 삭제하시겠습니까?")) {
                members[i] = null;
                System.out.println("삭제하였습니다.");
            } 
        }
    }

}
