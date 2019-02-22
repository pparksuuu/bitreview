package bitcamp.java106.pms.domain;

import java.sql.Date;

public class Board {
    private static int count = 1;
    
    private int no;
    private String title;
    private String content;
    private Date createdDate;
    
    public Board() {
        this.no = count++;
    }
    
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
    	// 외부에서 받은 번호가 count보다 클 때는 count ++
    	if (no >= count) {
    		count = no + 1;
    	}
        this.no = no;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    
    
}

// ver 18 - 게시물 객체의 고유 번호(no)를 static 변수(count)를 이용하여 자동 설정한다.
