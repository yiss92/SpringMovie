package service;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.FreeBoardDao;
import vo.FreeBoard;
import vo.FreeBoardPage;

@Component
public class FreeBoardService {
	private FreeBoardDao dao;

	@Autowired
	public void setDao(FreeBoardDao dao) {
		this.dao = dao;
	}

	////////////////////////////////////////////////////////////////////////////
	public boolean writeComment(FreeBoard comment, HttpSession session) {
		comment.setPassword((String) session.getAttribute("password"));
		comment.setId((String) session.getAttribute("id"));
		comment.setDate(new Date());
		if (dao.insert(comment) > 0)
			return true;
		else
			return false;
	}
	
	public FreeBoard select(int boardNo){
		FreeBoard freeBoard = dao.select(boardNo);
		return freeBoard;
	}

	public boolean modifyFreeBoard(FreeBoard freeboard, HttpSession session) {
		String id = ((String) session.getAttribute("id"));
		System.out.println(freeboard.getBoardNo());
		FreeBoard original = dao.select(freeboard.getBoardNo());
		if (original.getId().equals(id)) {
			dao.update(freeboard);
			return true;
		} else {
			return false;
		}
	}

	public boolean deleteFreeBoard(int boardNo, String password) {
		FreeBoard original = dao.select(boardNo);
		if (original.getPassword().equals(password)) {
			dao.delete(boardNo);
			return true;
		} else {
			return false;
		}
	}
	
	public FreeBoard readFreeBoard(int id){
		return dao.select(id);
	}

	public FreeBoardPage getFreeBoradPage(int requestPage) {

		final int MESSAGE_COUNT_PER_PAGE = 10;

		int messageTotalCount = dao.selectCommentCount();

		if (messageTotalCount == 0)
			return new FreeBoardPage();

		// 요청 페이지에 따라서 조회할 행의 번호가 달라짐.
		int startRow = (requestPage - 1) * MESSAGE_COUNT_PER_PAGE;

		List<FreeBoard> messageList = dao.selectList(startRow, MESSAGE_COUNT_PER_PAGE);

		int totalPage = messageTotalCount / MESSAGE_COUNT_PER_PAGE;
		if (messageTotalCount % MESSAGE_COUNT_PER_PAGE != 0)
			totalPage++;

		int startPage;
		if (requestPage % 10 != 0) {
			startPage = (requestPage / 10) * 10 + 1;
		} else {
			startPage = requestPage - 9;
		}

		int endPage = startPage + 9;
		if (endPage > totalPage)
			endPage = totalPage;

		return new FreeBoardPage(messageList, startPage, endPage, totalPage);

	}
	
	public FreeBoard regardlessOfReadCount(int id){
		return dao.select(id);
	}
}
