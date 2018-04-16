package step22.ex04;

public class Exam02_1 {
    public static void main(String[] args) throws Exception {
        DataOutputStream out = new DataOutputStream("temp/test4_2.data");
        
        Member member = new Member();
        member.name = "AB가각간";
        member.age = 27;
        member.gender = true;
        
        out.writeUTF(member.name);
        out.writeInt(member.age);
        out.writeBoolean(member.gender);
        
        out.close();
        
        System.out.println("데이터 출력 완료");
    }
}
