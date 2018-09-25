package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.annotation.Component;
import bitcamp.java106.pms.domain.Member;

@Component
public class MemberDao extends AbstractDao<Member> {
    
    @Override
    public int indexOf(Object key) {
        String id = (String) key;
        for (int i = 0; i < collection.size(); i++) {
            Member originMember = (Member) collection.get(i);
            if (originMember.getId().toLowerCase().equals(id.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }
}
