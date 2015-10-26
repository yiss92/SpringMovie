package repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mysql.jdbc.interceptors.SessionAssociationInterceptor;

import mapper.ReviewMapper;
import vo.Review;
@Component
public class ReviewDao {
	
	private SqlSessionTemplate session;
	@Autowired
	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}
	
	//////////////////////////////////////////////
	
	public int insertReview(Review review){
		return session.getMapper(ReviewMapper.class).insertReview(review);
	}
	
	public int updateReview(Review review){
		return session.getMapper(ReviewMapper.class).updateReview(review);
	}
	
	public int deleteReview(int review_num){
		return session.getMapper(ReviewMapper.class).deleteReview(review_num);
	}
	
	
	public int  recommendCount(int review_num){
		return session.getMapper(ReviewMapper.class).recommendCount(review_num);
	}
	
	public int  readCount(int review_num){
		return session.getMapper(ReviewMapper.class).readCount(review_num);
	}
	
	
	public Review selectReview(int review_num){
		return session.getMapper(ReviewMapper.class).selectReview(review_num);
	}
	
	
	public int selectReviewCount(){
		return session.getMapper(ReviewMapper.class).selectReviewCount();
	}
	
	
	public List<Review> selectReviewList(int startRow,int rowCount){
		Map<String, Integer> map = new HashMap<>();
		map.put("startRow", startRow);
		map.put("rowCount", rowCount);
		
		return session.getMapper(ReviewMapper.class).selectReviewList(map);
	}
	
}
