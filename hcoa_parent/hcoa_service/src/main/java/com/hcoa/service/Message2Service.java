package com.hcoa.service;

import java.util.List;

import com.hcoa.entity.Approve;
import com.hcoa.entity.DeliverApprove;
import com.hcoa.entity.FlowNode;
import com.hcoa.entity.ProjectFlow;
import com.hcoa.entity.SendArticle;
import com.hcoa.entity.SendArticleAttach;

public interface Message2Service {

	List<Approve> getAll(Long id);

	List<Approve> getAllProcessing(Long id);

	List<SendArticle> getAllArticle(Long id);

	FlowNode getOneArt(String nodenum);

	void insertOneProject(ProjectFlow projectFlow);

	void insertOneDeliverApprove(DeliverApprove deliverApprove);

	void updateFlag(Long articleid);

	Long getI(String nodeCode, Long articleid);

	void insertOneApprove(Approve approve);

	void delProjectFlow(Long articleid);

	void delDeliverApprove(Long articleid);

	void delApprove(Long articleid);

	Approve getOneApprove(long id);

	void updateApprove(long id);

	void updateSendArt(Long publicId);

	void updateApproveProcessing(long id);

	long getflowId(Long publicId);

	com.hcoa.entity.FlowNode getOneFlowNode(long flowId);

	void updateflow(Long publicId);

	SendArticle getOneSendArticle(long id);

	void updateEditArticle(SendArticle sendArticle);

	void updatePublishArticle(long id);

	void updateCancelArticle(long id);

	List<SendArticleAttach> getSendArticleAttach(Long publicId);

	void delAttachs(Long i);

	List<SendArticle> getarticle_manager_all();
	
	public  SendArticleAttach selectByAttachId(Long id);

}
