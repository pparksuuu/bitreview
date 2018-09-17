package bitcamp.java106.pms.dao;

public class TeamMemberDao {
    
    private Object[][] teamMembers = new Object[1000][2];
    private int rowIndex;
    
    private int getIndex(String teamName, String memberId) {
        String ptn = teamName.toLowerCase();
        String pmi = memberId.toLowerCase();
        for (int i = 0; i < this.rowIndex; i++) {
            if (this.teamMembers[i][0] == null) continue;
            
            String tn = ((String)this.teamMembers[i][0]).toLowerCase();
            String mi = ((String)this.teamMembers[i][1]).toLowerCase();
            if (tn.equals(ptn) && mi.equals(pmi)) {
                return i;
            }
        }
        return -1;
    }
    
    public int addMember(String teamName, String memberId) {
        if (this.isExist(teamName, memberId)) {
            return 0;
        }
        this.teamMembers[rowIndex][0] = teamName;
        this.teamMembers[rowIndex][1] = memberId;
        rowIndex++;
        return 1;
    }
    
    public int deleteMember(String teamName, )
}
