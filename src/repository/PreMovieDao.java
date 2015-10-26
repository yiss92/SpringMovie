package repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mapper.PreMemberMapper;
import vo.PreMovie;
import vo.PreMoviePage;

@Component
public class PreMovieDao {	
	private SqlSessionTemplate session;
	
	@Autowired
	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}
	
	public List<PreMovie> selectList(int startRow,int rowCount){
		Map<String, Integer> map = new HashMap<>();
		map.put("startRow", startRow);
		map.put("rowCount", rowCount);
		return session.getMapper(PreMemberMapper.class).selectFileList(map);
	}
	
	public PreMovie selectPreMovie(String movieTitle){
		return session.getMapper(PreMemberMapper.class).select(movieTitle);
	}
	
	public String  selectMovieImage(String movieTitle){
		return session.getMapper(PreMemberMapper.class).selectMovieImage(movieTitle);
	}
	
	public int selectCount(){
		return session.getMapper(PreMemberMapper.class).PageTotalCount();
	}

}
