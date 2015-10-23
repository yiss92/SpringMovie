package mapper;

import java.util.List;
import java.util.Map;

import vo.FreeBoard;

public interface FreeBoradMapper {
	public int insertComment(FreeBoard message);
	public int updateComment(FreeBoard Content);
	public int deleteComment(int messageId);
	public FreeBoard selectComment(int messageId);
	public List<FreeBoard> selectCommentList(Map<String, Integer> map);
	public int selectCommentTotalCount();
}
