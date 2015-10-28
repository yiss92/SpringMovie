package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import service.FreeBoardService;
import vo.FreeBoard;
import vo.FreeBoardPage;
import vo.ReviewPage;

@Controller
public class FreeBoardController {
	private FreeBoardService service;
	@Autowired
	public void setService(FreeBoardService service) {
		this.service = service;
	}
////////////////////////////////////////////////////////////////////////////
	@RequestMapping("/freeboard.do")
	public ModelAndView FreeBoardMain(@RequestParam(defaultValue = "1")int page){
		FreeBoardPage freeboardPage = service.getFreeBoradPage(page);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("freeboard_main");
		mv.addObject("freeboardPage", freeboardPage);
		
		return mv;
	}
	
	@RequestMapping("/writeFreeBoardForm.do")
	public String writeForm() {
		return "write_freeboard_form";
	}
	
	@RequestMapping("/modifyFreeBoardForm.do")
	public ModelAndView modifyFreeBoardForm(int id){
		FreeBoard original = service.regardlessOfReadCount(id);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("original", original);
		mv.setViewName("modify_freeboard_form");
		
		return mv;
	}
	
	@RequestMapping("/successModify.do")
	public String successModify(FreeBoard freeBoard, HttpSession session){
		service.modifyFreeBoard(freeBoard, session);
		return "modify_complete";
	}
	
	@RequestMapping("/delete.do")
	public String delete(int boardNo, String password){
		if(service.deleteFreeBoard(boardNo, password)) {
			return "delete_freeboard_complete";
		} else {
			return "delete_freeboard_fail";
		}
	}
	
	@RequestMapping("/readRead.do")
	public ModelAndView read(int id){
		FreeBoard freeBoard = service.readFreeBoard(id);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("freeboard", freeBoard);
		mv.setViewName("read_freeboard");
		
		return mv;
	}
}
