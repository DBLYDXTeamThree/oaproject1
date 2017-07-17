package com.hcoa.controller;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hcoa.entity.BuildProject;
import com.hcoa.entity.BuildProjectAttach;
import com.hcoa.entity.StaffInfo;
import com.hcoa.service.BuildProjectService;
import com.hcoa.utils.ResponseJson;

@Controller
@RequestMapping("/")
public class BuildProjectController {
	@Value("${FilePosition}")
	String filePosition;

	@Autowired
	BuildProjectService BuildProjectservice;

	@RequestMapping("/getBuild_projects")
	public String getBuildPro(Model model) {
		List<BuildProject> list = BuildProjectservice.getBuildProject();
		model.addAttribute("build_projectlist", list);
		return "build/build_project";
	}

	@RequestMapping("/getBuild_projectById")
	public String getBuild_projectById(Long id, Model model, HttpServletRequest request) {
		BuildProject bp = BuildProjectservice.getBuildProById(id);
		// System.out.println(bp.getEnvCheck());
		// System.out.println(gy(bp.getEnvCheck()));
		request.setAttribute("name1", gy(bp.getEnvCheck()));
		request.setAttribute("name2", gy(bp.getBuildPro()));
		request.setAttribute("name3", gy(bp.getKeepEng()));
		request.setAttribute("name4", gy(bp.getShouldResearch()));
		request.setAttribute("name5", gy(bp.getFirstDesign()));
		request.setAttribute("name6", gy(bp.getChooseFiles()));
		request.setAttribute("name7", gy(bp.getAreaPlanAgree()));
		request.setAttribute("name8", gy(bp.getAreaAgree()));
		request.setAttribute("name9", gy(bp.getBuildProjectAgree()));
		request.setAttribute("name10", gy(bp.getKickOffAgree()));
		model.addAttribute("build_project", bp);
		return "build/detail_build_project";
	}

	@RequestMapping("/addbuild_project")
	public String addbuildProject() {

		return "build/addbuild_project";
	}

	@RequestMapping("/addBuild_project")
	public String addBuildProject(BuildProject bp, HttpSession session) {

		if (bp.getCaption() == null) {
			return "build/addbuild_project";
		} else {
			StaffInfo staff = (StaffInfo) session.getAttribute("staff");
			bp.setCreateby(staff.getId());
			bp.setCreatetime(new Date());
			BuildProjectservice.addBuildPro(bp);
			return "redirect:getBuild_projects";
		}

	}

	@RequestMapping("/updateBuild_project")
	public String updateBuildProject(BuildProject bp) {
		System.err.println("修改的id为：+++" + bp.getId());
		BuildProjectservice.updateBuidPro(bp);
		return "redirect:getBuild_projects";

	}

	@RequestMapping("/sendBuild")
	@ResponseBody
	public ResponseJson sendBuild(Long buildid, String remark, HttpSession session, Model model) {
		StaffInfo staff = (StaffInfo) session.getAttribute("staff");
		// BuildProjectservice.deleteBuildpro(buildid);
		BuildProjectservice.saveBuidPro(staff.getId(), buildid, remark);
		List<BuildProject> list = BuildProjectservice.getBuildProject();
		ResponseJson json = new ResponseJson();
		json.setCode(3l);
		json.setMsg("送审成功");
		return json;
	}

	@RequestMapping("/backlog_manager")
	public String backLogmManager(HttpSession session, Model model) {
		StaffInfo staff = (StaffInfo) session.getAttribute("staff");
		// System.err.println(staff.getId());
		List<Map<String, Object>> list = BuildProjectservice.getBackLog(staff.getId());
		model.addAttribute("backLogList", list);
		return "build/backlog_manager";
	}

	@RequestMapping("/getProjectBackLogList")
	@ResponseBody
	public ResponseJson getProjectBackLogList(HttpSession session, Model model) {
		StaffInfo staff = (StaffInfo) session.getAttribute("staff");
		// System.err.println(staff.getId());
		List<Map<String, Object>> list = BuildProjectservice.getBackLog(staff.getId());
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("backLogList", list);
		map.put("backLogList", list);
		ResponseJson json = new ResponseJson();
		json.setMsg("获取待办事项列表失败");
		json.setCode((long) 1);
		json.setDatas(map);
		return json;
	}

	@RequestMapping("/doApprove4Project")
	@ResponseBody
	public ResponseJson doApprove4Project(Long code, Long id, Long projectId) {

		BuildProjectservice.updateApprovePro(id, projectId, code);
		ResponseJson json = new ResponseJson();
		json.setMsg("审批成功");
		json.setCode(1l);
		return json;
	}

	@RequestMapping("/getProjectHistoryList")
	@ResponseBody
	public ResponseJson getProjectHistoryList(HttpSession session, Model model) {
		StaffInfo staff = (StaffInfo) session.getAttribute("staff");
		// System.err.println(staff.getId());
		List<Map<String, Object>> list = BuildProjectservice.getHistory(staff.getId());
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("backLogList", list);
		map.put("backLogList", list);
		ResponseJson json = new ResponseJson();
		json.setMsg("获取已办事项列表失败");
		json.setCode((long) 1);
		json.setDatas(map);
		return json;
	}

	@RequestMapping("/history_manager")
	public String historyManage(HttpSession session, Model model) {
		StaffInfo staff = (StaffInfo) session.getAttribute("staff");
		List<Map<String, Object>> list = BuildProjectservice.getBackLog(staff.getId());
		model.addAttribute("backLogList", list);
		return "build/history_manager";
	}

	public String gy(String str) {
		String name = "";
		String name1 = "";
		System.out.println(str);
		if (!"".equals(str) && str != null) {

			String[] s1arr = str.split("\\|");
			for (int i = 0; i < s1arr.length; i++) {

				long id1 = Integer.parseInt(s1arr[i]);
				// System.out.println(BuildProjectservice.getName(id1));
				name += BuildProjectservice.getName(id1) + "|";
			}
			name1 = name.substring(0, name.length() - 1);

			// System.out.println(name1);
		}
		return name1;
	}

	@RequestMapping("/loadBuildProjectList")
	@ResponseBody
	public ResponseJson loadBuildProjectList(Long build_project_id) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<BuildProjectAttach> list = BuildProjectservice.getAttachsByProjectId(build_project_id);
		map.put("build_project_attachList", list);
		ResponseJson json = new ResponseJson();
		json.setDatas(map);
		json.setCode(1l);
		return json;
	}

	/**
	 * 文件上传
	 * 
	 * @param request
	 * @param articleid
	 * @return
	 */
	@RequestMapping("/buildupload")
	@ResponseBody
	public ResponseJson upload(HttpServletRequest request, @RequestParam("build_projectlist_id") Long articleid) {
		System.out.println("upload");
		System.out.println(articleid);

		BuildProjectservice.upload(articleid, request,filePosition);

		Map<String, Object> map = new HashMap<String, Object>();
		List<BuildProjectAttach> list = BuildProjectservice.getAttachsByProjectId(articleid);
		map.put("build_project_attachList", list);
		ResponseJson json = new ResponseJson();
		json.setDatas(map);
		json.setCode(1l);
		return json;
	}

	/**
	 * 删除附件
	 * 
	 * action: delBuildAttachs
	 */
	@RequestMapping(value = "/delBuildAttachs", method = RequestMethod.POST)
	@ResponseBody
	public ResponseJson delBuildAttachs(@RequestParam("idList[]") Long[] idList) {
		System.out.println("delBuildAttachs");
		BuildProjectAttach attach = BuildProjectservice.selectAttachById(idList[0]);
		
		BuildProjectservice.delBuild_project_attachs(idList);

		Map<String, Object> map = new HashMap<String, Object>();
		List<BuildProjectAttach> list = BuildProjectservice.getAttachsByProjectId(attach.getBuildProjectId());
		map.put("build_project_attachList", list);
		ResponseJson json = new ResponseJson();
		json.setDatas(map);
		json.setCode(1l);
		return json;
	}
	
	/**
	 * 下载
	 * @param attachid
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/builddownload")
	public ResponseEntity<byte[]> download(@RequestParam("build_projectlist_id") Long attachid) throws Exception{
		BuildProjectAttach attach = BuildProjectservice.selectAttachById(attachid);
		File file = new File(attach.getFilePath());
		HttpHeaders headers = new HttpHeaders();
		String filename = new String(attach.getFileName().getBytes("UTF-8"),"iso-8859-1");
		headers.setContentDispositionFormData("attachment", filename);
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers,HttpStatus.CREATED);
	}
}
