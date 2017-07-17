package com.hcoa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcoa.dao.StaffInfoMapper;
import com.hcoa.entity.StaffInfo;

@Service
public class StaffInfoServiceImpl implements StaffInfoService{

	@Autowired
	StaffInfoMapper staffInfoMapper;
	
	/*public List<StaffInfoVo> getStaffInfo() {
		List<StaffInfoVo> sim=staffInfoMapper.getStaffInfo();
		return sim;
	}*/

	public List<StaffInfo> selectStaff() {
		List<StaffInfo> sim=staffInfoMapper.selectStaff();
		return sim;
	}

	public List<StaffInfo> selectStaffByDept(Long id) {
		List<StaffInfo> sim = staffInfoMapper.selectStaffByDept(id);
		return sim;
	}

	public void fireUserById(long id) {
		staffInfoMapper.fireUserById(id);
	}

	public List<StaffInfo> searchByRealName(String realname) {
		return staffInfoMapper.searchByRealName(realname);
	}

	public int insertSelective(StaffInfo staffInfo) {
		return staffInfoMapper.insertSelective(staffInfo);
	}

	public StaffInfo selectByPrimaryKey(Long id) {
		return staffInfoMapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(StaffInfo record) {
		return staffInfoMapper.updateByPrimaryKeySelective(record);
	}
	
}
