package vo;

public class Comment {
	public String movie_title;
	public int comment_num;
	public String id;
	public String comment;
	public int core;

	/////////////////////////////////////////////////////////

	public Comment() {
	}
	
	public Comment(String movie_title, int comment_num, String id, String comment, int core) {
		this.movie_title = movie_title;
		this.comment_num = comment_num;
		this.id = id;
		this.comment = comment;
		this.core = core;
	}

	/////////////////////////////////////////////////////////

	public String getMovie_title() {
		return movie_title;
	}

	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}

	public int getComment_num() {
		return comment_num;
	}

	public void setComment_num(int comment_num) {
		this.comment_num = comment_num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getCore() {
		return core;
	}

	public void setCore(int core) {
		this.core = core;
	}

}
