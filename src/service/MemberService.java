package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.MemberDao;
import vo.Member;

@Component
public class MemberService {
	private MemberDao dao;
	
	@Autowired
	public void setDao(MemberDao dao) {
		this.dao = dao;
	}
	
	public boolean insert(Member member){
		if(dao.insertMember(member)>0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean update(Member member){
		if(dao.updateMember(member)>0){
			return true;
		}else{
			return false;
		}		
	}
	
	public boolean delete(String id){
		if(dao.deleteMember(id)>0){
			return true;
		}else{
			return false;
		}
	}
	
	public Member select(String id){
		Member member = dao.selectMember(id);
		return member;
	}
	
	public List<Member> selectList(){
		List<Member> result = dao.selectListMember();
		return result;
	}

}
