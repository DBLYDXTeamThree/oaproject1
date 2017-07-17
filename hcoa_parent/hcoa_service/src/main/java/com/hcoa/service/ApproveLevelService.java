package com.hcoa.service;

import com.hcoa.entity.ApproveLevel;

public interface ApproveLevelService {

	void addRule(ApproveLevel aa);
	
	int insertSelective(ApproveLevel record);

	void delLevel(Long id);

	boolean judgeName(String ruleCaption);

	void addGuize(Long flowNodeId, String ruleCaption, Integer approveLevel);

}
