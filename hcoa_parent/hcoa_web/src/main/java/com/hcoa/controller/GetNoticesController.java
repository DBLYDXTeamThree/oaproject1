package com.hcoa.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.hcoa.entity.Notices;
import com.hcoa.service.GetNoticesService;

import cn.itcast.utils.Page;

@Controller
@RequestMapping("/")
public class GetNoticesController {
	
	@Autowired
	GetNoticesService getNoticesService;
	
	@RequestMapping("/getNoticesAdmin")
	public String getNoticesAdmin(Integer page,Integer size,Model model){
		page=page==null?1:page;
		size=size==null?10:size;
		com.github.pagehelper.Page<Object> p = PageHelper.startPage(page, size);
		List<Notices> list=getNoticesService.getNotices();
		Page<Notices> pages = new Page<Notices>();
		pages.setRows(list);
		pages.setPage(page);
		pages.setTotal((int)p.getTotal());
		pages.setSize(size);
		System.err.println("===="+list.size());
		//System.out.println();
		//page.setTotal(PageHelper.count(select));
		model.addAttribute("page", pages);
		return "notice/show_admin";
	}
	@RequestMapping("/detail")
	public String detail(Long id,Model model){
		Notices notice = getNoticesService.getDetail(id);
		model.addAttribute("notice",notice);
		return "notice/detail";
	}
	@RequestMapping("/noticedel")
	public ModelAndView noticeDel(Long id,Model model){
		getNoticesService.noticeDel(id);
		List<Notices> list=getNoticesService.getNotices();
		model.addAttribute("noticelist",list);
		return new ModelAndView("redirect:/getNoticesAdmin");
	}
	@RequestMapping("noticesave")
	public ModelAndView noticeSave(Long nid,String noticeCaption,String noticeContent,Model model){
		Notices n=new Notices();
		n.setCaption(noticeCaption);
		n.setContent(noticeContent);
		n.setCreateby(nid);
		getNoticesService.addNotice(n);
		List<Notices> list=getNoticesService.getNotices();
		model.addAttribute("noticelist",list);
		return new ModelAndView("redirect:/getNoticesAdmin");
	}
	
}
