package com.hcoa.service;

import java.util.List;

import com.hcoa.entity.Approve;
import com.hcoa.entity.Forum;
import com.hcoa.entity.StaffInfo;

public interface LoginService {

	StaffInfo getStaff(String username,String password);
	
	List<Forum> getForum();

	List<Approve> getApprove(Long id);

}
