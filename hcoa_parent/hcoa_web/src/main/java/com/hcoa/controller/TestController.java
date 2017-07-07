package com.hcoa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcoa.entity.StaffInfo;
import com.hcoa.service.TestService;

@Controller
@RequestMapping("/")
public class TestController {
	@Autowired
	TestService ts;
	
	@RequestMapping("/test")
	public String test(Model model){
		 StaffInfo test = ts.test();
		System.err.println(test.getLoginUsername()+"===============");
		model.addAttribute("test",test);
		return "redirect:xx.jsp?test="+test.getLoginUsername();
	}

}
