package vo;

import java.util.List;

public class CommentPage {
	private List<MovieComment> commentList;
	private int startPage;
	private int endPage;
	private int totalPage;

	///////////////////////////////////
	public CommentPage() {
	}
	
	public CommentPage(List<MovieComment> commentList, int startPage, int endPage, int totalPage) {
		super();
		this.commentList = commentList;
		this.startPage = startPage;
		this.endPage = endPage;
		this.totalPage = totalPage;
	}

	///////////////////////////////////

	public List<MovieComment> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<MovieComment> commentList) {
		this.commentList = commentList;
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
