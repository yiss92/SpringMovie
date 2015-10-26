package mapper;

import java.util.List;
import java.util.Map;

import vo.PreMovie;

public interface PreMemberMapper {
	public int insertPreMovie(PreMovie preMovie);
	public int updatePreMovice(PreMovie preMovie);
	public int deletePreMovice(String movie_title);
	public PreMovie select(String movie_title);
	public List<PreMovie> selectFileList(Map<String, Integer> map);
	public int PageTotalCount();   
	
	public String selectMovieImage(String movieTitle);
}
