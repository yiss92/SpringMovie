package repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mapper.CommentMapper;
import vo.Comment;
import vo.NowMovie;

@Component
public class CommentDao {
	SqlSessionTemplate session;

	@Autowired
	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}

	/////////////////////////////////////

	public int insert(Comment comment) {
		return session.getMapper(CommentMapper.class).insertComment(comment);
	}

	public int update(Comment comment) {
		return session.getMapper(CommentMapper.class).updateComment(comment);
	}

	public int delete(int comment_num) {
		return session.getMapper(CommentMapper.class).deleteComment(comment_num);
	}

	//
	
	
	public Comment select(int comment_num) {
		return session.getMapper(CommentMapper.class).selectComment(comment_num);
	}

	public List<Comment> selectList(int startRow, int rowCount) {
		Map<String, Integer> map = new HashMap<>();
		map.put("startRow", startRow);
		map.put("rowCount", rowCount);
		return session.getMapper(CommentMapper.class).selectCommentList(map);
	}

	public int selectCount(){
		return session.getMapper(CommentMapper.class).selectCommentCount();
	}
	
	//
	
	
	public List<NowMovie> selectBest5(){
		return session.getMapper(CommentMapper.class).selectBest5();
	}
	
	public List<Comment> nowMovieComent(String movie_title){
		return session.getMapper(CommentMapper.class).nowMovieComent(movie_title);
	}
	
	public String nowMovieAvg(String movie_title){
		return session.getMapper(CommentMapper.class).nowMovieAvg(movie_title);
	}
	
}
