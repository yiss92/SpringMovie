package repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mapper.ReplyMapper;
import vo.Reply;

@Component
public class ReplyDao {
	
	private SqlSessionTemplate session;
	@Autowired
	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}
	
	///////////////////////////////////////
	
	public int insertReply(Reply reply){
		return session.getMapper(ReplyMapper.class).insertReply(reply);
	}
	
	public List<Reply> selectReply(int review_num){
		return session.getMapper(ReplyMapper.class).selectReply(review_num);
	}
	
	
}
