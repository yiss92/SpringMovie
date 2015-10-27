package vo;

import java.util.List;

public class FreeBoardPage {
	private List<FreeBoard> freeboardList;
	private int startPage;
	private int endPage;
	private int totalPage;
/////////////////////////////////////////////////////////////////////////
	public FreeBoardPage() {
	}
	public FreeBoardPage(List<FreeBoard> freeboardList, int startPage, int endPage, int totalPage) {
		this.freeboardList = freeboardList;
		this.startPage = startPage;
		this.endPage = endPage;
		this.totalPage = totalPage;
	}
/////////////////////////////////////////////////////////////////////////
	public List<FreeBoard> getFreeboardList() {
		return freeboardList;
	}
	public void setFreeboardList(List<FreeBoard> freeboardList) {
		this.freeboardList = freeboardList;
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
