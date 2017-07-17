package com.hcoa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcoa.dao.ApproveLevelMapper;
import com.hcoa.dao.ApproveProjectMapper;
import com.hcoa.dao.FlowNodeMapper;
import com.hcoa.entity.ApproveLevel;
import com.hcoa.entity.ApproveProject;
import com.hcoa.entity.FlowNode;
import com.hcoa.entity.FlowNodeExample;


@Service
public class FlowServiceImpl implements FlowService {
	@Autowired
	ApproveProjectMapper approveProjectMapper;
	@Autowired
	FlowNodeMapper flowNodeMapper;
	@Autowired
	ApproveLevelMapper approveLevelMapper;
	
	public List<ApproveProject> getFlow() {
		
		return approveProjectMapper.getFlow();
	}
	public List<FlowNode> getNode(long id) {
	/*	FlowNodeExample e=new FlowNodeExample();
		
		e.setOrderByClause("node_num");
		e.createCriteria().andApproveProjectIdEqualTo(flag);
		List<FlowNode> fn=flowNodeMapper.selectByExample(e);*/
		return flowNodeMapper.getNode(id);
	}
	public List<ApproveLevel> getLevel(long flag) {
		return approveLevelMapper.getLevel(flag);
	}
	 public void updateProject(Long id,String caption,String name, String tableName, String content) {
	        ApproveProject approveProject=new ApproveProject();
	        approveProject.setName(name);
	        approveProject.setId(id);
	        approveProject.setCaption(caption);
	        approveProject.setTableName(tableName); 
	        approveProject.setContent(content);
	        approveProjectMapper.updateByPrimaryKeySelective(approveProject);
	    }

}
