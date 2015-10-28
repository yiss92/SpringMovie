package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.CommentDao;
import repository.NowMovieDao;
import vo.Comment;
import vo.NowMovie;
import vo.NowMoviePage;

@Component
public class NowMovieService {
	private NowMovieDao dao;

	@Autowired
	public void setDao(NowMovieDao dao) {
		this.dao = dao;
	}

	private CommentDao cDao;

	@Autowired
	public void setcDao(CommentDao cDao) {
		this.cDao = cDao;
	}

	///////////////////////////////////
	public NowMoviePage getNowMoviePage(int requestPage){
		final int COUNT_PER_PAGE=6;
		
		int totalMovie = dao.selectCount();
		if(totalMovie ==0){
			return new NowMoviePage();
		}
		
		int totalPage = totalMovie / COUNT_PER_PAGE + 1;
        if ( totalMovie % COUNT_PER_PAGE == 0) {
             totalPage = totalMovie / COUNT_PER_PAGE;
       }
        //
        
        int startRow = (requestPage-1)*COUNT_PER_PAGE;
        List<NowMovie> nowMovieList =dao.selectList(startRow, COUNT_PER_PAGE);
        //
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

        return new NowMoviePage(nowMovieList, startPage, endPage, totalPage);
	}
	
	

	public NowMovie selectMovie(String movie_title){
		return dao.selectMovie(movie_title);
	}
	
	public List<Comment> nowMovieComent(String movie_title){
		return cDao.nowMovieComent(movie_title);
	}

	public String nowMovieAvg(String movie_title){
		return cDao.nowMovieAvg(movie_title);
	}
	
	public List<NowMovie> selectMovieImage() {
		return cDao.selectBest5(); //이게 리스트로 된 영화이름5개
		
	}

}
