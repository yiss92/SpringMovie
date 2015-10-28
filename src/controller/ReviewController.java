package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import service.ReviewService;
import vo.Review;
import vo.ReviewPage;

@Controller
public class ReviewController {
	private ReviewService service;

	@Autowired
	public void setService(ReviewService service) {
		this.service = service;
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
		if (service.writeReview(review, request)) {
			return "write_review_success";
		} else {
			return "write_review_fail";
		}
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
			
		if (service.modifyReview(review, request)) {
			return "modify_review_success";
		} else {
			return "modify_review_fail";
		}
	}

	@RequestMapping("/deleteReview.do")
	public String delete(Review review, HttpServletRequest request) {
		if (service.deleteReview(review, request)) {
			return "delete_review_success";
		} else {
			return "delete_review_fail";
		}
	}

	@RequestMapping("/readReview.do")
	public ModelAndView read(int review_num){
		Review review = service.selectReview(review_num);
		
		ModelAndView mv= new ModelAndView();
		mv.addObject("review", review);
		mv.setViewName("read_review");
		
		return mv;
	}
	
	
	@RequestMapping("/recommendReview.do")
	public String recommand(int review_num) {
		service.recommendCount(review_num);
		return "read_review";
	}

	//추천 후 리드화면에 표만 남고 값들이 안떠
//	http://localhost:8088/SpringMovie/recommendReview.do?review_num=5
// http://localhost:8088/SpringMovie/readReview.do?review_num=5	
	//이렇게 url이 달라서 빈값이 뜨나봐..
}
