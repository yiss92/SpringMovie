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
	public String registerMember(){
		
		return "register_Member";
	}
	
	@RequestMapping(value = "/registerForm.do", method = RequestMethod.POST)
	public String insert(Member member){
		if(service.insert(member)){
			return "insertMember_success";
		}else{
			return "insertMember_false";
		}
	}
	
	@RequestMapping("/loginForm.do")
	public String login(HttpSession session){
		
		return "loginform";
	}
	
	@RequestMapping(value="logginForm.do", method = RequestMethod.POST)
	public String memberlogging(String id, String password, HttpSession session){
		Member original = service.select(id);
		if(original.getPassword().equals(password)){
			session.setAttribute("id", id);
			session.setAttribute("password", password);	
			return "joinForm";
		}else{
			return "loggin_false";
		}
	}
	
	
	

}