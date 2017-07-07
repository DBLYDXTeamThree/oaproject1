package com.hcoa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hcoa.entity.Department;
import com.hcoa.service.BaseService;
import com.hcoa.utils.ResponseJson;

@Controller
@RequestMapping("/")
public class BaseController {
	@Autowired
	BaseService baseService;
	
	/**
	 * 加载部门列表
	 * @return
	 */
	@RequestMapping("/getDepts")
	@ResponseBody
	public ResponseJson getDepts(){
		ResponseJson json = new ResponseJson();
		List<Department> depts = baseService.getDepts();
		Map<String, Object> map = new HashMap<String, Object>();
		//map.put("depts", depts);
		for(int i=0;i<depts.size();i++){
			map.put(i+"", depts.get(i).getDepartmentCaption());
		}
		json.setDatas(map);
		json.setCode(1l);
		json.setMsg("加载部门列表成功");
		return json;
	}
	/**
	 * 加载人员列表
	 * @return
	 */
	@RequestMapping("/getPersonList")
	@ResponseBody
	public ResponseJson getPersonList(){
		Map<String, Object> map = baseService.getPersonList();
		ResponseJson json = new ResponseJson();
		Map<String,Object> m = new HashMap<String, Object>();
		m.put("personMap", map);
		json.setCode(1l);
		json.setDatas(m);
		json.setMsg("加载人员列表成功");
		return json;
	}
	
	@RequestMapping("/getUserObj")
	@ResponseBody
	public ResponseJson getUserObj(HttpSession sesiion,HttpServletResponse response){
		ResponseJson json = new ResponseJson();
		Map<String , Object> map = new HashMap<String, Object>();
		map.put("userObj", sesiion.getAttribute("staff"));
		json.setDatas(map);
		json.setMsg("加载登录用户成功");
		json.setCode(1l);
		return json;
	}
	
}
