package bitcamp.java106.pms.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import bitcamp.java106.pms.annotation.Component;

@Component
public class TeamMemberDao {

    private HashMap<String, ArrayList<String>> collection = new HashMap<>();

    public int addMember(String teamName, String memberId) {
        String teamNameLC = teamName.toLowerCase();
        String memberIdLC = memberId.toLowerCase();

        // 팀 이름으로 멤버 아이디가 들어 있는 ArrayList를 가져온다.
        ArrayList<String> members = collection.get(teamNameLC);

        // 해당 팀의 멤버가 추가된 적이 없다면,   
        if (members == null) { 
            members = new ArrayList<>();
            members.add(memberIdLC);
            collection.put(teamNameLC, members);
            return 1;
        }

        // ArrayList에 해당 아이디를 가진 멤버가 들어있다면,
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
        ArrayList<String> members = collection.get(teamName.toLowerCase());
        if (members == null)
            return null;
        return members.iterator();
    }
    
    public boolean isExist(String teamName, String memberId) {
        String teamNameLC = teamName.toLowerCase();
        String memberIdLC = memberId.toLowerCase();
        
        // 팀 이름으로 멤버 아이디가 들어 있는 ArrayList를 가져온다.
        ArrayList<String> members = collection.get(teamNameLC);
        if (members == null || !members.contains(memberIdLC))
            return false;
        return true;
    }

}
