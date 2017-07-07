package com.hcoa.service;

import com.hcoa.entity.StaffInfo;

public interface LoginService {

	StaffInfo getStaff(String username,String password);

}
