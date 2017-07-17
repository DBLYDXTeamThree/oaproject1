package com.hcoa.service;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.hcoa.dao.ApproveMapper;
import com.hcoa.dao.BuildProjectAttachMapper;
import com.hcoa.dao.BuildProjectMapper;
import com.hcoa.dao.DeliverApproveMapper;
import com.hcoa.dao.FlowNodeMapper;
import com.hcoa.dao.ProjectFlowMapper;
import com.hcoa.dao.StaffInfoMapper;
import com.hcoa.entity.Approve;
import com.hcoa.entity.ApproveExample;
import com.hcoa.entity.BuildProject;
import com.hcoa.entity.BuildProjectAttach;
import com.hcoa.entity.BuildProjectAttachExample;
import com.hcoa.entity.BuildProjectExample;
import com.hcoa.entity.DeliverApprove;
import com.hcoa.entity.DeliverApproveExample;
import com.hcoa.entity.FlowNode;
import com.hcoa.entity.FlowNodeExample;
import com.hcoa.entity.ProjectFlow;
import com.hcoa.entity.ProjectFlowExample;
import com.hcoa.entity.StaffInfo;
import com.hcoa.entity.StaffInfoExample;

@Service
public class BuildProjectServiceImpl implements BuildProjectService {

	@Autowired
	BuildProjectMapper BuildProjectmapper;
	@Autowired
	ApproveMapper Approvemapper;
	@Autowired
	StaffInfoMapper StaffInfomapper;
	@Autowired
	ProjectFlowMapper ProjectFlowmapper;
	@Autowired
	FlowNodeMapper FlowNodemapper;
	@Autowired
	DeliverApproveMapper deliverApprovemapper;
	@Autowired
	BuildProjectAttachMapper buildProjectAttachMapper;

	/**
	 * 查询全部立项
	 */
	public List<BuildProject> getBuildProject() {
		BuildProjectExample example = new BuildProjectExample();
		example.createCriteria().andIdIsNotNull();
		List<BuildProject> list = BuildProjectmapper.selectByExample(example);
		return list;
	}

	/**
	 * 查询立项详情
	 */
	public BuildProject getBuildPro(Long id) {
		BuildProject bp = BuildProjectmapper.selectByPrimaryKey(id);
		return bp;
	}

	/**
	 * 查询待办立项
	 */
	public List<Map<String, Object>> getBackLog(Long aid) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		ApproveExample e1 = new ApproveExample();
		e1.createCriteria().andApproverIdEqualTo(aid);
		e1.createCriteria().andApproveProjectIdEqualTo((long) 2);
		if (Approvemapper.selectByExample(e1) != null) {
			List<Approve> lap = Approvemapper.selectByExample(e1);
			for (int i = 0; i < lap.size(); i++) {
				if ("Processing".equals(lap.get(i).getOperationStatus())) {
					BuildProject bp = BuildProjectmapper.selectByPrimaryKey(lap.get(i).getPublicId());
					System.err.println(lap.get(i).getPublicId());
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("id", lap.get(i).getId());
					map.put("modelId", lap.get(i).getPublicId());
					map.put("caption", bp.getCaption());
					map.put("area", bp.getArea());
					map.put("build_area", bp.getBuildArea());
					map.put("floor_num", bp.getFloorNum());
					map.put("status", null);
					list.add(map);
				}

			}
			return list;
		} else {
			return null;
		}

	}

	/**
	 * 查询已办立项
	 */
	public List<Map<String, Object>> getHistory(Long aid) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		ApproveExample e1 = new ApproveExample();
		e1.createCriteria().andApproverIdEqualTo(aid);
		e1.createCriteria().andApproveProjectIdEqualTo((long) 2);
		if (Approvemapper.selectByExample(e1) != null) {
			List<Approve> lap = Approvemapper.selectByExample(e1);
			for (int i = 0; i < lap.size(); i++) {
				if ("Finished".equals(lap.get(i).getOperationStatus())) {
					BuildProject bp = BuildProjectmapper.selectByPrimaryKey(lap.get(i).getPublicId());
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("id", lap.get(i).getId());
					map.put("modelId", lap.get(i).getPublicId());
					map.put("caption", bp.getCaption());
					map.put("area", bp.getArea());
					map.put("build_area", bp.getBuildArea());
					map.put("floor_num", bp.getFloorNum());
					map.put("status", null);
					list.add(map);
				}

			}
			return list;
		} else {
			return null;
		}

	}

	/**
	 * 新建立项
	 */
	public void addBuildPro(BuildProject bp) {
		BuildProjectmapper.insertSelective(bp);

	}

	/**
	 * 根据id查询立项
	 */
	public BuildProject getBuildProById(Long aid) {
		BuildProject bp = BuildProjectmapper.selectByPrimaryKey(aid);

		return bp;
	}

	/**
	 * 根据id获得姓名
	 */
	public String getName(Long id) {
		// System.out.println(id);
		StaffInfo si = StaffInfomapper.selectByPrimaryKey(id);
		// System.out.println(si.getRealname());
		return si.getRealname();
	}

	/**
	 * 修改立项
	 */
	public void updateBuidPro(BuildProject bp) {
		BuildProjectmapper.updateByPrimaryKey(bp);

	}

	/**
	 * 立项送审
	 */
	public void deleteBuildpro(Long id) {

	}

	public void saveBuidPro(Long did, Long id, String remark) {

		// 重新送审时删除原纪录

		ApproveExample e3 = new ApproveExample();
		e3.createCriteria().andPublicIdEqualTo(id);
		Approvemapper.deleteByExample(e3);

		DeliverApproveExample e2 = new DeliverApproveExample();
		e2.createCriteria().andPublicIdEqualTo(id);
		deliverApprovemapper.deleteByExample(e2);

		ProjectFlowExample e1 = new ProjectFlowExample();
		e1.createCriteria().andPublicIdEqualTo(id);
		ProjectFlowmapper.deleteByExample(e1);

		// 查询流程中的第一个事务的 名称和id
		FlowNodeExample e4 = new FlowNodeExample();
		e4.createCriteria().andApproveProjectIdEqualTo((long) 2);
		e4.createCriteria().andNodeNumGreaterThanOrEqualTo("1");
		List<FlowNode> list = FlowNodemapper.selectByExample(e4);
		String flowpro = "66666";
		Long flowid = (long) 666;
		for (Integer i = 1; i <= list.size(); i++) {

			for (int j = 0; j < list.size(); j++) {
				if (list.get(j).getNodeNum().equals(i.toString())) {
					String flow = list.get(j).getNodeCode();
					if (BuildProjectmapper.getFlowId(id, flow) != null
							&& !"".equals(BuildProjectmapper.getFlowId(id, flow))) {
						flowpro = BuildProjectmapper.getFlowId(id, flow.toLowerCase());
						flowid = list.get(j).getId();
						break;
					}
				}
			}
			if (flowpro.equals("66666") == false)
				break;

		}
		// System.out.println(flowpro);
		// System.out.println(flowid);

		// 向project_flow表中插入数据
		ProjectFlow pf = new ProjectFlow();
		pf.setFlowNodeId(flowid);
		pf.setApproveProjectId((long) 2);
		pf.setNodeStatus("0");
		pf.setCurrentApproveLevel(1);
		pf.setCurrentCycleTime(1);
		pf.setPublicId(id);
		ProjectFlowmapper.insertSelective(pf);

		// 获得刚刚插入的数据
		ProjectFlowExample e5 = new ProjectFlowExample();
		e5.createCriteria().andFlowNodeIdEqualTo(flowid);
		e5.createCriteria().andPublicIdEqualTo(id);
		List<ProjectFlow> list0 = ProjectFlowmapper.selectByExample(e5);

		// 向deliver_approve表中插入数据
		DeliverApprove da = new DeliverApprove();
		da.setApproveProjectId((long) 2);
		da.setDeliverDatetime(new Date());
		da.setDeliverId(did);
		da.setProjectFlowId(list0.get(0).getId());
		da.setPublicId(id);
		da.setRemark(remark);
		deliverApprovemapper.insertSelective(da);

		// 获得刚刚插入的数据
		DeliverApproveExample e6 = new DeliverApproveExample();
		e6.createCriteria().andProjectFlowIdEqualTo(list0.get(0).getId());
		List<DeliverApprove> listda = deliverApprovemapper.selectByExample(e6);

		// 向approve表中插入数据
		String[] fp = flowpro.split("\\|");
		for (int i = 0; i < fp.length; i++) {
			// System.out.println("到这了吧"+Long.parseLong(fp[i]));
			Approve an = new Approve();
			an.setApproveLevel((long) 1);
			an.setApproveProjectId((long) 2);
			an.setApproverId(Long.parseLong(fp[i]));
			an.setDeliverApproveId(listda.get(0).getId());
			an.setOperationStatus("Processing");
			an.setPublicId(id);
			Approvemapper.insertSelective(an);
		}

		// 改变立项的状态
		BuildProject bpro = BuildProjectmapper.selectByPrimaryKey(id);
		bpro.setDeliverApproveFlag(1);
		BuildProjectmapper.updateByPrimaryKey(bpro);
	}

	/**
	 * 办理立项
	 */
	public void updateApprovePro(Long id, Long projectId, Long code) {
		// 同意或不同意 改变待办状态
		Approve ap1 = Approvemapper.selectByPrimaryKey(id);
		if (code == 1) {
			ap1.setOperationStatus("Finished");
		}
		if (code == 0) {
			ap1.setOperationStatus("NoPass");
		}
		Approvemapper.updateByPrimaryKey(ap1);

		// 查询立项的所有待办
		ApproveExample e1 = new ApproveExample();
		e1.createCriteria().andPublicIdEqualTo(projectId);
		e1.createCriteria().andApproveProjectIdEqualTo((long) 2);
		List<Approve> list = Approvemapper.selectByExample(e1);
		boolean flag1 = false;
		boolean flag2 = true;

		// 判断是否存在 未通过
		for (int i = 0; i < list.size(); i++) {
			if ("NoPass".equals(list.get(i).getOperationStatus())) {
				flag1 = true;
			}
		}
		// 判断是否 全部通过
		for (int i = 0; i < list.size(); i++) {
			if (!"Finished".equals(list.get(i).getOperationStatus())) {
				flag2 = false;
			}
		}
		Approve ap2 = Approvemapper.selectByPrimaryKey(id);
		DeliverApprove da1 = deliverApprovemapper.selectByPrimaryKey(ap2.getDeliverApproveId());
		ProjectFlow pf1 = ProjectFlowmapper.selectByPrimaryKey(da1.getProjectFlowId());
		// 存在未通过，重新送审
		if (flag1) {
			BuildProject bp = BuildProjectmapper.selectByPrimaryKey(projectId);
			bp.setDeliverApproveFlag(4);
			BuildProjectmapper.updateByPrimaryKey(bp);
		}

		// 全部通过 进行下一流程
		if (flag2) {
			System.out.println("到这了吗++++++++++++++++++++++++");
			pf1.setNodeStatus("1");
			ProjectFlowmapper.updateByPrimaryKey(pf1);
			FlowNode fn = FlowNodemapper.selectByPrimaryKey(pf1.getFlowNodeId());
			FlowNodeExample fne1 = new FlowNodeExample();
			fne1.createCriteria().andApproveProjectIdEqualTo((long) 2);
			fne1.createCriteria().andNodeNumGreaterThan(fn.getNodeNum());
			List<FlowNode> fnl = FlowNodemapper.selectByExample(fne1);
			String flowpro = "66666";
			Long flowid = (long) 666;
			Integer min = Integer.parseInt(fn.getNodeNum());
			Integer max = -1;
			for (int i = 0; i < fnl.size(); i++) {
				if (Integer.parseInt(fnl.get(i).getNodeNum()) > max) {
					max = Integer.parseInt(fnl.get(i).getNodeNum());
				}
			}
			System.err.println("min:" + min);
			System.err.println("max:" + max);

			for (Integer j = min + 1; j < max; j++) {
				for (int i = 0; i < fnl.size(); i++) {
					if (fnl.get(i).getNodeNum().equals(j.toString())) {
						String flow = fnl.get(i).getNodeCode();
						if (BuildProjectmapper.getFlowId(projectId, flow.toLowerCase()) != null
								&& !"".equals(BuildProjectmapper.getFlowId(projectId, flow.toLowerCase()))) {
							flowpro = BuildProjectmapper.getFlowId(projectId, flow.toLowerCase());
							flowid = fnl.get(i).getId();
							break;
						}
					}
				}
				if (flowpro.equals("66666") == false)
					break;
			}

			System.err.println(flowid);
			System.err.println(flowpro);
			if (flowid != 666) {
				System.out.println("修改流程id了吗++++++++++++++++++++++++++++++++");
				pf1.setFlowNodeId(flowid);
				ProjectFlowmapper.updateByPrimaryKey(pf1);
			}
			if ("66666".equals(flowpro)) {
				BuildProject bpn = BuildProjectmapper.selectByPrimaryKey(projectId);
				bpn.setDeliverApproveFlag(3);
				BuildProjectmapper.updateByPrimaryKey(bpn);
				System.out.println("到这就是已通过");
			} else {
				/*
				 * //向project_flow表中插入数据 ProjectFlow pf=new ProjectFlow();
				 * pf.setFlowNodeId(flowid); pf.setApproveProjectId((long)2);
				 * pf.setNodeStatus("0"); pf.setCurrentApproveLevel(1);
				 * pf.setCurrentCycleTime(1); pf.setPublicId(id);
				 * ProjectFlowmapper.insertSelective(pf);
				 * 
				 * //获得刚刚插入的数据 ProjectFlowExample e5=new ProjectFlowExample();
				 * e5.createCriteria().andFlowNodeIdEqualTo(flowid);
				 * e5.createCriteria().andPublicIdEqualTo(id); List<ProjectFlow>
				 * list0=ProjectFlowmapper.selectByExample(e5);
				 * 
				 * //向deliver_approve表中插入数据 DeliverApprove da=new
				 * DeliverApprove(); da.setApproveProjectId((long)2);
				 * da.setDeliverDatetime(new Date());
				 * da.setDeliverId(da1.getDeliverId());
				 * da.setProjectFlowId(list0.get(0).getId());
				 * da.setPublicId(id); deliverApprovemapper.insertSelective(da);
				 * 
				 * //获得刚刚插入的数据 DeliverApproveExample e6=new
				 * DeliverApproveExample();
				 * e6.createCriteria().andProjectFlowIdEqualTo(list0.get(0).
				 * getId()); List<DeliverApprove>
				 * listda=deliverApprovemapper.selectByExample(e6);
				 */
				// 向approve表中插入数据
				String[] fp = flowpro.split("\\|");
				for (int i = 0; i < fp.length; i++) {
					// System.out.println("到这了吧"+Long.parseLong(fp[i]));
					Approve an = new Approve();
					an.setApproveLevel((long) 1);
					an.setApproveProjectId((long) 2);
					an.setApproverId(Long.parseLong(fp[i]));
					an.setDeliverApproveId(da1.getId());
					an.setOperationStatus("Processing");
					an.setPublicId(projectId);
					Approvemapper.insertSelective(an);
				}

			}
		}

	}

	public List<BuildProjectAttach> getAttachsByProjectId(Long id) {
		BuildProjectAttachExample example = new BuildProjectAttachExample();
		example.createCriteria().andBuildProjectIdEqualTo(id);
		return buildProjectAttachMapper.selectByExample(example);
	}

	@Transactional
	public void upload(Long articleid, HttpServletRequest request,String filePosition) {
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());

		if (multipartResolver.isMultipart(request)) {
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;

			Iterator<String> iter = multiRequest.getFileNames();

			while (iter.hasNext()) {
				MultipartFile file = multiRequest.getFile((String) iter.next());

				if (file != null) {
					try {
						// 得到上传的文件名
						String fileName = file.getOriginalFilename();
						// 得到服务器项目发布运行所在地址
						String path1 = filePosition;
						// 此处未使用UUID来生成唯一标识,用日期做为标识
						String path = path1 + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "_"
								+ fileName;
						// 查看文件上传路径,方便查找
						System.out.println(path);
						System.err.println(fileName);
						// 把文件上传至path的路径
						File localFile = new File(path);
						
						// 赋值
						BuildProjectAttach attach = new BuildProjectAttach();
						StaffInfo staffInfo = (StaffInfo) request.getSession().getAttribute("staff");
						attach.setCreateby(staffInfo.getId());
						attach.setCreatetime(new Date());
						attach.setFileName(fileName);
						attach.setFilePath(path);
						attach.setBuildProjectId(articleid);
						// 插入数据库
						buildProjectAttachMapper.insert(attach);
						
						file.transferTo(localFile);
					} catch (IllegalStateException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

	public BuildProjectAttach selectAttachById(Long id) {
		return buildProjectAttachMapper.selectByPrimaryKey(id);
	}

	@Transactional
	public void delBuild_project_attachs(Long[] idList) {
		for(Long id:idList){
			buildProjectAttachMapper.deleteByPrimaryKey(id);
		}
	}
	
	

}
