package com.hcoa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcoa.dao.RoleSetMapper;
import com.hcoa.entity.RoleSet;
@Service
public class RoleSetServiceImpl implements RoleSetService {

	@Autowired
	RoleSetMapper roleSetMapper;
	public List<RoleSet> getRole() {
		return roleSetMapper.getRole();	 
	}
	public List<RoleSet> getSelRole(Long flag) {
		return roleSetMapper.getRoleSel(flag);
		
	
	}

}
