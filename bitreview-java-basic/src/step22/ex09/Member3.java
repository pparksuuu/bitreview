package step22.ex09;

//인스턴스의 값을 바이트 배열로 자동 변환(Serialize) 할 수 있도록 허가한다.

public class Member3 implements java.io.Serializable {
    
    private static final long serialVersionUID = 7;
    
    String name;
    int age;
    boolean gender; // true(여자), false(남자)
    
    String tel;

    @Override
    public String toString() {
        return "Member3 [name=" + name + ", age=" + age + ", gender=" + gender + ", tel=" + tel + "]";
    }
    


    
}
