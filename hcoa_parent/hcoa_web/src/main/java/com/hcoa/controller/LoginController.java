package com.hcoa.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcoa.entity.StaffInfo;
import com.hcoa.service.LoginService;

@Controller
@RequestMapping("/")
public class LoginController {
	@Autowired
	LoginService loginService;
	
	@RequestMapping("/login")
	public String toLogin(String username,String password,HttpSession session){
		StaffInfo staff=loginService.getStaff(username,password);
		if(staff==null){
			return "redirect:login.jsp";
		}
		else{ 
			
			session.setAttribute("staff", staff); 
		    return "redirect:index";
		}
	}
	
	@RequestMapping("/index")
	public String toIndex(){
		return "index";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		session.removeAttribute("staff");
		return "redirect:login.jsp";
	}
	
	
}
