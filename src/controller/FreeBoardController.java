package controller;

import java.util.Date;

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
	public ModelAndView FreeBoardMain(@RequestParam(defaultValue = "1") int page) {
		FreeBoardPage freeboardPage = service.getFreeBoradPage(page);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("freeboard_main");
		mv.addObject("freeboardPage", freeboardPage);

		return mv;
	}

	@RequestMapping("write.do")
	public String writeForm(String title, String comment, HttpSession session) {
		FreeBoard freeBoard = new FreeBoard();
		// String id =(String) session.getAttribute("id");
		// String password = (String)session.getAttribute("password");
		freeBoard.setComment(comment);
		// freeBoard.setId(id);
		// freeBoard.setPassword(password);
		// freeBoard.setDate(new Date());
		if (service.writeComment(freeBoard, session)) {
			return "freeboardInsert_success";
		} else {
			return "freeboardInsert_false";
		}
	}

	@RequestMapping("/modifyForm.do")
	public ModelAndView updateFreeboardForm(int boardNo) {		
		FreeBoard original = service.select(boardNo);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("modifyFreeBoard");
		mv.addObject("original", original);
		return mv;
	}

	@RequestMapping("/modify.do")
	public String modifyFreeBoard(int boardNo, String comment, HttpSession session) {
		FreeBoard original = service.select(boardNo);
		original.setComment(comment);
		System.out.println(comment);
		String id = (String) session.getAttribute("id");
		if (original.getId().equals(id)) {
			if(service.modifyFreeBoard(original, session)){
				return "modifyFreedBoard_success";
			}else{
				return "modifyFreeBoard_false";
			}
			
		} else {
			return "modifyFreeBoard_false";
		}
	}

	@RequestMapping("/modifyFreeBoardForm.do")
	public ModelAndView modifyFreeBoardForm(int id) {
		FreeBoard original = service.select(id);

		ModelAndView mv = new ModelAndView();
		mv.addObject("original", original);
		mv.setViewName("modify_freeboard_form");

		return mv;
	}

	@RequestMapping("/successModify.do")
	public String successModify(FreeBoard freeBoard, HttpSession session) {
		service.modifyFreeBoard(freeBoard, session);
		return "modify_complete";
	}

	@RequestMapping("/deleteFreeBoardForm.do")
	public String delete(int boardNo,  HttpSession session) {
		FreeBoard original = service.select(boardNo);
		String id = (String) session.getAttribute("id");

		if (original.getId().equals(id)) {
			if (service.deleteFreeBoard(boardNo, session)) {
				return "delete_freeboard_complete";
			} else {
				return "delete_freeboard_fail";
			}
		}else
		{
			return "delete_freeboard_fail";
		}
	}

	@RequestMapping("/readRead.do")
	public ModelAndView read(int id) {
		FreeBoard freeBoard = service.readFreeBoard(id);

		ModelAndView mv = new ModelAndView();
		mv.addObject("freeboard", freeBoard);
		mv.setViewName("read_freeboard");

		return mv;
	}
}
