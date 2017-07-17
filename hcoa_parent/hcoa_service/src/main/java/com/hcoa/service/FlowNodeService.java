package com.hcoa.service;

import java.util.List;

import com.hcoa.entity.FlowNode;

public interface FlowNodeService {

	void addNode(FlowNode ff);

	void editN(FlowNode fnn);

	void delNodes(Long[] ids);

	void addNodes(Long approveProjectId, String nodeNum, String nodeCaption, String remark);

	List<FlowNode> judgeCaption(String nodeCaption, Long approveProjectId);

	List<FlowNode> judgeNum(String nodeNum, Long approveProjectId);

	void updateNode(Long id, String nodeNum, String nodeCaption, String remark);
	

}
