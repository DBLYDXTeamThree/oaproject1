package com.hcoa.service;

import java.util.List;

import com.hcoa.entity.StaffInfo;

public interface StaffInfoService {
	
	//List<StaffInfoVo> getStaffInfo();
	
	List<StaffInfo> selectStaff();
	
	List<StaffInfo> selectStaffByDept(Long id);
	
	void fireUserById(long id);
	
	List<StaffInfo> searchByRealName(String realname);
	
	public int insertSelective(StaffInfo staffInfo);

	StaffInfo selectByPrimaryKey(Long id);
	
	int updateByPrimaryKeySelective(StaffInfo record);
}
