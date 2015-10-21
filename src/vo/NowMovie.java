package vo;

public class NowMovie {
	private String movie_title;
	private String movie_image;
	private String genre_1;
	private String genre_2;
	private String director;
	private String stars;
	private String story;
	private String ymd;

	////////////////////////////////////////////////////////////

	public NowMovie() {
	}

	public NowMovie(String movie_title, String movie_image, String genre_1, String genre_2, String director,
			String stars, String story, String ymd) {
		super();
		this.movie_title = movie_title;
		this.movie_image = movie_image;
		this.genre_1 = genre_1;
		this.genre_2 = genre_2;
		this.director = director;
		this.stars = stars;
		this.story = story;
		this.ymd = ymd;
	}

	/////////////////////////////////////////////////////////////////////

	public String getMovie_title() {
		return movie_title;
	}

	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}

	public String getMovie_image() {
		return movie_image;
	}

	public void setMovie_image(String movie_image) {
		this.movie_image = movie_image;
	}

	public String getGenre_1() {
		return genre_1;
	}

	public void setGenre_1(String genre_1) {
		this.genre_1 = genre_1;
	}

	public String getGenre_2() {
		return genre_2;
	}

	public void setGenre_2(String genre_2) {
		this.genre_2 = genre_2;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getStars() {
		return stars;
	}

	public void setStars(String stars) {
		this.stars = stars;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public String getYmd() {
		return ymd;
	}

	public void setYmd(String ymd) {
		this.ymd = ymd;
	}

}
