package com.hcoa.dao;

import com.hcoa.entity.ApproveProject;
import com.hcoa.entity.ApproveProjectExample;
import com.hcoa.entity.StaffInfo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApproveProjectMapper {
    int countByExample(ApproveProjectExample example);

    int deleteByExample(ApproveProjectExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ApproveProject record);

    int insertSelective(ApproveProject record);

    List<ApproveProject> selectByExampleWithBLOBs(ApproveProjectExample example);

    List<ApproveProject> selectByExample(ApproveProjectExample example);

    ApproveProject selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ApproveProject record, @Param("example") ApproveProjectExample example);

    int updateByExampleWithBLOBs(@Param("record") ApproveProject record, @Param("example") ApproveProjectExample example);

    int updateByExample(@Param("record") ApproveProject record, @Param("example") ApproveProjectExample example);

    int updateByPrimaryKeySelective(ApproveProject record);

    int updateByPrimaryKeyWithBLOBs(ApproveProject record);

    int updateByPrimaryKey(ApproveProject record);
    
    List<ApproveProject> getFlow();

	List<ApproveProject> addPro();
	
	void editP(ApproveProject ep);
	
	List<ApproveProject> getProject();
	
    void updateProject(Long id, StaffInfo si, String tableName, String content);
}