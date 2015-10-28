package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import service.MemberService;
import vo.Member;

@Controller
public class MemberController {
	private MemberService service;

	@Autowired
	public void setService(MemberService service) {
		this.service = service;
	}

	@RequestMapping("/register_Form.do")
	public String registerMember() {

		return "register_Member";
	}

	@RequestMapping(value = "/registerForm.do", method = RequestMethod.POST)
	public String insert(Member member) {
		if (service.insert(member)) {
			return "insertMember_success";
		} else {
			return "insertMember_false";
		}
	}

	@RequestMapping("/loginForm.do")
	public String login(HttpSession session) {

		return "loginform";
	}

	@RequestMapping(value = "logginForm.do", method = RequestMethod.POST)
	public String memberlogging(String id, String password, HttpSession session) {
		Member original = service.select(id);
		if (original.getPassword().equals(password)) {
			session.setAttribute("id", id);
			session.setAttribute("password", password);
			return "joinForm";
		} else {
			return "loggin_false";
		}
	}

	@RequestMapping("/loginOut.do")
	public String logOut(HttpSession session) {
		session.setAttribute("id", null);
		session.setAttribute("password", null);
		return "joinForm";
	}

	@RequestMapping("/modifyMemberForm.do")
	public ModelAndView modifyMember(Member member, HttpSession session) {
		String id = (String) session.getAttribute("id");
		Member original = service.select(id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("modifyMember");
		mv.addObject("original", original);

		return mv;
	}

	@RequestMapping("/updateMemberForm.do")
	public ModelAndView updateMember(Member member, HttpSession session) {
		String id = (String) session.getAttribute("id");
		Member original = service.select(id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("updateMember");
		mv.addObject("original", original);

		return mv;
	}

	@RequestMapping("/upDateForm.do")
	public String upDateMember(String name, String nickname, HttpSession session) {
		String id = (String) session.getAttribute("id");
		Member member = service.select(id);
		member.setName(name);
		member.setNickname(nickname);
		if (service.update(member, session)) {
			return "upDateMember_success";
		} else {
			return "upDateMember_false";
		}
	}

	@RequestMapping("/deleteMemberForm.do")
	public String deleteMember() {

		return "deleteform";
	}

	@RequestMapping("/deleteForm.do")
	public String deleteMember(String id, HttpSession session) {
		String idstr = (String) session.getAttribute("id");
		Member member = service.select(idstr);
		if (member.getId().equals(idstr)) {
			if (service.delete(id, session)) {
				return "deleteMember_success";
			} else {
				return "deleteMember_false";
			}
		}
		return "deleteMember_false";
	}

}