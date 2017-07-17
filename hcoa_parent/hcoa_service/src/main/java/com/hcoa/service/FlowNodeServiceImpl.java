package com.hcoa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcoa.dao.ApproveLevelMapper;
import com.hcoa.dao.FlowNodeMapper;
import com.hcoa.entity.ApproveLevel;
import com.hcoa.entity.ApproveLevelExample;
import com.hcoa.entity.FlowNode;
import com.hcoa.entity.FlowNodeExample;

@Service
public class FlowNodeServiceImpl implements FlowNodeService {
	@Autowired
	FlowNodeMapper flowNodeMapper;
	@Autowired
	ApproveLevelMapper approveLevelMapper;

	public void addNode(FlowNode ff) {
		flowNodeMapper.insertSelective(ff);
	}

	public void editN(FlowNode fn) {
		flowNodeMapper.updateByPrimaryKeySelective(fn);
	}

	 public void delNodes(Long[] ids) {
	        for(long id:ids){
	            FlowNode f=new FlowNode();
	            ApproveLevel aL=new ApproveLevel();
	            ApproveLevelExample e1=new ApproveLevelExample();
	            e1.createCriteria().andFlowNodeIdEqualTo(id);
	            if(approveLevelMapper.selectByExample(e1)!=null&&approveLevelMapper.selectByExample(e1).size()>0){
	                long id3=approveLevelMapper.selectByExample(e1).get(0).getId();//关联的表
	                approveLevelMapper.deleteByPrimaryKey(id3);//删除
	            }
	            flowNodeMapper.deleteByPrimaryKey(id);
	        }
	    }

	 public void addNodes(Long id, String num, String caption, String remark) {
	        FlowNode flowNode=new FlowNode();
	        flowNode.setApproveProjectId(id); flowNode.setNodeNum(num); flowNode.setNodeCaption(caption);
	        if(remark!=null) flowNode.setRemark(remark);
	        flowNodeMapper.insertSelective(flowNode);//插flownode表
	        FlowNodeExample flowNodeExample=new FlowNodeExample();
	        flowNodeExample.createCriteria().andNodeCaptionEqualTo(caption);
	        long id2=flowNodeMapper.selectByExample(flowNodeExample).get(0).getId();
	        ApproveLevel approveLevel=new ApproveLevel();
	        approveLevel.setFlowNodeId(id2);
	        approveLevel.setRuleCaption(caption);
	        approveLevel.setApproveLevel(1);//默认都是1
	        approveLevelMapper.insert(approveLevel);
	    }

    public List<FlowNode> judgeCaption(String nodeCaption, Long id) {
        if(id==null){
            return null;
        }else{
            FlowNodeExample example=new FlowNodeExample();
            example.createCriteria().andNodeCaptionEqualTo(nodeCaption).andApproveProjectIdEqualTo(id);
            List<FlowNode> list=flowNodeMapper.selectByExample(example);
            System.out.println(list.size());
            if(list!=null&&list.size()>0){//原表有
                return  list;
            }
            return null;
        }
    }

	 public List<FlowNode> judgeNum(String nodeNum,Long id) {
	        if(id==null){
	            return null;
	        }else {
	            FlowNodeExample example = new FlowNodeExample();
	            example.createCriteria().andNodeNumEqualTo(nodeNum).andApproveProjectIdEqualTo(id);
	            List<FlowNode> list = flowNodeMapper.selectByExample(example);
	            if (list != null && list.size() > 0) {
	                return list;
	            }
	            return null;
	        }
	    }

	    public void updateNode(Long id,String num,String caption,String remark) {
	        FlowNode flowNode=new FlowNode();
	        flowNode.setId(id); flowNode.setNodeNum(num); flowNode.setNodeCaption(caption); flowNode.setRemark(remark);
	        flowNodeMapper.updateByPrimaryKeySelective(flowNode);
	        /*ApproveLevelExample e=new ApproveLevelExample();
	        e.createCriteria().andFlowNodeIdEqualTo(id);
	        List<ApproveLevel> list=approveLevelMapper.selectByExample(e);
	        long id1=list.get(0).getId();
	        ApproveLevel approveLevel=new ApproveLevel();
	        approveLevel.setId(id1);
	        approveLevel.setFlowNodeId(id);
	        approveLevel.setRuleCaption(caption);
	        approveLevelMapper.updateByPrimaryKeySelective(approveLevel);*/
	    }

	
}
