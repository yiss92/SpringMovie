package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.CommentDao;
import vo.Comment;
import vo.CommentPage;

@Component
public class CommentService {
	private CommentDao dao;

	@Autowired
	public void setDao(CommentDao dao) {
		this.dao = dao;
	}

	private HttpSession session;
	//////////////////////////////////////////

	public boolean writeComment(Comment comment, HttpServletRequest request) {
		session = request.getSession();
		String id = (String) session.getAttribute("id");
		comment.setId(id);
		if (dao.insert(comment) > 0) {
			return true;
		} else {
			return false;
		}
	}

	public Comment selectComment(int comment_num) {
		return dao.select(comment_num);
	}

	public boolean modifyComment(Comment comment, HttpServletRequest request) {
		Comment original = dao.select(comment.comment_num);

		session = request.getSession();
		String id = (String) session.getAttribute("id");

		if (original.getId().equals(id)) {
			dao.update(comment);
			return true;
		} else {
			return false;
		}
	}

	public boolean deleteComment(Comment comment, HttpServletRequest request) {
		Comment original = dao.select(comment.comment_num);

		session = request.getSession();
		String id = (String) session.getAttribute("id");

		if (original.getId().equals(id)) {
			dao.delete(comment.comment_num);
			return true;
		} else {
			return false;
		}
	}

	public CommentPage getCommentPage(int requestPage) {
		final int COUNT_PER_PAGE = 10;

		int commentTotalCount = dao.selectCount();
		if (commentTotalCount == 0) {
			return new CommentPage();
		}

		int startRow = (requestPage - 1) * COUNT_PER_PAGE;
		List<Comment> commentList = dao.selectList(startRow, COUNT_PER_PAGE);

		int totalPage = commentTotalCount / COUNT_PER_PAGE;
		if (commentTotalCount % COUNT_PER_PAGE != 0) {
			totalPage++;
		}

		int startPage;
		if (requestPage % 10 != 0) {
			startPage = (requestPage / 10) * 10 + 1;
		} else {
			startPage = (requestPage - 9);
		}

		int endPage = startPage + 9;
		if (endPage > totalPage) {
			endPage = totalPage;
		}

		return new CommentPage(commentList, startPage, endPage, totalPage);

	}

}
