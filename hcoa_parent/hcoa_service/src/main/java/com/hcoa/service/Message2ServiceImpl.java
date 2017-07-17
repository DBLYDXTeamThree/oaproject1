package com.hcoa.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcoa.dao.ApproveMapper;
import com.hcoa.dao.DeliverApproveMapper;
import com.hcoa.dao.FlowNodeMapper;
import com.hcoa.dao.ProjectFlowMapper;
import com.hcoa.dao.SendArticleAttachMapper;
import com.hcoa.dao.SendArticleMapper;
import com.hcoa.entity.Approve;
import com.hcoa.entity.ApproveExample;
import com.hcoa.entity.DeliverApprove;
import com.hcoa.entity.DeliverApproveExample;
import com.hcoa.entity.FlowNode;
import com.hcoa.entity.ProjectFlow;
import com.hcoa.entity.ProjectFlowExample;
import com.hcoa.entity.SendArticle;
import com.hcoa.entity.SendArticleAttach;
import com.hcoa.entity.SendArticleAttachExample;
import com.hcoa.entity.SendArticleExample;

@Service
public class Message2ServiceImpl implements Message2Service {

	@Autowired
	ApproveMapper approveMapper;
	@Autowired
	SendArticleMapper sendArticleMapper;
	@Autowired
	FlowNodeMapper flowNodeMapper;
	@Autowired
	ProjectFlowMapper projectFlowMapper;
	@Autowired
	DeliverApproveMapper deliverApproveMapper;
	@Autowired
	SendArticleAttachMapper sendArticleAttachMapper;
	public List<Approve> getAll(Long id) {
		return approveMapper.selectAll(id);
	}
	public List<Approve> getAllProcessing(Long id) {
		return approveMapper.selectAllProcessing(id);
	}
	public List<SendArticle> getAllArticle(Long id) {
		return sendArticleMapper.selectAll(id);
	}
	public FlowNode getOneArt(String nodenum) {
		return flowNodeMapper.getOneArt(nodenum);
	}
	@Transactional
	public void insertOneProject(ProjectFlow projectFlow) {
		projectFlowMapper.insertSelective(projectFlow);
	}
	@Transactional
	public void insertOneDeliverApprove(DeliverApprove deliverApprove) {
		deliverApproveMapper.insertSelective(deliverApprove);
	}
	@Transactional
	public void updateFlag(Long articleid) {
		SendArticle s=sendArticleMapper.selectByPrimaryKey(articleid);
		s.setDeliverApproveFlag(1);
		sendArticleMapper.updateByPrimaryKeySelective(s);
	}
	public Long getI(String nodeCode, Long articleid) {
		String s=nodeCode.substring(0,1);
		nodeCode=s.toLowerCase()+nodeCode.substring(1,nodeCode.length());
		Map<String,Object> map=new HashMap<>();
		map.put("nodeCode", nodeCode);
		map.put("articleid", articleid);
		return sendArticleMapper.getI(map);
	}
	@Transactional
	public void insertOneApprove(Approve approve) {
		approveMapper.insertSelective(approve);
	}
	@Transactional
	@Override
	public void delProjectFlow(Long articleid) {
		ProjectFlowExample p=new ProjectFlowExample();
		p.createCriteria().andPublicIdEqualTo(articleid);
		projectFlowMapper.deleteByExample(p);
	}
	@Transactional
	@Override
	public void delDeliverApprove(Long articleid) {
		DeliverApproveExample d=new DeliverApproveExample();
		d.createCriteria().andPublicIdEqualTo(articleid);
		deliverApproveMapper.deleteByExample(d);
	}
	@Transactional
	@Override
	public void delApprove(Long articleid) {
		ApproveExample a=new ApproveExample();
		a.createCriteria().andPublicIdEqualTo(articleid);
		approveMapper.deleteByExample(a);
	}
	@Override
	public Approve getOneApprove(long id) {
		return approveMapper.selectByPrimaryKey(id);
	}
	@Transactional
	@Override
	public void updateApprove(long id) {
		Approve approve=approveMapper.selectByPrimaryKey(id);
		approve.setOperationStatus("NoPass");
		approveMapper.updateByPrimaryKeySelective(approve);
	}
	@Transactional
	@Override
	public void updateSendArt(Long publicId) {
		SendArticle s=sendArticleMapper.selectByPrimaryKey(publicId);
		s.setDeliverApproveFlag(4);
		sendArticleMapper.updateByPrimaryKeySelective(s);
	}
	@Transactional
	@Override
	public void updateApproveProcessing(long id) {
		Approve approve=approveMapper.selectByPrimaryKey(id);
		approve.setOperationStatus("Finished");
		approveMapper.updateByPrimaryKeySelective(approve);
	}
	@Override
	public long getflowId(Long publicId) {
		return projectFlowMapper.getflowId(publicId);
	}
	@Override
	public FlowNode getOneFlowNode(long flowId) {
		return flowNodeMapper.selectByPrimaryKey(flowId);
	}
	@Transactional
	@Override
	public void updateflow(Long publicId) {
		ProjectFlow p=projectFlowMapper.selectByPublicId(publicId);
		p.setNodeStatus("1");
		projectFlowMapper.updateByPrimaryKeySelective(p);
	}
	@Override
	public SendArticle getOneSendArticle(long id) {
		return sendArticleMapper.selectOneSendArticle(id);
	}
	@Transactional
	@Override
	public void updateEditArticle(SendArticle sendArticle) {
		sendArticleMapper.updateByPrimaryKeySelective(sendArticle);
	}
	@Transactional
	@Override
	public void updatePublishArticle(long id) {
		SendArticle s=sendArticleMapper.selectByPrimaryKey(id);
		s.setPublishFlag(1);
		sendArticleMapper.updateByPrimaryKeySelective(s);
	}
	@Transactional
	@Override
	public void updateCancelArticle(long id) {
		SendArticle s=sendArticleMapper.selectByPrimaryKey(id);
		s.setPublishFlag(0);
		sendArticleMapper.updateByPrimaryKeySelective(s);
	}
	@Override
	public List<SendArticleAttach> getSendArticleAttach(Long publicId) {
		SendArticleAttachExample s=new SendArticleAttachExample();
		s.createCriteria().andSendArticleIdEqualTo(publicId);
		return sendArticleAttachMapper.selectByExample(s);
	}
	@Transactional
	@Override
	public void delAttachs(Long i) {
		sendArticleAttachMapper.deleteByPrimaryKey(i);
	}
	@Override
	public List<SendArticle> getarticle_manager_all() {
		return sendArticleMapper.selectarticle_manager_all();
	}
	@Override
	public  SendArticleAttach selectByAttachId(Long id) {
		return sendArticleAttachMapper.selectByPrimaryKey(id);
	}

}
