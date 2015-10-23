package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.CommentDao;
import repository.NowMovieDao;
import vo.Comment;
import vo.NowMovie;

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

	public List<NowMovie> selectNowMovieList() {
		return dao.selectList();
	}

	public NowMovie selectMovie(String movie_title){
		return dao.selectMovie(movie_title);
	}
	
	public List<Comment> nowMovieComent(String movie_title){
		return cDao.nowMovieComent(movie_title);
	}
	
	public List<NowMovie> selectMovieImage() {
		return cDao.selectBest5(); //이게 리스트로 된 영화이름5개
		
	}

}
