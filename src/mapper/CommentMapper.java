package mapper;

import java.util.List;
import java.util.Map;

import vo.Comment;

public interface CommentMapper {
	public int insertComment(Comment comment);
	public int updateComment(Comment comment);
	public int deleteComment(int comment_num);
	
	public Comment selectComment(int comment_num);
	public List<Comment> selectCommentList(Map<String, Integer> map);
	public int selectCommentCount();
	
	public List<String> selectBest5();
	
}
