package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.PreMovieDao;
import vo.PreMovie;
import vo.PreMoviePage;

@Component
public class PreMovieService {
	private PreMovieDao dao;	
	
	@Autowired
	public void setDao(PreMovieDao dao) {
		this.dao = dao;
	}
	
	public PreMoviePage getPreMovicePage(int requestPage){
		final int COUNT_PER_PAGE=6;
		
		int totalMovie = dao.selectCount();
		
		if(totalMovie ==0){
			return new PreMoviePage();		
		}
		
		int totalPage = totalMovie / COUNT_PER_PAGE + 1;
        if ( totalMovie % COUNT_PER_PAGE == 0) {
             totalPage = totalMovie / COUNT_PER_PAGE;
       }
        
        int startRow = (requestPage-1)*COUNT_PER_PAGE;
        
        List<PreMovie> movieList = dao.selectList(startRow, COUNT_PER_PAGE);
        int startPage;
        if ( requestPage % 5 != 0) {
             startPage = ( requestPage / 5) * 5 + 1;
       } else {
             startPage = ( requestPage - 4);
       }

        int endPage = startPage + 4;
        if ( endPage > totalPage) {
             endPage = totalPage;
       }
        
        return new PreMoviePage(movieList, startPage, endPage, totalPage);
	}
	
	public PreMovie selectPreMovie(String movieTitle){
		return dao.selectPreMovie(movieTitle);
	}
	
//	public List<PreMovie> selectPreMovieImage(){
//		
//	}

}
