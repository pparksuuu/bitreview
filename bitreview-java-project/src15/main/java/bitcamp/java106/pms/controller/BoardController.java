package bitcamp.java106.pms.controller;

import java.sql.Date;
import java.util.Scanner;

import bitcamp.java106.pms.dao.BoardDao;
import bitcamp.java106.pms.domain.Board;
import bitcamp.java106.pms.util.Console;

public class BoardController {
    Scanner keyScan;
    
    BoardDao boardDao = new BoardDao();

    public BoardController(Scanner scanner) {
        this.keyScan = scanner;
    }
    
    public void service(String menu, String option) {
         if (menu.equals("board/add")) {
            onBoardAdd();
        } else if (menu.equals("board/list")) {
            onBoardList();
        } else if (menu.equals("board/view")) {
            onBoardView(option);                
        } else if (menu.equals("board/update")) {
            onBoardUpdate(option);                
        } else if (menu.equals("board/delete")) {
            onBoardDelete(option);                
        } else {
            System.out.println("명령어가 올바르지 않습니다.");
        }
    }
    
    private void onBoardAdd() {
        System.out.println("[게시글 등록]");
        Board board = new Board();
        
        System.out.print("제목? ");
        board.title = keyScan.nextLine();

        System.out.print("내용? ");
        board.content = keyScan.nextLine();

        System.out.print("등록일? ");
        board.createdDate = Date.valueOf(keyScan.nextLine());

        // 회원 정보가 담겨있는 객체의 주소를 배열에 보관한다.
        boardDao.insert(board);
    }

    private void onBoardList() {
        System.out.println("[게시글 목록]");
        Board[] list = boardDao.list();
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) continue;
            System.out.printf("%d, %s, %s\n", 
                i ,list[i].title, list[i].createdDate);
        }
    }

    private void onBoardView(String no) {
        System.out.println("[게시글 정보 조회]");
        if (no == null) {
            System.out.println("게시물 번호를 입력하시기 바랍니다.");
            return;
        }
        
        Board board = boardDao.get(Integer.parseInt(no));
        
        if (board == null) {
            System.out.println("유효하지 않은 게시물 번호입니다.");
        } else {
            System.out.printf("제목: %s\n", board.title);
            System.out.printf("내용: %s\n", board.content);
            System.out.printf("등록일: %s\n", board.createdDate);
        }
    }

    private void onBoardUpdate(String no) {
        System.out.println("[게시글 변경]");
        if (no == null) {
            System.out.println("아이디를 입력하시기 바랍니다.");
            return;
        }
        
        Board board = boardDao.get(Integer.parseInt(no));

        if (board == null) {
            System.out.println("유효하지 않은 게시물 번호입니다.");
        } else {
            Board updateBoard = new Board();
            System.out.printf("제목(%s)? ", board.title);
            updateBoard.title = keyScan.nextLine();
            System.out.printf("내용(%s)? ", board.content);
            updateBoard.content = keyScan.nextLine();
            updateBoard.createdDate = board.createdDate;
            updateBoard.no = board.no;
            boardDao.update(updateBoard);
            System.out.println("변경하였습니다.");
        }
    }

    private void onBoardDelete(String no) {
        System.out.println("[게시물 삭제]");
        if (no == null) {
            System.out.println("아이디를 입력하시기 바랍니다.");
            return;
        }
        
        int i = Integer.parseInt(no);
        Board board = boardDao.get(i);

        if (board == null) {
            System.out.println("유효하지 않은 게시물 번호입니다.");
        } else {
            if (Console.confirm("정말 삭제하시겠습니까?")) {
                boardDao.delete(i);
                System.out.println("삭제하였습니다.");
            }
        }
    }
}
