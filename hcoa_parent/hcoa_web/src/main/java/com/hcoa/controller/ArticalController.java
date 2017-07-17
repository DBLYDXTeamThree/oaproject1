package com.hcoa.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcoa.dao.SendArticleMapper;
import com.hcoa.entity.SendArticle;
import com.hcoa.entity.StaffInfo;

@Controller
@RequestMapping("/")
public class ArticalController {
	@Autowired
	SendArticleMapper sendArticleMapper;
	
	@RequestMapping("/dispatch")
	public String dispatch(){
		return "sendArticle/dispatch";
	}
	
	@RequestMapping("/saveArticle")
	public String saveArticle(SendArticle sendArticle,@DateTimeFormat(pattern="yyyy-MM-dd")Date createtime1,HttpSession session){
		sendArticle.setCreatetime(createtime1);
		StaffInfo sf = (StaffInfo) session.getAttribute("staff");
		sendArticle.setCreateby(sf.getId());
		sendArticle.setDeliverApproveFlag(0);
		sendArticle.setPublishFlag(1);
		sendArticleMapper.insert(sendArticle);
		System.err.println("≤Â»Î≥…π¶");
		return "";
	}

}
