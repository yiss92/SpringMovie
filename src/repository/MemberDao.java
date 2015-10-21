package repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mapper.MemberMapper;
import vo.Member;

@Component
public class MemberDao {
	private SqlSessionTemplate session;
	
	@Autowired
	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}
	
	public int insertMember(Member member){
		return session.getMapper(MemberMapper.class).insertMember(member);
	}
	
	public int updateMember(Member member){
		return session.getMapper(MemberMapper.class).updateMember(member);
	}
	
	public Member selectMember(String id){
		return session.getMapper(MemberMapper.class).select(id);
	}
	
	public List<Member> selectListMember(){
		return session.getMapper(MemberMapper.class).selectList();
	}
}
