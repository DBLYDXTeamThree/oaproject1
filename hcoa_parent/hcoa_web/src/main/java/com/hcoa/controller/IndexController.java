package com.hcoa.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcoa.entity.Approve;
import com.hcoa.entity.Forum;
import com.hcoa.entity.Notices;
import com.hcoa.entity.StaffInfo;
import com.hcoa.service.GetNoticesService;
import com.hcoa.service.LoginService;

@Controller
@RequestMapping("/")
public class IndexController {
	@Autowired
	GetNoticesService getNoticesService;
	@Autowired
	LoginService loginService;
	
	
	@RequestMapping("/index")
	public String index(Model model,HttpSession session){
		
		// 1通知公告
		List<Notices> list=getNoticesService.getNotices();
		model.addAttribute("noticelist", list);
		
		// 2待办公文
		// 3公示信息
		List<Forum> forum=loginService.getForum();	
		StaffInfo s=(StaffInfo) session.getAttribute("staff");
		List<Approve> approve=loginService.getApprove(s.getId());
		model.addAttribute("forum", forum);
		model.addAttribute("approve", approve);

		
		
		// 4职工舍去
		
		
		return "index";
	}

}
