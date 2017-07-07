package com.hcoa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcoa.dao.StaffInfoMapper;
import com.hcoa.entity.StaffInfo;
import com.hcoa.entity.StaffInfoExample;

@Service
public class TestServiceImpl implements TestService {
	@Autowired
	StaffInfoMapper sf;
	

	public StaffInfo test() {
		return sf.selectByExample(new StaffInfoExample()).get(0);
	}

}
