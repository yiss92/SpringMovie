package repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mapper.NowMovieMapper;
import vo.Comment;
import vo.NowMovie;

@Component
public class NowMovieDao {

	private SqlSessionTemplate session;
	@Autowired
	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}
	
	/////////////////////////////////////////
	
	public List<NowMovie> selectList(int startRow,int rowCount){
		Map<String, Integer> map=new HashMap<>();
		map.put("startRow", startRow);
		map.put("rowCount", rowCount);
		return session.getMapper(NowMovieMapper.class).selectMovieList(map);
	}
	
	public NowMovie selectMovie(String movie_title){
		return session.getMapper(NowMovieMapper.class).selectMovie(movie_title);
	}
	
	public String selectMovieImage(String movie_title){
		return session.getMapper(NowMovieMapper.class).selectMovieImage(movie_title);
	}
	
	public int selectCount(){
		return session.getMapper(NowMovieMapper.class).selectCount();
	}
	
	
}
