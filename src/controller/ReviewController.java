package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import service.ReplyService;
import service.ReviewService;
import vo.Reply;
import vo.Review;
import vo.ReviewPage;

@Controller
public class ReviewController {
	private ReviewService service;

	private ReplyService rSer;

	@Autowired
	public void setService(ReviewService service) {
		this.service = service;
	}

	@Autowired
	public void setrSer(ReplyService rSer) {
		this.rSer = rSer;
	}

	/////////////////////////////////////////////////

	@RequestMapping("/review.do")
	public ModelAndView reviewMain(@RequestParam(defaultValue = "1") int page) {
		ReviewPage reviewPage = service.getReviewPage(page);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("review_main");
		mv.addObject("reviewPage", reviewPage);
		return mv;
	}

	@RequestMapping("/writeReviewForm.do")
	public String wrtieForm() {
		return "write_review_form";
	}

	@RequestMapping("/writeReview.do")
	public String write(Review review, HttpServletRequest request) {
		service.writeReview(review, request);
		return "write_review_success";

	}

	@RequestMapping("/modifyReviewForm.do")
	public ModelAndView modifyForm(int review_num) {
		Review original = service.noReadCount(review_num);

		ModelAndView mv = new ModelAndView();
		mv.addObject("original", original);
		mv.setViewName("modify_review_form");

		return mv;
	}

	@RequestMapping("/modifyReview.do")
	public String modify(Review review, HttpServletRequest request) {

		service.modifyReview(review, request);
		return "modify_review_success";

	}

	@RequestMapping("/deleteReview.do")
	public String delete(Review review, HttpServletRequest request) {
		service.deleteReview(review, request);
		return "delete_review_success";

	}

	@RequestMapping(value = "/readReview.do")
	public ModelAndView read(int review_num, HttpServletRequest request, Reply r) {
		//@RequestParam(required = false) 
		Review review = service.selectReview(review_num);

		if (r.getReply() != null) {

			rSer.writeReply(r, request);
			
		}


		List<Reply> reply = rSer.selectReply(review_num);

		ModelAndView mv = new ModelAndView();
		mv.addObject("review", review);
		mv.addObject("reply", reply);
		mv.setViewName("read_review");

		return mv;
	}

	
}
