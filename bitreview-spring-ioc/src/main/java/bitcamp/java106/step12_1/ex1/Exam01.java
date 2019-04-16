// Spring과 MyBatis 연동 : 단순 연동
package bitcamp.java106.step12_1.ex1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;
import bitcamp.java106.step12_1.Board;

public class Exam01 {
	public static void main(String[] args) {
		ApplicationContext iocContainer = 
				new ClassPathXmlApplicationContext("bitcamp/java106/step12_1/ex1/application-context.xml");
		
        BeanUtils.printBeanNames(iocContainer);
		
		BoardDao boardDao = iocContainer.getBean(BoardDao.class);
		
		List<Board> list = boardDao.selectList(1, 5);
		for (Board b : list) {
	        System.out.printf("%d, %s, %s\n", 
                    b.getNo(),
                    b.getTitle(),
                    b.getRegisteredDate());
		}
	}
}
