package mapper;

import java.util.List;

import vo.NowMovie;

public interface NowMovieMapper {
	public List<NowMovie> selectMovieList();
	
	public NowMovie selectMovie(String movie_title);
	
	public String selectMovieImage(String movie_title);
}
