package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.ReplyDao;
import vo.Reply;

@Component
public class ReplyService {

	private ReplyDao dao;

	@Autowired
	public void setDao(ReplyDao dao) {
		this.dao = dao;
	}

	private HttpSession session;

	/////////////////////////////////

	public boolean writeReply(Reply reply, HttpServletRequest request) {
		session = request.getSession();
		String id = (String) session.getAttribute("id");
		reply.setId(id);

		if (dao.insertReply(reply) > 0) {
			return true;
		} else {
			return false;
		}

	}

	public List<Reply> selectReply(int reply_num) {
		return dao.selectReply(reply_num);
	}

}
