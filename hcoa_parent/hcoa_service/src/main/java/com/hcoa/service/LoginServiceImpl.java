package com.hcoa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcoa.dao.StaffInfoMapper;
import com.hcoa.entity.StaffInfo;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
	StaffInfoMapper staffInfoMapper;
	public StaffInfo getStaff(String username,String password) {
		return staffInfoMapper.selectByUsernameAndPassword(username, password);
	}

}
