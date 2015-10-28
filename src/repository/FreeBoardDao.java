package repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mapper.FreeBoradMapper;
import vo.FreeBoard;

@Component
public class FreeBoardDao {
	private SqlSessionTemplate session;
	
	@Autowired
	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}
////////////////////////////////////////////////////////////////////////////////
	public int insert(FreeBoard comment){
		return session.getMapper(FreeBoradMapper.class)
				.insertComment(comment);
	}
	public int update(FreeBoard comment){
		return session.getMapper(FreeBoradMapper.class)
				.updateComment(comment);
	}
	public int delete(int id){
		return session.getMapper(FreeBoradMapper.class)
				.deleteComment(id);
	}
	public FreeBoard select(int id){
		return session.getMapper(FreeBoradMapper.class)
				.selectComment(id);
	}
	public List<FreeBoard> selectList(int startRow, int rowCount){
		Map<String, Integer> paramMap = new HashMap<>();
		paramMap.put("startRow", startRow);
		paramMap.put("rowCount", rowCount);
		
		return session.getMapper(FreeBoradMapper.class)
				.selectCommentList(paramMap);
	}
	public int selectCommentCount(){
		return session.getMapper(FreeBoradMapper.class)
				.selectCommentTotalCount();
	}
}
