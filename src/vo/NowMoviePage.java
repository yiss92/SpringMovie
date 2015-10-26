package vo;

import java.util.List;

public class NowMoviePage {
	private List<NowMovie> nowMovieList;
	private int startPage;
	private int endPage;
	private int totalPage;

	//////////////////////////////////////////////////

	public NowMoviePage() {
	}

	public NowMoviePage(List<NowMovie> nowMovieList, int startPage, int endPage, int totalPage) {
		this.nowMovieList = nowMovieList;
		this.startPage = startPage;
		this.endPage = endPage;
		this.totalPage = totalPage;
	}

	//////////////////////////////////////////////////

	public List<NowMovie> getNowMovieList() {
		return nowMovieList;
	}

	public void setNowMovieList(List<NowMovie> nowMovieList) {
		this.nowMovieList = nowMovieList;
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

	//////////////////////////////////////////////////

}
