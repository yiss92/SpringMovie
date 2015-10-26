package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import service.PreMovieService;
import vo.PreMovie;
import vo.PreMoviePage;

@Controller
public class PreMovieController {
	private PreMovieService service;
	
	@Autowired
	public void setService(PreMovieService service) {
		this.service = service;
	}
	
	
	@RequestMapping("/preMovie.do")
	public ModelAndView preMovie(@RequestParam(defaultValue = "1")int page){
		PreMoviePage preMoviePage = service.getPreMovicePage(page);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("pre_movie");
		mv.addObject("preMoviePage", preMoviePage);
		
		return mv;		
	}
	
	@RequestMapping("/PreMovieRead.do")
	public ModelAndView preMovieRead(String movieTitle){
		PreMovie preMovie = service.selectPreMovie(movieTitle);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("pre_movie_read");
		mv.addObject("preMovie", preMovie);
		
		return mv;
	}

}
