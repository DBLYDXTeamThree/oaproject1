package com.hcoa.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hcoa.entity.ApproveLevel;
import com.hcoa.entity.ApproveProject;
import com.hcoa.entity.FlowNode;
import com.hcoa.entity.RoleSet;
import com.hcoa.service.ApproveLevelService;
import com.hcoa.service.ApproveService;
import com.hcoa.service.FlowNodeService;
import com.hcoa.service.FlowService;
import com.hcoa.service.RoleSetService;
import com.hcoa.utils.ResponseJson;


@Controller
@RequestMapping("/")
public class FlowController {
	@Autowired
	FlowService flowService;
	@Autowired
	ApproveService approveService;
	@Autowired
	FlowNodeService flowNodeService;
	@Autowired
	ApproveLevelService approveLevelService;
	@Autowired
	RoleSetService roleSetService;

	@RequestMapping("/flow_manager")
	//查询项目
	public String flow_manager(Model model){
		List<ApproveProject> pf=flowService.getFlow();
		/*for (ApproveProject approveProject : pf) {
			System.err.println(approveProject.getContent());
		}*/
		model.addAttribute("pf", pf);
		return "flow/flow_manager";
	}
	//新增项目
    @RequestMapping("/addProject")
    @ResponseBody
    public boolean addProject(@RequestBody ApproveProject approveProject){
        boolean flag=approveService.judgeLiucheng(approveProject.getCaption(),approveProject.getName());
        if(flag){
            return false;
        }else{
        	approveService.addPro(approveProject.getCaption(),approveProject.getName(),approveProject.getContent(),approveProject.getTableName());
            return true;
        }
    }

	/*@RequestMapping("/addProject")
	@ResponseBody
	public ResponseJson add(Model model,@RequestBody ApproveProject ap){
		ap.setCreatetime(new Date());
		approveService.addPro(ap);
		ResponseJson json = new ResponseJson();
		json.setMsg("ok");
		json.setCode(1l);
		
		return json;
		
	}*/
	//删除项目
	@RequestMapping("/delProject")
	@ResponseBody
	 public Map<String,Object> delProject(@RequestBody ApproveProject aP){
        Map<String,Object> map=new HashMap<>();
        approveService.delProjects(aP.getIds());
        map.put("flag",true);
        return map;
    }
	  //修改项目
	 @RequestMapping("/projectedit")
	    @ResponseBody
	    public Map<String,Object> updateProject(@RequestBody ApproveProject aP){
		 System.err.println("====================="+aP.getContent());
	        System.out.println(aP.getId()+ aP.getCaption()+aP.getName()+ aP.getTableName()+ aP.getContent()+"000111++++++++++++++++++++++++++++++++++");
	        Map<String,Object> map=new HashMap<>();
	        if(aP.getName()==null)
	            map.put("flag",false);
	        else{
	        	flowService.updateProject(aP.getId(),aP.getCaption(), aP.getName(), aP.getTableName(), aP.getContent());
	            map.put("flag",true);
	        }
	        return map;
	    }
   /* 
	@RequestMapping("/editProject")
	@ResponseBody
	public boolean editP(Model model,@RequestBody ApproveProject ep){
		System.out.println(ep);
		ApproveProject ap = new ApproveProject();
		ap.setCaption(ep.getCaption());
		ap.setContent(ep.getContent());
		approveService.editP(ap);
		return true;
	}*/
	//查询获得所有节点
	@RequestMapping("/node_manager")
	public String node_manager(Model model, Long id){
		
		List<FlowNode> fn= flowService.getNode(id);
		//System.out.println(flag);
	    model.addAttribute("fn", fn);

	    model.addAttribute("flag", id);
	    return "flow/node_manager";
	}
	/*
	@RequestMapping("/addNode")
	@ResponseBody
	public ResponseJson addNode(@RequestBody FlowNode ff,Model model,Long flag){
        ff.setApproveProjectId(flag);
		flowNodeService.addNode(ff);
		ResponseJson json = new ResponseJson();
		json.setMsg("ahhahaha");
		json.setCode(1l);
		
		return json;
	}*/
	//添加节点
	 @RequestMapping("/addNode")
	    @ResponseBody
	    public boolean addNode(@RequestBody FlowNode flowNode){
		// System.out.println(flowNode.getApproveProjectId()+flowNode.getNodeNum()+flowNode.getNodeCaption()+flowNode.getRemark());
	        List<FlowNode> list1=flowNodeService.judgeCaption(flowNode.getNodeCaption(),flowNode.getApproveProjectId());
	        List<FlowNode> list2=flowNodeService.judgeNum(flowNode.getNodeNum(),flowNode.getApproveProjectId());
	        boolean flag;
	        if(list1==null&&list2==null) flag=true; 
	        else flag=false;
	        System.err.println(flag);
	        if(flag){//可以添加
	        	flowNodeService.addNodes(flowNode.getApproveProjectId(),flowNode.getNodeNum(),flowNode.getNodeCaption(),flowNode.getRemark());	            
	        	return true;
	        }else
	        return false;
	    }
/*	@RequestMapping("/editNode")
	@ResponseBody
	public boolean editN(Model model,@RequestBody FlowNode fn){
		FlowNode fnn= new FlowNode();
		fnn.setApproveProjectId(fn.getApproveProjectId());
		fnn.setNodeCaption(fn.getTenderMethod());
		fnn.setRemark(fn.getRemark());
		flowNodeService.editN(fnn);
		return true;
		
	}*/
	@RequestMapping("/editNode")
	@ResponseBody
	 public Map<String,Object> updateNode(@RequestBody FlowNode flowNode){
		 System.err.println(flowNode.getId()+flowNode.getNodeNum()+flowNode.getNodeCaption()+flowNode.getRemark()+"---------------");
		Map<String,Object> map=new HashMap<>();
        if(flowNode.getNodeCaption()==null)
        	map.put("flag",false);
        else{
        	flowNodeService.updateNode(flowNode.getId(),flowNode.getNodeNum(),flowNode.getNodeCaption(),flowNode.getRemark());
            map.put("flag",true);
            System.err.println(flowNode.getId()+flowNode.getNodeNum()+flowNode.getNodeCaption()+flowNode.getRemark()+"================");
        }
        return map;
    }
	 @RequestMapping("/delNode")
	    @ResponseBody
	    public Map<String,Object> delNode(@RequestBody FlowNode flowNode){
	        Map<String,Object> map=new HashMap<>();
	        for(long id:flowNode.getIds())
	            System.err.println(id);
	        flowNodeService.delNodes(flowNode.getIds());
	        map.put("flag",true);
	        return map;
	    }

	//查询获得所有审批规则
	@RequestMapping("/rule_manager")
	public String rule_manager(Model model, long flag){
		List<ApproveLevel> al=flowService.getLevel(flag);
		List<RoleSet> rs= roleSetService.getRole();
		List<RoleSet> rss= roleSetService.getSelRole(flag);
		//System.err.println(rs.size()+"====="+rss.size());
		for (RoleSet roleSet : rss) {
			for (RoleSet roleSet1 : rs) {
				//System.err.println(roleSet.getId()+"===="+roleSet1.getId());
				if(roleSet.getId()==roleSet1.getId()){
					roleSet1.setChosen(true);
				}
			}
		}
		model.addAttribute("rs", rs);
		model.addAttribute("al", al);
		model.addAttribute("flag", flag);
		return "flow/rule_manager";
	}
	/*@RequestMapping("/addRule")
	@ResponseBody
	public ResponseJson addRule(@RequestBody ApproveLevel aa,Model model,Long flag){
		aa.setFlowNodeId(flag);
		System.out.println(flag);
		approveLevelService.addRule(aa);
		ResponseJson json = new ResponseJson();
		json.setMsg("ahhahaha");
		json.setCode(1l);
		return json;
		
	}*/
	//添加审批规则
	 @RequestMapping("/addRule")
	    @ResponseBody
	    public boolean addGuize(@RequestBody ApproveLevel approveLevel){
	        //System.out.println(approveLevel.getFlowNodeId()+""+approveLevel.getRuleCaption()+""+approveLevel.getApproveLevel());
	        boolean flag=approveLevelService.judgeName(approveLevel.getRuleCaption());
	        if(flag){//有这个名称 不能添加
	            return false;
	        }else{//没有 执行后续 添加
	        	approveLevelService.addGuize(approveLevel.getFlowNodeId(),approveLevel.getRuleCaption(),approveLevel.getApproveLevel());
	            return true;
	        }
	    }
	/*@RequestMapping("/addForm")
	public String addForm(ApproveLevel appl){
		approveLevelService.insertSelective(appl);
		return "redirect:/rule_manager?flag="+appl.getFlowNodeId();
	}*/
	//删除规则
    @RequestMapping("/delRule")
    @ResponseBody
    public Map<String,Object> delShenpi(@RequestBody ApproveLevel approveLevel){
        Map<String,Object> map=new HashMap<>();
        approveLevelService.delLevel(approveLevel.getId());
        map.put("flag",true);
        System.err.println(approveLevel.getId());
        return map;
    }
	/*@RequestMapping("/getRole")
	public String getRole(Model model){
		System.err.println("111111111");
		List<RoleSet> rs= roleSetService.getRole();
		
		model.addAttribute("rs", rs);
        System.err.println(rs);
		return "flow/rule_manager";
		
	}*/



}
