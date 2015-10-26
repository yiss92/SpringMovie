package mapper;

import java.util.List;
import java.util.Map;

import vo.Review;

public interface ReviewMapper {
	public int insertReview(Review review);
	
	public int updateReview(Review review);
	
	public int deleteReview(int review_num);
	
	public int recommendCount(int review_num);
	
	public int readCount(int review_num);
	
	public Review selectReview(int review_num);
	
	public int selectReviewCount();
	
	public List<Review> selectReviewList(Map<String, Integer> map);
}
