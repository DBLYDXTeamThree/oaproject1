package com.hcoa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcoa.dao.ApproveMapper;
import com.hcoa.dao.ForumMapper;
import com.hcoa.dao.StaffInfoMapper;
import com.hcoa.entity.Approve;
import com.hcoa.entity.Forum;
import com.hcoa.entity.StaffInfo;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
	StaffInfoMapper staffInfoMapper;
    @Autowired
    ForumMapper forumMapper;
    @Autowired
    ApproveMapper approveMapper;
    
	public StaffInfo getStaff(String username,String password) {
		return staffInfoMapper.selectByUsernameAndPassword(username, password);
	}

	@Override
	public List<Forum> getForum() {
		return forumMapper.selectAll();
	}

	@Override
	public List<Approve> getApprove(Long id) {
		return approveMapper.selectAllProcessing(id);
	}

}
