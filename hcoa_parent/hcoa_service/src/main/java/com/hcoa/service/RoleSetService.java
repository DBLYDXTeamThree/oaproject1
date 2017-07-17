package com.hcoa.service;

import java.util.List;

import com.hcoa.entity.RoleSet;

public interface RoleSetService {

	List<RoleSet> getRole();

	List<RoleSet> getSelRole(Long flag);

}
