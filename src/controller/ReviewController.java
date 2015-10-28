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

	@RequestMapping(value="/readReview.do")
	public ModelAndView read(int review_num,HttpServletRequest request,Reply r) {
		Review review = service.selectReview(review_num);
		List<Reply> reply =rSer.selectReply(review_num);
		
		//이렇게 하려면 if문이 있어야하는데 if의 조건을 뭐라고 하지??
//		if(){
//		rSer.writeReply(r, request);
//		}
		//여기에 write까지 해도 맞나??
		//새로운 컨트롤러 만들어서 redirect?
		
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("review", review);
		mv.addObject("reply", reply);
		mv.setViewName("read_review");
		
		return mv;
	}
	
	
	
	
	
	

	// @RequestMapping("/recommendReview.do")
	// public String recommand(int review_num) {
	// service.recommendCount(review_num);
	// return "read_review";
	// }

	// 추천수는 테이블 하나 더 만들어야 되서 포기
}
