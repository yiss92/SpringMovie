package mapper;

import java.util.List;
import java.util.Map;

import vo.NowMovie;

public interface NowMovieMapper {
	public List<NowMovie> selectMovieList(Map<String, Integer> map);
	
	public NowMovie selectMovie(String movie_title);
	
	public String selectMovieImage(String movie_title);
	
	public int selectCount();
}
