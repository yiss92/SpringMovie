package vo;

import java.util.Date;

public class FreeBoard {

	private int boardNo;
	private String id;
	private String title;
	private String comment;
	private Date date;
	private String password;

	//////////////////////////////////////////////////////////////////////////
	public FreeBoard() {
	}

	public FreeBoard(String id, String title, String comment, Date date, String password) {
		super();
		this.id = id;
		this.title = title;
		this.comment = comment;
		this.date = date;
		this.password = password;
	}
	//////////////////////////////////////////////////////////////////////////
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	

}
