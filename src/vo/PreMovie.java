package vo;

public class PreMovie {
	private String movieTitle;
	private String movieImage;
	private String genre_1;
	private String genre_2;
	private String director;
	private String stars;
	private String story;
	private String ymd;
		
	public PreMovie() {
		super();
	}
	
	public PreMovie(String movieTitle, String movieImage, String genre_1, String genre_2, String director, String stars,
			String story, String ymd) {
		super();
		this.movieTitle = movieTitle;
		this.movieImage = movieImage;
		this.genre_1 = genre_1;
		this.genre_2 = genre_2;
		this.director = director;
		this.stars = stars;
		this.story = story;
		this.ymd = ymd;
	}

	public String getMovieTitle() {
		return movieTitle;
	}
	
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getMovieImage() {
		return movieImage;
	}

	public void setMovieImage(String movieImage) {
		this.movieImage = movieImage;
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
