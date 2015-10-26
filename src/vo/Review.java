package vo;

import java.util.Date;

public class Review {
	private int review_num;
	private String movie_title;
	private String review_title;
	private String id;
	private Date date;
	private int score;
	private int recommend_count;
	private int read_count;
	private String content;

	/////////////////////////////////////////////////
	public Review() {
	}
	
	public Review(int review_num, String movie_title, String review_title, String id, Date date, int score,
			int recommend_count, int read_count, String content) {
		super();
		this.review_num = review_num;
		this.movie_title = movie_title;
		this.review_title = review_title;
		this.id = id;
		this.date = date;
		this.score = score;
		this.recommend_count = recommend_count;
		this.read_count = read_count;
		this.content = content;
	}


	/////////////////////////////////////////////////

	public int getReview_num() {
		return review_num;
	}

	public void setReview_num(int review_num) {
		this.review_num = review_num;
	}

	public String getMovie_title() {
		return movie_title;
	}

	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}

	public String getReview_title() {
		return review_title;
	}

	public void setReview_title(String review_title) {
		this.review_title = review_title;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getRecommend_count() {
		return recommend_count;
	}

	public void setRecommend_count(int recommend_count) {
		this.recommend_count = recommend_count;
	}

	public int getRead_count() {
		return read_count;
	}

	public void setRead_count(int read_count) {
		this.read_count = read_count;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
