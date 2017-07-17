package com.hcoa.service;

import java.util.List;

import com.hcoa.entity.ApproveProject;
import com.hcoa.entity.StaffInfo;

public interface ApproveService {
	 
	
	void addPro(ApproveProject ap);

	/*void editP(ApproveProject ep);*/

	/*void delP(ApproveProject dp);*/

	List<ApproveProject> getProject();



	void delProjects(Long[] ids);

	boolean judgeLiucheng(String caption, String tableName);

	void addPro(String caption, String tableName, String content, String tableName2);

	void updateProject(long id, String name, String tableName, String content);

}