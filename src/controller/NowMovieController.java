package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.NowMovieService;
import vo.NowMovie;

@Controller
public class NowMovieController {
	private NowMovieService service;
	@Autowired
	public void setService(NowMovieService service) {
		this.service = service;
	}
	///////////////////////////////
	
	@RequestMapping("/nowMovie.do")
	public ModelAndView nowMovie(){
		List<NowMovie> nowMovieList= service.selectNowMovieList();
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("now_movie");
		mv.addObject("nowMovieList", nowMovieList);
		
		return mv;
	}
	
	@RequestMapping("/nowMovieRead.do")
	public ModelAndView nowMovieRead(String movie_title){
		NowMovie nowMovie= service.selectMovie(movie_title);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("now_movie_read");
		mv.addObject("nowMovie", nowMovie);
		
		return mv;
	}
	
	
	
	
	
	
	@RequestMapping("/main.do")
	public ModelAndView main(String movie_title){
		String movieImage = service.selectMovieImage(movie_title);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		mv.addObject("movieImage", movieImage);
		
		return mv;
	
	}
	
}
