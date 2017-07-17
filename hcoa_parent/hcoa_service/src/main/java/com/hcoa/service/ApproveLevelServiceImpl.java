package com.hcoa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcoa.dao.ApproveLevelMapper;
import com.hcoa.entity.ApproveLevel;
import com.hcoa.entity.ApproveLevelExample;

@Service
public class ApproveLevelServiceImpl implements ApproveLevelService {

	@Autowired
	ApproveLevelMapper approveLevelMapper;
	public void addRule(ApproveLevel aa) {
		approveLevelMapper.insertSelective(aa);
		
	}
	public int insertSelective(ApproveLevel record) {
		return approveLevelMapper.insertSelective(record);
	}
	 public void delLevel(Long id) {
	    approveLevelMapper.deleteByPrimaryKey(id);
	}
	 public boolean judgeName(String name) {//判断审批规则的
	        ApproveLevelExample approveLevelExample=new ApproveLevelExample();
	        approveLevelExample.createCriteria().andRuleCaptionEqualTo(name);
	        List<ApproveLevel> list=approveLevelMapper.selectByExample(approveLevelExample);
	        if(list!=null&&list.size()>0){//如果存在这个规则名称 返回true 否则false
	            return  true;
	        }
	        return false;
	    }
	 public void addGuize(Long id, String name, Integer level) {
	        ApproveLevel approveLevel=new ApproveLevel();
	        approveLevel.setRuleCaption(name);
	        approveLevel.setApproveLevel(level);
	        approveLevel.setFlowNodeId(id);
	        approveLevelMapper.insertSelective(approveLevel);
	    }


}
