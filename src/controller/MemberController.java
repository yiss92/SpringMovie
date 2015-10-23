package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.MemberService;

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
	

}