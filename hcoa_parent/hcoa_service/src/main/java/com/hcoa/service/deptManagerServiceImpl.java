package com.hcoa.service;

import java.rmi.StubNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcoa.dao.DepartmentMapper;
import com.hcoa.entity.Department;
import com.hcoa.entity.DepartmentExample;
import com.hcoa.entity.StaffInfo;
@Service
public class deptManagerServiceImpl implements deptManagerService{
@Autowired
   DepartmentMapper  deptmapper;
	public List<Department> getdept() {
		List<Department> list=deptmapper.selectByExample(new DepartmentExample());
		return list;
	}
	public void add(Department dep) {
	deptmapper.insert(dep);
	}
	public List<Department> findByString(String str) {
		String str1="%"+str+"%";
		List<Department> list=deptmapper.findByStr(str1);
		return list;
	}
	public Boolean delete(Long id) {
		List<StaffInfo> list=deptmapper.selectstuffbyid(id);
        if(list==null||list.size()==0){
        	deptmapper.deleteByPrimaryKey(id);
        	return true;
        }
        else{
        	System.err.println(list.size());
        	return false;
        }
	}
	public void update(Department dep) {
		deptmapper.updateByPrimaryKeySelective(dep);
	}

}
