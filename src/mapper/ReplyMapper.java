package mapper;

import java.util.List;

import vo.Reply;

public interface ReplyMapper {
	public int insertReply(Reply reply);
	
	public List<Reply> selectReply(int review_num);
	
	
}
