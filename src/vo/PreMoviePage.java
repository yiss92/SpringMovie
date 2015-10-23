package vo;

import java.util.List;

public class PreMoviePage {
	private List<PreMovie> movieList;
	private int startPage;
	private int endPage;
	private int totalPage;
		
	public PreMoviePage() {
		super();
	}

	public PreMoviePage(List<PreMovie> movieList, int startPage, int endPage, int totalPage) {
		super();
		this.movieList = movieList;
		this.startPage = startPage;
		this.endPage = endPage;
		this.totalPage = totalPage;
	}

	public List<PreMovie> getMovieList() {
		return movieList;
	}
	
	public void setMovieList(List<PreMovie> movieList) {
		this.movieList = movieList;
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
