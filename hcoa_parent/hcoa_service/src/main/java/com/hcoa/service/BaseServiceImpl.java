package com.hcoa.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcoa.dao.DepartmentMapper;
import com.hcoa.dao.StaffInfoMapper;
import com.hcoa.entity.Department;
import com.hcoa.entity.DepartmentExample;
import com.hcoa.entity.StaffInfo;
import com.hcoa.entity.StaffInfoExample;

@Service
public class BaseServiceImpl implements BaseService {
	@Autowired
	DepartmentMapper detpMapper;
	@Autowired
	StaffInfoMapper staffInfoMapper;
	
	public List<Department> getDepts(){
		return detpMapper.selectByExample(new DepartmentExample());
	}
	
	public Map<String,Object> getPersonList() {
		List<StaffInfo> all = staffInfoMapper.selectByExample(new StaffInfoExample());
		List<StaffInfo> list1 = new ArrayList<StaffInfo>();
		List<StaffInfo> list2 = new ArrayList<StaffInfo>();
		List<StaffInfo> list3 = new ArrayList<StaffInfo>();
		List<StaffInfo> list4 = new ArrayList<StaffInfo>();
		for(StaffInfo s : all){
			if(s.getRoleId()==4){
				list1.add(s);
			}
			if(s.getRoleId()==3){
				list2.add(s);
			}
			if(s.getRoleId()==2){
				list3.add(s);
			}
			if(s.getRoleId()==1){
				list4.add(s);
			}
		}
		Map<String,Object>  map = new HashMap<String, Object>();
		map.put("1", list1);
		map.put("2", list2);
		map.put("3", list3);
		map.put("4", list4);
		return map;
	}
}