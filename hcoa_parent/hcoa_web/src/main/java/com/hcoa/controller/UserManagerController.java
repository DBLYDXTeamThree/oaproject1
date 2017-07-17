package com.hcoa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
public class UserManagerController {
	@Autowired
	StaffInfoService staffInfoService;
	@Autowired
	BaseService baseService;
	@Autowired
	RoleService userService;
	
	@RequestMapping("user_manager")
	public String getStaffInfoVo(Model model){
		List<StaffInfo> staffInfo=staffInfoService.selectStaff();
		model.addAttribute("staffInfo", staffInfo);
		List<Department> depts = baseService.getDepts();
		model.addAttribute("depts",depts);
		return "user/user_manager";
	}
	
	@RequestMapping("searchDept")
	public String getStaffInfoVo(Model model,Long id){
		List<StaffInfo> staffInfo;
		if(id==-1){
			staffInfo=staffInfoService.selectStaff();
		}else{
			staffInfo=staffInfoService.selectStaffByDept(id);
		}
		List<Department> depts = baseService.getDepts();
		model.addAttribute("depts",depts);
		model.addAttribute("staffInfo", staffInfo);
		model.addAttribute("did", id);
		return "user/user_manager";
	}
	@RequestMapping("fireUser")
	@ResponseBody
	public String fireUser(long id){
		staffInfoService.fireUserById(id);
		return "success";
	}
	
	@RequestMapping("searchStaff")
	public String searchStaff(String realname,Model model){
		if(realname==""){
			List<StaffInfo> staffInfo=staffInfoService.selectStaff();
			model.addAttribute("staffInfo", staffInfo);
			return "redirect:/user_manager";
		}
		List<StaffInfo> staffInfo=staffInfoService.searchByRealName(realname);
		model.addAttribute("staffInfo", staffInfo);
		List<Department> depts = baseService.getDepts();
		model.addAttribute("depts",depts);
		return "user/user_manager";
	}
	
	@RequestMapping("editUser")
	public String editUser(Model model,long id){
		StaffInfo user=staffInfoService.selectByPrimaryKey(id);
		model.addAttribute("user", user);
		List<Department> depts = baseService.getDepts();
		model.addAttribute("depts",depts);
		List<RoleSet> roleSet=userService.getRole();
		model.addAttribute("roleSet",roleSet);
		return "user/register";
	}
	
	/*@RequestMapping(value = "/editUser", method = RequestMethod.POST)
	public ModelAndView editUser(@RequestParam("id") int id)
	{
		return new ModelAndView("user/register", "user", userService.getUserWithId(id));
	}*/
	
	@RequestMapping("role_manager")
	public String getRole(Model model){
		List<RoleSet> roleSet=userService.getRole();
		model.addAttribute("roleSet",roleSet);
		return "role/role_manager";
	}
	
	@RequestMapping("delRole")
	@ResponseBody
	public String delRole(Long id){
		userService.deleteByPrimaryKey(id);
		return "success";
	}
	@RequestMapping("addRole")
	@ResponseBody
	public String addRole(RoleSet role){
		userService.insertSelective(role);
		return "success";
	}
	@RequestMapping("editRole")
	@ResponseBody
	public String editRole(RoleSet role){
		userService.updateByPrimaryKeySelective(role);
		return "success";
	}
	@RequestMapping("searchRole")
	public String searchRole(String roleName,Model model){
		if(roleName==null){
			List<RoleSet> roleSet=userService.getRole();
			model.addAttribute("roleSet",roleSet);
			return "role/role_manager";
		}
		List<RoleSet> roleSet=userService.searchByRoleCaption(roleName);
		model.addAttribute("roleSet",roleSet);
		return "role/role_manager";
	}
	
}
