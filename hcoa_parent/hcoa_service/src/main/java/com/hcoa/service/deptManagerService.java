package com.hcoa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcoa.entity.Department;
@Service
public interface deptManagerService {
	public List<Department> getdept();

	public void add(Department dep);

	public List<Department> findByString(String str);

	public Boolean delete(Long id);

	public void update(Department dep);

}
