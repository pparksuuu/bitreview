package step25.ex5;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam01_1 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = Resources.getResourceAsStream(
                "step25/ex5/mybatis-config.xml");
        
        // mybatis 설정 파일을 가지고 Builder를 이용하여
        // SqlSession 공장 객체를 생성.
        SqlSessionFactory factory = 
                new SqlSessionFactoryBuilder().build(inputStream);
        
        // SqlSession 공장 객체로부터 SqlSession 객체를 얻는다.
        SqlSession sqlSession = factory.openSession();
        
        System.out.println("mybatis 준비 완료!");
        
        sqlSession.close();
        
        
    }
}




