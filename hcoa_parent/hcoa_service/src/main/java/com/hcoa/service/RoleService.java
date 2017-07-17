package com.hcoa.service;

import java.util.List;

import com.hcoa.entity.RoleSet;

public interface RoleService {
	
	public List<RoleSet> getRole();
	
	public void deleteByPrimaryKey(long id);
	
	public int insertSelective(RoleSet record);
	
	public int updateByPrimaryKeySelective(RoleSet record);
	
	List<RoleSet> searchByRoleCaption(String sea);
	
}
