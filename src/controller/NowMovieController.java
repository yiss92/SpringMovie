package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import service.NowMovieService;
import vo.Comment;
import vo.NowMovie;
import vo.NowMoviePage;

@Controller
public class NowMovieController {
	private NowMovieService service;
	@Autowired
	public void setService(NowMovieService service) {
		this.service = service;
	}
	///////////////////////////////
	
	@RequestMapping("/nowMovie.do")
	public ModelAndView nowMovie(@RequestParam(defaultValue = "1") int page){
		
		NowMoviePage nowMoviePage = service.getNowMoviePage(page);
		//코멘트가 없으면 영화가 리스트에 안나오네
		ModelAndView mv = new ModelAndView();
		mv.setViewName("now_movie");
		mv.addObject("nowMoviePage", nowMoviePage);
		
		return mv;
	}
	
	@RequestMapping("/nowMovieRead.do")
	public ModelAndView nowMovieRead(String movie_title){
		NowMovie nowMovie= service.selectMovie(movie_title);
		List<Comment> nowMovieComment = service.nowMovieComent(movie_title);
		String commentAvg = service.nowMovieAvg(movie_title);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("now_movie_read");
		mv.addObject("nowMovie", nowMovie);
		mv.addObject("nowMovieComment", nowMovieComment);
		mv.addObject("commentAvg", commentAvg);
		return mv;
	}
	
	
	@RequestMapping("/main.do")
	public ModelAndView main(){
		List<NowMovie> movieImage = service.selectMovieImage();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		mv.addObject("movieImage", movieImage);
		
		return mv;
	
	}
	
}
