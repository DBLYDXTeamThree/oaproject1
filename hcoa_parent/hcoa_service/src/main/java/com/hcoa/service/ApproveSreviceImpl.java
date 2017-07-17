package com.hcoa.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcoa.dao.ApproveLevelMapper;
import com.hcoa.dao.ApproveProjectMapper;
import com.hcoa.dao.DepartmentMapper;
import com.hcoa.dao.FlowNodeMapper;
import com.hcoa.dao.StaffInfoMapper;
import com.hcoa.entity.ApproveLevel;
import com.hcoa.entity.ApproveLevelExample;
import com.hcoa.entity.ApproveProject;
import com.hcoa.entity.ApproveProjectExample;
import com.hcoa.entity.Department;
import com.hcoa.entity.DepartmentExample;
import com.hcoa.entity.FlowNode;
import com.hcoa.entity.FlowNodeExample;
import com.hcoa.entity.StaffInfo;
import com.hcoa.entity.StaffInfoExample;

@Service
public class ApproveSreviceImpl implements ApproveService {

	@Autowired
	StaffInfoMapper staffInfoMapper;
	@Autowired
	ApproveProjectMapper approveProjectMapper;
	@Autowired
	FlowNodeMapper flowNodeMapper;
	@Autowired
	ApproveLevelMapper approveLevelMapper;
	@Autowired
	DepartmentMapper departmentMapper;
	@Transactional
	public void addPro(ApproveProject ap) {
		approveProjectMapper.insertSelective(ap);
		
	}
	@Transactional
	public void editP(ApproveProject ep) {
		approveProjectMapper.updateByPrimaryKeySelective(ep);
		
	}

	public List<ApproveProject> getProject() {
		return approveProjectMapper.getProject();
	}
	
	@Transactional
	public void updateProject(long id,String name, String table, String content) {
        ApproveProject approveProject=new ApproveProject();
        approveProject.setId(id); approveProject.setTableName(table); approveProject.setCaption(name); approveProject.setContent(content);
        approveProjectMapper.updateByPrimaryKeySelective(approveProject);
    }
	


	@Transactional
	public void delProjects(Long[] ids) {
		for(long id:ids){
            ApproveProject aP=new ApproveProject();
            FlowNode f=new FlowNode();
            ApproveLevel aL=new ApproveLevel();

            FlowNodeExample e=new FlowNodeExample();
            e.createCriteria().andApproveProjectIdEqualTo(id);
            if(flowNodeMapper.selectByExample(e)!=null&&flowNodeMapper.selectByExample(e).size()>0){
                long id2=flowNodeMapper.selectByExample(e).get(0).getId();//先删关联的表
                ApproveLevelExample e1=new ApproveLevelExample();
                e1.createCriteria().andFlowNodeIdEqualTo(id2);
                if(approveLevelMapper.selectByExample(e1)!=null&&approveLevelMapper.selectByExample(e1).size()>0){
                    long id3=approveLevelMapper.selectByExample(e1).get(0).getId();//关联的表
                    approveLevelMapper.deleteByPrimaryKey(id3);//删除
                }

                flowNodeMapper.deleteByPrimaryKey(id2);
            }
            approveProjectMapper.deleteByPrimaryKey(id);

        }
		
	}

	 public boolean judgeLiucheng(String caption,String name) {//name是自己加的字段发起人的名字
	        ApproveProjectExample example=new ApproveProjectExample();
	        example.createCriteria().andCaptionEqualTo(caption);
	        List<ApproveProject> list=approveProjectMapper.selectByExample(example);
	        StaffInfoExample example1=new StaffInfoExample();
	        example1.createCriteria().andRealnameEqualTo(name);
	        List<StaffInfo> list1=staffInfoMapper.selectByExample(example1);
	         if(list!=null&&list.size()>0||(list1==null||list1.size()==0)){//如果存在这个项目名称或者有发起人名 返回true 否则false
	            return  true;
	        }
	        return false;
	    }

	 @Transactional
	 public void addPro(String caption, String cname,String content,String name) {
	        ApproveProject approveProject=new ApproveProject();
	        Date date=new Date();
	        StaffInfoExample example1=new StaffInfoExample();
	        example1.createCriteria().andRealnameEqualTo(cname);//获取发起人id
	        List<StaffInfo> list=staffInfoMapper.selectByExample(example1);
	        long cid=list.get(0).getId();//createid
	        long did=list.get(0).getDepartmentId();
	        DepartmentExample example2=new DepartmentExample();
	        example2.createCriteria().andIdEqualTo(did);//获取部门id
	        List<Department> list2=departmentMapper.selectByExample(example2);
	        String name2=list2.get(0).getDepartmentCaption();
	        approveProject.setCreatetime(date);
	        approveProject.setTableName(name);
	        approveProject.setCreateby(cid);
	        approveProject.setCaption(caption);
	        approveProject.setCreateDept(did);
	        if(content!=null)
	            approveProject.setContent(content);

	        approveProjectMapper.insertSelective(approveProject);
	    }


}



