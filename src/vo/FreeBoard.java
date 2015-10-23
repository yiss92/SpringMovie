package vo;

import java.util.Date;

public class FreeBoard {
	
	private String messageId;
	private String guestName;
	private String password;
	private String title;
	private String comment;
	private Date date;
	private int boardPage;
//////////////////////////////////////////////////////////////////////////
	public FreeBoard() {
	}
	public FreeBoard(String messageId, String guestName, String password, String title, String comment, Date date, int boardPage) {
		this.messageId = messageId;
		this.guestName = guestName;
		this.password = password;
		this.title = title;
		this.comment = comment;
		this.date = date;
		this.boardPage = boardPage;
	}
//////////////////////////////////////////////////////////////////////////	
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public int getBoardPage() {
		return boardPage;
	}
	public void setBoardPage(int boardPage) {
		this.boardPage = boardPage;
	}
	
}
