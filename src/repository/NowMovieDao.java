package repository;

import java.util.List;

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
	
	public List<NowMovie> selectList(){
		return session.getMapper(NowMovieMapper.class).selectMovieList();
	}
	
	public NowMovie selectMovie(String movie_title){
		return session.getMapper(NowMovieMapper.class).selectMovie(movie_title);
	}
	
	public String selectMovieImage(String movie_title){
		return session.getMapper(NowMovieMapper.class).selectMovieImage(movie_title);
	}
	
	
	
	
}
