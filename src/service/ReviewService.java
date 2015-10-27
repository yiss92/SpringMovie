package service;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.ReviewDao;
import vo.Review;
import vo.ReviewPage;

@Component
public class ReviewService {

	private ReviewDao dao;

	@Autowired
	public void setDao(ReviewDao dao) {
		this.dao = dao;
	}

	////////////////////////////////////////////////////////////////

	private HttpSession session;

	public boolean writeReview(Review review, HttpServletRequest request) {
		session = request.getSession();
		String id = (String) session.getAttribute("id");
		review.setId(id);
		review.setDate(new Date());

		if (dao.insertReview(review) > 0) {
			return true;
		} else {
			return false;
		}

	}

	public Review selectReview(int review_num) {
		dao.readCount(review_num);
		return dao.selectReview(review_num);
	}

	public Review noReadCount(int review_num){
		return dao.selectReview(review_num);
	}

	// 추천수를 할 수 있을까??
	public boolean recommendCount(int review_num) {
		if (dao.recommendCount(review_num) > 0) {
			return true;
		} else {
			return false;
		}

	}

	public boolean modifyReview(Review review, HttpServletRequest request) {
		
		Review original = dao.selectReview(review.getReview_num());
		session = request.getSession();
		String id = (String) session.getAttribute("id");
		
		
		
		if (original.getId().equals(id)) {
			dao.updateReview(review);
			return true;
		} else {
			return false;
		}

	}
	
	public boolean deleteReview(Review review, HttpServletRequest request) {
		Review original = dao.selectReview(review.getReview_num());
		session = request.getSession();
		String id = (String) session.getAttribute("id");


		
		if (original.getId().equals(id)) {
			dao.deleteReview(review.getReview_num());
			return true;
		} else {
			return false;
		}

	}

	
	public ReviewPage getReviewPage(int requestPage){
		final int COUNT_PER_PAGE = 10;

		int reviewTotalCount = dao.selectReviewCount();
		if (reviewTotalCount == 0) {
			return new ReviewPage();
		}

		int startRow = (requestPage - 1) * COUNT_PER_PAGE;
		List<Review> reviewList = dao.selectReviewList(startRow, COUNT_PER_PAGE);

		int totalPage = reviewTotalCount / COUNT_PER_PAGE;
		if (reviewTotalCount % COUNT_PER_PAGE != 0) {
			totalPage++;
		}

		int startPage;
		if (requestPage % 10 != 0) {
			startPage = (requestPage / 10) * 10 + 1;
		} else {
			startPage = (requestPage - 9);
		}

		int endPage = startPage + 9;
		if (endPage > totalPage) {
			endPage = totalPage;
		}

		return new ReviewPage(reviewList, startPage, endPage, totalPage);

	}
	
	
	
	
	
}
