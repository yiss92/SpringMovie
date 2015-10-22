package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.CommentDao;
import repository.NowMovieDao;
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
	
	public String selectMovieImage(String movie_title) {
		//�̷����ϸ� ��������? �ȳ��ðͰ�����???
		for(String a :cDao.selectBest5()){
		movie_title=dao.selectMovieImage(a);
		}
		
		return movie_title;
		
	}

}
