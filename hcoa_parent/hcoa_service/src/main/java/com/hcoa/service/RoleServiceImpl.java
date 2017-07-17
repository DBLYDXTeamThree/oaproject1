package com.hcoa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcoa.dao.RoleSetMapper;
import com.hcoa.entity.RoleSet;

@Service
public class RoleServiceImpl implements RoleService {

	/*@Autowired
	UserMapper userMapper;*/
	@Autowired
	RoleSetMapper roleSetMapper;
	
/*	public User getUserWithId(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}*/

	public List<RoleSet> getRole() {
		return roleSetMapper.getRole();
	}

	public void deleteByPrimaryKey(long id) {
		roleSetMapper.deleteByPrimaryKey(id);
	}

	public int insertSelective(RoleSet record) {
		return roleSetMapper.insert(record);
	}

	public int updateByPrimaryKeySelective(RoleSet record) {
		return roleSetMapper.updateByPrimaryKeySelective(record);
	}

	public List<RoleSet> searchByRoleCaption(String sea) {
		return roleSetMapper.searchByRoleCaption(sea);
	}

}
