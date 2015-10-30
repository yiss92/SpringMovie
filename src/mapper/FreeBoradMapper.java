package mapper;

import java.util.List;
import java.util.Map;

import vo.FreeBoard;

public interface FreeBoradMapper {
	public int insertComment(FreeBoard freeBoard);
	public int updateComment(FreeBoard freeBoard);
	public int deleteComment(int boardNo);
	public FreeBoard selectComment(int boardNo);
	public List<FreeBoard> selectCommentList(Map<String, Integer> map);
	public int selectCommentTotalCount();
}
