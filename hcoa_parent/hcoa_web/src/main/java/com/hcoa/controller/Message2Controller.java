package com.hcoa.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hcoa.entity.Approve;
import com.hcoa.entity.DeliverApprove;
import com.hcoa.entity.FlowNode;
import com.hcoa.entity.ProjectFlow;
import com.hcoa.entity.SendArticle;
import com.hcoa.entity.SendArticleAttach;
import com.hcoa.entity.StaffInfo;
import com.hcoa.service.Message2Service;
import com.hcoa.utils.ResponseJson;

@Controller
@RequestMapping("/")
public class Message2Controller {

	@Autowired
	Message2Service message2Service;
	@RequestMapping("/history_manager1")
	public String history_manager(Model model,HttpSession session){
		StaffInfo staff=(StaffInfo) session.getAttribute("staff");
		List<Approve>  approve=message2Service.getAll(staff.getId());
		model.addAttribute("approve", approve);
		return "sendArticle/history_manager";
	}
	@RequestMapping("/backlog_manager1")
	public String backlog_manager(Model model,HttpSession session){
		StaffInfo staff=(StaffInfo) session.getAttribute("staff");
		List<Approve>  approve=message2Service.getAllProcessing(staff.getId());
		model.addAttribute("approve", approve);
		return "sendArticle/backlog_manager";
	}
	@RequestMapping("/article_manager")
	public String article_manager(Model model,HttpSession session){
		StaffInfo staff=(StaffInfo) session.getAttribute("staff");
		List<SendArticle> sa=message2Service.getAllArticle(staff.getId());
		model.addAttribute("sa", sa);
		return "sendArticle/article_manager";
	}
	/*@RequestMapping("/getArticleList")
	@ResponseBody
	public List<Map<String,Object>> getArticleList(HttpSession session){
		List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
		StaffInfo staff=(StaffInfo) session.getAttribute("staff");
		List<SendArticle> sa=message2Service.getAllArticle(staff.getId());
		for(SendArticle i:sa){
			Map<String,Object> map=new HashMap<String, Object>();
			map.put("id", i.getId());
			map.put("caption", i.getCaption());
			map.put("dispatcher", i.getDispatcherName().getRealname());
			map.put("unit_sign", i.getUnitSignName().getRealname());
			map.put("checker", i.getCheckerName().getRealname());
			map.put("check_article", i.getCheckArticleName().getRealname());
			map.put("main_dept", i.getDepartment().getDepartmentCaption());
			map.put("drafter", i.getDrafter());
			if(i.getDeliverApproveFlag()==0)map.put("deliver_approve_flag", "δ����");
			if(i.getDeliverApproveFlag()==1)map.put("deliver_approve_flag", "������");
			if(i.getDeliverApproveFlag()==3)map.put("deliver_approve_flag", "��ͨ��");
			if(i.getDeliverApproveFlag()==4)map.put("deliver_approve_flag", "���˻�");
			list.add(map);
		}
		return list;
	}*/
	
	@RequestMapping("/send_art")
	public String send_art(HttpSession session,Long articleid,String nodenum){
		message2Service.updateFlag(articleid);
		StaffInfo staff=(StaffInfo) session.getAttribute("staff");
		if(nodenum==null)nodenum="1";
		//System.err.println(nodenum);
		FlowNode flowNode=message2Service.getOneArt(nodenum);
		//System.err.println(flowNode.getId());
		ProjectFlow projectFlow=new ProjectFlow();
		projectFlow.setApproveProjectId((long) 1);
		projectFlow.setFlowNodeId(flowNode.getId());
		projectFlow.setNodeStatus("0");
		projectFlow.setCurrentCycleTime(1);
		projectFlow.setCurrentApproveLevel(1);
		projectFlow.setPublicId(articleid);
		message2Service.insertOneProject(projectFlow);
		//System.err.println("===========================");
		DeliverApprove deliverApprove=new DeliverApprove();
		deliverApprove.setApproveProjectId((long) 1);
		deliverApprove.setPublicId(articleid);
		deliverApprove.setDeliverId(staff.getId());
		deliverApprove.setProjectFlowId(projectFlow.getId());
		deliverApprove.setDeliverDatetime(new Date());
		message2Service.insertOneDeliverApprove(deliverApprove);
		//System.err.println(flowNode.getNodeCode());
		Long i=message2Service.getI(flowNode.getNodeCode(),articleid);
		//System.err.println(i);
		Approve approve=new Approve();
		approve.setDeliverApproveId(deliverApprove.getId());
		approve.setPublicId(articleid);
		approve.setApproveProjectId((long) 1);
		approve.setApproverId(i);
		approve.setApproveLevel((long) 1);
		approve.setOperationStatus("Processing");
		message2Service.insertOneApprove(approve);
		return "redirect:article_manager";
	}
	@RequestMapping("/resend_art")
	public String resend_art(Long articleid){
		message2Service.delApprove(articleid);
		message2Service.delDeliverApprove(articleid);
		message2Service.delProjectFlow(articleid);
		return "redirect:send_art?articleid="+articleid;
	}
	@RequestMapping("/disagreeArt")
	public String disagreeArt(long id){
		message2Service.updateApprove(id);
		Approve approve=message2Service.getOneApprove(id);
		message2Service.updateSendArt(approve.getPublicId());
		return "redirect:backlog_manager";
	}
	@RequestMapping("/agreeArt")
	public String agreeArt(long id){
		message2Service.updateApproveProcessing(id);
		Approve approve=message2Service.getOneApprove(id);
		long flowId=message2Service.getflowId(approve.getPublicId());
		message2Service.updateflow(approve.getPublicId());
		FlowNode flowNode=message2Service.getOneFlowNode(flowId);
		String nodenum=null;
		if(flowNode.getNodeNum().equals("1")){nodenum="2";}
		if(flowNode.getNodeNum().equals("2")){nodenum="3";}
		if(flowNode.getNodeNum().equals("3")){nodenum="4";}
		if(flowNode.getNodeNum().equals("4")){return "redirect:backlog_manager";}
		return "redirect:send_art?nodenum="+nodenum+"&articleid="+approve.getPublicId();
	}
	@RequestMapping("/editArticle")
	public String editArticle(long id,Model model){
		SendArticle article=message2Service.getOneSendArticle(id);
		model.addAttribute("article", article);
		return "sendArticle/editArticle";
	}
	@RequestMapping("/saveEditArticle")
	public String saveEditArticle(SendArticle sendArticle,@DateTimeFormat(pattern="yyyy-MM-dd")Date createtime1){
		sendArticle.setCreatetime(createtime1);
		message2Service.updateEditArticle(sendArticle);
		return "redirect:article_manager";
	}
	@RequestMapping("/publishArticle")
	public String publishArticle(long id){
		message2Service.updatePublishArticle(id);
		return "redirect:article_manager";
	}
	@RequestMapping("/cancelArticle")
	public String cancelArticle(long id){
		message2Service.updateCancelArticle(id);
		return "redirect:article_manager";
	}
	@RequestMapping("/loadAttachList")
	@ResponseBody
	public ResponseJson loadAttachList(long articleid){
		System.err.println(articleid);
		Approve approve=message2Service.getOneApprove(articleid);
		List<SendArticleAttach> sendArticleAttach=message2Service.getSendArticleAttach(approve.getPublicId());
	    System.err.println(sendArticleAttach);
		Map<String,Object> map=new HashMap<>();
	    map.put("attachList", sendArticleAttach);
	    ResponseJson json=new ResponseJson();
	    json.setCode(1l);
	    json.setDatas(map);
	    System.err.println("+++++++++++++++++++++++++++++");
	    return json;
	}
	@RequestMapping("/loadAttachList1")
	@ResponseBody
	public ResponseJson loadAttachList1(long id){
		List<SendArticleAttach> sendArticleAttach=message2Service.getSendArticleAttach(id);
		Map<String,Object> map=new HashMap<>();
	    map.put("attachList", sendArticleAttach);
	    ResponseJson json=new ResponseJson();
	    json.setCode(1l);
	    json.setDatas(map);
	    return json;
	}
	@RequestMapping("/delAttachs")
	@ResponseBody
	public ResponseJson delAttachs(@RequestParam("idList[]") Long[] idList){
		SendArticleAttach attach = message2Service.selectByAttachId(idList[0]);
		for(Long i:idList){
			message2Service.delAttachs(i);
		}
		List<SendArticleAttach> sendArticleAttach=message2Service.getSendArticleAttach(attach.getCreateby());
		Map<String,Object> map=new HashMap<>();
	    map.put("attachList", sendArticleAttach);
	    ResponseJson json=new ResponseJson();
	    json.setCode(1l);
	    json.setDatas(map);
	    return json;
	}
	@RequestMapping("/article_manager_all")
	public String article_manager_all(Model model){
		List<SendArticle> sa=message2Service.getarticle_manager_all();
		model.addAttribute("sa", sa);
		return "sendArticle/article_manager_all";
	}
	
}
