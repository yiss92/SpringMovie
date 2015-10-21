package mapper;

import java.util.List;

import vo.Member;

public interface MemberMapper {
	public int insertMember(Member member);
	public int updateMember(Member member);
	public int deleteMember(String id);
	public Member select(String id);
	public List<Member> selectList();

}
