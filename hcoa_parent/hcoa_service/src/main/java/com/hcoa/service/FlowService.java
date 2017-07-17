package com.hcoa.service;

import java.util.List;

import com.hcoa.entity.ApproveLevel;
import com.hcoa.entity.ApproveProject;
import com.hcoa.entity.FlowNode;


public interface FlowService {

	List<ApproveProject> getFlow();

	List<FlowNode> getNode( long flag);

	List<ApproveLevel> getLevel( long flag);

/*	void updateProject(Long id, String name, String tableName, String content);*/

	void updateProject(Long id, String caption, String name, String tableName, String content);



}
