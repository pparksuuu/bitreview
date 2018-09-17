package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.domain.Member;

public class MemberDao {
    Member[] members = new Member[1000];
    int memberIndex = 0;
    
    public void insert(Member member) {
        members[memberIndex++] = member;
    }
    
    public Member[] list() {
        Member[] arr = new Member[memberIndex];
        for (int i = 0; i < memberIndex; i ++) {
            arr[i] = members[i];
        }
        return arr;
    }
    
    public Member get(String id) {
        int i = getMemberIndex(id);
        
        if (i == -1) 
            return null;
        return members[i];
    }
    
    public void update(Member member) {
        int i = getMemberIndex(member.getId());
        
        if (i != -1)
            members[i] = member;
    }
    
    public void delete(String id) {
        int i = getMemberIndex(id);
        if (i != -1)
            members[i] = null;
    }
    
    private int getMemberIndex(String id) {
        for (int i = 0; i < memberIndex; i++) {
            if (members[i] == null) continue;
            if (id.equals(members[i].getId().toLowerCase())) {
                return i;
            }
        }
        return -1;
    }
}
