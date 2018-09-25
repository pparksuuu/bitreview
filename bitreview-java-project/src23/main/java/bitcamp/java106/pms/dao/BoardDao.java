package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.annotation.Component;
import bitcamp.java106.pms.domain.Board;

@Component
public class BoardDao extends AbstractDao<Board> {

    @Override
    public int indexOf(Object key) {
        int no = (Integer) key; // Integer ==> int : auto-unboxing
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
