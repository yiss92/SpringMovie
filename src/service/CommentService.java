package service;

import java.util.List;

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

	//////////////////////////////////////////

	public boolean writeComment(Comment comment) {
		if (dao.insert(comment) > 0) {
			return true;
		} else {
			return false;
		}
	}

	public Comment selectComment(int comment_num) {
		return dao.select(comment_num);
	}

	public boolean modifyComment(Comment comment) {
		// 나중에 id session만들면
		return true;
	}

	public boolean deleteComment(Comment comment) {
		// 나중에 id session만들면
		//변수도 바뀔꺼야
		return true;
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
