package com.hcoa.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hcoa.entity.Department;
import com.hcoa.entity.RoleSet;
import com.hcoa.entity.StaffInfo;
import com.hcoa.service.BaseService;
import com.hcoa.service.RoleService;
import com.hcoa.service.StaffInfoService;

@Controller
@RequestMapping("/")
public class RegisterController {
	
	@Autowired
	BaseService baseService;
	@Autowired
	RoleService roleService;
	@Autowired
	StaffInfoService staffInfoService;
	
	@RequestMapping("register")
	public String register(Model model){
		List<Department> depts = baseService.getDepts();
		model.addAttribute("depts",depts);
		List<RoleSet> roleSet=roleService.getRole();
		model.addAttribute("roleSet",roleSet);
		return "user/register";
	}
	
	@RequestMapping("saveUserInfo1")
	@ResponseBody
	public String saveUserInfo(StaffInfo staffInfo){
		System.err.println(staffInfo.toString());
		staffInfoService.insertSelective(staffInfo);
		return "success";
	}
	@RequestMapping("updateUser")
	@ResponseBody
	public String updateUser(StaffInfo staffInfo){
		staffInfoService.updateByPrimaryKeySelective(staffInfo);
		return "success";
	}
	
}
 