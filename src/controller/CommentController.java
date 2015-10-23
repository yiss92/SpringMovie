package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import service.CommentService;
import vo.Comment;
import vo.CommentPage;

@Controller
public class CommentController {
	private CommentService service;

	@Autowired
	public void setService(CommentService service) {
		this.service = service;
	}

	////////////////////////////////////////

	@RequestMapping("/comment.do")
	public ModelAndView commentList(@RequestParam(defaultValue = "1") int page) {
		CommentPage commentPage = service.getCommentPage(page);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("comment_main");
		mv.addObject("commentPage", commentPage);
		
		return mv;
	}

	@RequestMapping(value = "/writeComment.do", method = RequestMethod.POST)
	public String write(Comment comment) {

		if (service.writeComment(comment)) {
			return "write_comment_success";
		} else {
			return "write_comment_fail";
		}
	}

	@RequestMapping("/modifyCommentForm.do")
	public ModelAndView modifyForm(int comment_num) {
		Comment original = service.selectComment(comment_num);

		ModelAndView mv = new ModelAndView();
		mv.addObject("original", original);
		mv.setViewName("modify_comment_form");

		return mv;
	}

	@RequestMapping("/modifyComment.do")
	public String modify(Comment comment) {
		if (service.modifyComment(comment)) {
			return "modify_comment_success";
		} else {
			return "modify_comment_fail";
		}
	}

	@RequestMapping("/deleteCommentForm.do")
	public ModelAndView deleteForm(int comment_num) {
		Comment original = service.selectComment(comment_num);

		ModelAndView mv = new ModelAndView();
		mv.addObject("original", original);
		mv.setViewName("delete_comment_form");

		return mv;
	}

	@RequestMapping("/deleteComment.do")
	public String delete(Comment comment) {
		// 서비스에서 변수바뀌면 수정해야해!!
		if (service.deleteComment(comment)) {
			return "delete_comment_success";
		} else {
			return "delete_comment_fail";
		}
	}

}
