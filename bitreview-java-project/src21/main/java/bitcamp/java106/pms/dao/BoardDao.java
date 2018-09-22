package bitcamp.java106.pms.dao;

import java.util.LinkedList;

import bitcamp.java106.pms.domain.Board;

public class BoardDao {
    private LinkedList<Board> collection = new LinkedList<>();
    
    public void insert(Board board) {
        this.collection.add(board);
    }
    
    public Board[] list() {
        Board[] arr = new Board[this.collection.size()];
        for (int i = 0; i < this.collection.size(); i++) {
            arr[i] = (Board) this.collection.get(i);
        }
        return arr;
    }
    
    public Board get(int no) {
        int index = this.getBoardIndex(no);
        if (index < 0)
            return null;
        return (Board) collection.get(index);
    }
    
    public void update(Board board) {
        int index = this.getBoardIndex(board.getNo());
        if (index < 0)
            return;
        collection.set(index, board);
    }
    
    public void delete(int no) {
        int index = this.getBoardIndex(no);
        if (index < 0)
            return;
        collection.remove(index);
    }
    
    private int getBoardIndex(int no) {
        for (int i = 0; i < collection.size(); i++) {
            Board originBoard = 
                    (Board)collection.get(i);
            if (originBoard.getNo() == no) {
                return i;
            }
        }
        return -1;
    }
}
