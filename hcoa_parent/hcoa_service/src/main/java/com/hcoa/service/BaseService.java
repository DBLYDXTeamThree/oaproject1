package com.hcoa.service;

import java.util.List;
import java.util.Map;

import com.hcoa.entity.Department;
import com.hcoa.entity.StaffInfo;

public interface BaseService {
	/**
	 * 查找所有部门
	 * @return
	 */
	public List<Department> getDepts();
	/**
	 * 查找所有员工
	 * @return
	 */
	public Map<String,Object> getPersonList();

}
