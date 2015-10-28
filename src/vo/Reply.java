package vo;

public class Reply {
	private int reply_num;
	private int review_num;
	private String id;
	private String reply;

	////////////////////////////////////////////
	public Reply() {
	}
	
	

	public Reply(int reply_num, int review_num, String id, String reply) {
		this.reply_num = reply_num;
		this.review_num = review_num;
		this.id = id;
		this.reply = reply;
	}



	////////////////////////////////////////////

	public int getReply_num() {
		return reply_num;
	}

	public void setReply_num(int reply_num) {
		this.reply_num = reply_num;
	}

	public int getReview_num() {
		return review_num;
	}

	public void setReview_num(int review_num) {
		this.review_num = review_num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	////////////////////////////////////////////

}
