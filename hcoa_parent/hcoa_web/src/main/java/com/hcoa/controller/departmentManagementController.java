package com.hcoa.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hcoa.entity.Department;
import com.hcoa.service.deptManagerService;

@Controller
@RequestMapping("/deptManagement")
public class departmentManagementController {
@Autowired deptManagerService deptManager;
	@RequestMapping("/todeptmanager")
	public String todeptmanager(Model model){
		List<Department> list=deptManager.getdept();
		model.addAttribute("list",list);
		return "dept/dept_manager";
	}
	@RequestMapping("/addDept")
	@ResponseBody
	public String addDept(HttpServletRequest request,Long id,String departmentCaption,String remark,Model model) throws UnsupportedEncodingException{
		Department dep=new Department();
		String dept=new String(request.getParameter("departmentCaption").getBytes("iso-8859-1"),"utf-8");
		String rem=new String(request.getParameter("remark").getBytes("iso-8859-1"),"utf-8");
		dep.setDepartmentCaption(dept);
		dep.setRemark(rem);
		deptManager.add(dep);
		List<Department> list=deptManager.getdept();
		model.addAttribute("list",list);
		return "redirect:todeptmanager";
	}
	@RequestMapping("/getDepts4List")
	@ResponseBody
	public  List<Department> getDepts4List(HttpServletRequest request,String remark,Model model) throws UnsupportedEncodingException {
		
		String rem=new String(request.getParameter("remark").getBytes("iso-8859-1"),"utf-8");
		System.err.println(rem);
		List<Department> list=deptManager.findByString(rem);
		System.err.println(list.get(0).getDepartmentCaption());
		model.addAttribute("list",list);
		System.err.println(list.size());
		return list;
	}
	@RequestMapping("/delDept")
	@ResponseBody
	public  boolean delete(Long id,Model model){
		//deptManager.delete(id);
		Boolean b=deptManager.delete(id);
		return b;
	}
	@RequestMapping("/updateDept")
	@ResponseBody
	public String update(@RequestBody Department department){
		System.out.println("============="+department.getId());
		deptManager.update(department);
		return "redirect:todeptmanager";
	}
}
