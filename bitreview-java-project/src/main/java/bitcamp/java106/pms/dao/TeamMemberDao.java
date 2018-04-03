package bitcamp.java106.pms.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.domain.Team;

public class TeamMemberDao {
    
    private HashMap<String, ArrayList<String>> collection = new HashMap<>();
    
    public int addMember(String teamName, String memberId) {
        String teamNameLC = teamName.toLowerCase();
        String memberIdLC = memberId.toLowerCase();
        
        ArrayList<String> members = collection.get(teamNameLC);
        if (members == null) {
            members = new ArrayList();
            members.add(memberId);
            collection.put(teamNameLC, members);
            return 1;
        }
        
        if (members.contains(memberIdLC)) {
            return 0;
        }
        
        members.add(memberIdLC);
        return 1;
        
    }

    
    public int deleteMember(String teamName, String memberId) {
        String teamNameLC = teamName.toLowerCase();
        String memberIdLC = memberId.toLowerCase();
        
        ArrayList<String> members = collection.get(teamNameLC);
        
        if (members == null || !members.contains(memberIdLC))
            return 0;
        
        members.remove(memberIdLC);
        return 1;
    }

    public Iterator<String> getMembers(String teamName) {
        ArrayList<String> members = collection.get(teamName);
        if (members == null) 
    }
    
    public boolean isExist(String teamName, String memberId) {
        if (this.getIndex(teamName, memberId) < 0) {
            return false;
        } else {
            return true;
        }
    }

    private int getMemberCount(String teamName) {
        int cnt = 0;
        String ptn = teamName.toLowerCase();
        for (int i = 0; i < teamCollection.size(); i++) {
            String tn = teamCollection.get(i).toString().toLowerCase();
            if (tn.equals(ptn)) {
                cnt++;
            }
        }
        return cnt;
    }
    
    public String[] getMembers(String teamName) {
        String ptn = teamName.toLowerCase();
        String[] members = new String[this.getMemberCount(teamName)];
        
        for (int i = 0, x = 0; i < teamCollection.size(); i++) {
            String tn = teamCollection.get(i).toString().toLowerCase();
            if (tn.equals(ptn)) {
                members[x++] = memberCollection.get(i).toString();
            }
        }
        return members;
    }
}
// 용어 정리!
// 메서드 시그너처(method signature) = 함수 프로토타입(function prototype)
// => 메서드의 이름과 파라미터 형식, 리턴 타입에 대한 정보를 말한다.

//ver 18 - ArrayList를 적용하여 객체(의 주소) 목록을 관리한다.
//ver 17 - 클래스 추가









