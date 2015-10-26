package vo;

import java.util.List;

public class ReviewPage {
	private List<Review> reviewList;
	private int startPage;
	private int endPage;
	private int totalPage;

	//////////////////////////////////////////////
	public ReviewPage() {
	}

	public ReviewPage(List<Review> reviewList, int startPage, int endPage, int totalPage) {
		this.reviewList = reviewList;
		this.startPage = startPage;
		this.endPage = endPage;
		this.totalPage = totalPage;
	}


	//////////////////////////////////////////////

	
	public List<Review> getReviewList() {
		return reviewList;
	}

	public void setReviewList(List<Review> reviewList) {
		this.reviewList = reviewList;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	
	
}
