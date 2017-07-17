package com.hcoa.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.hcoa.entity.BuildProject;
import com.hcoa.entity.BuildProjectAttach;

public interface BuildProjectService {

	List<BuildProject> getBuildProject();
	BuildProject getBuildPro(Long id);
	List<Map<String,Object>> getBackLog(Long aid);
	void addBuildPro(BuildProject bp);
	BuildProject getBuildProById(Long aid);
	String getName(Long id);
	void updateBuidPro(BuildProject bp);
	void saveBuidPro(Long did,Long id,String remark);
	void deleteBuildpro(Long id);
	void updateApprovePro(Long id,Long projectId,Long code);
	List<Map<String,Object>> getHistory(Long aid);
	public List<BuildProjectAttach> getAttachsByProjectId(Long id);
	void upload(Long articleid, HttpServletRequest request, String filePosition);
	BuildProjectAttach selectAttachById(Long id);
	void delBuild_project_attachs(Long[] idList);
}
