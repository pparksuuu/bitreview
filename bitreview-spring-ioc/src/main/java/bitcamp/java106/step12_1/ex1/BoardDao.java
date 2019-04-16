package bitcamp.java106.step12_1.ex1;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Component;

import bitcamp.java106.step12_1.Board;

@Component
public class BoardDao {
	
	SqlSessionFactory sqlSessionFactory;
	
	public BoardDao(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	public List<Board> selectList(int pageNo, int pageSize) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("startIndex", (pageNo - 1) * pageSize);
		params.put("pageSize", pageSize);
		
		try (SqlSession sqlSession = this.sqlSessionFactory.openSession()) {
			return sqlSession.selectList("BoardMapper.selectList", params);
		}
	}
}
