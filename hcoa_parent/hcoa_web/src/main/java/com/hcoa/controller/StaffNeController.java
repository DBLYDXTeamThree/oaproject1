package com.hcoa.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.hcoa.entity.Forum;
import com.hcoa.service.StaffNeService;

import cn.itcast.utils.Page;

@Controller
@RequestMapping("/")
public class StaffNeController {
	@Autowired
	StaffNeService staffNeService;
	
	@RequestMapping("/getForums")
	public String getForums1(Model model){
//		page=page==null?1:page;
//		size=size==null?10:page;
//		com.github.pagehelper.Page<Object> p=PageHelper.startPage(page,size);
//		Page<Forum> pages=new Page<Forum>();
		List<Forum>  staff=staffNeService.getAll();
//		pages.setPage(page);
//		pages.setRows(staff);
//		pages.setSize(size);
//		pages.setTotal((int)p.getTotal());
//		model.addAttribute("pages", pages);
		model.addAttribute("forumlist", staff);
		return "forum/getForum";
	}
	@RequestMapping("/detailForum")
	public String detailForum(Long id,Model model){
		List<Forum>  staff=staffNeService.getById(id);
		Forum ff=staffNeService.getOne(id);
		model.addAttribute("detailList",ff);
		model.addAttribute("findreplyList", staff);
		return "forum/replyForum";
	}
	@RequestMapping("/addReplyForum")
	public String save(String content,Long createby,Long forumid){
		Forum f=new Forum();
		f.setContent(content);
		f.setCreateby(createby);
		f.setParentId(forumid);
		f.setCreatetime(new Date());
		staffNeService.insertOne(f);
		return "redirect:/detailForum?id="+forumid;
	}
	@RequestMapping("/delForum")
	public String del(Long id){
		staffNeService.delById(id);
		return "redirect:/getForums";
	}
	@RequestMapping("addForum")
	public String intoadd(){
		return "forum/addForum";
	}
	@RequestMapping("/addforumm")
	public String addforum(Long id,String content,String caption){
		Forum f=new Forum();
		f.setContent(content);
		f.setCreateby(id);
		f.setCreatetime(new Date());
		f.setCaption(caption);
		System.err.println("11111111111111111111");
		staffNeService.insertOne(f);
		return "redirect:/getForums";
	}

}
