package com.hcoa.dao;

import com.hcoa.entity.ProjectFlow;
import com.hcoa.entity.ProjectFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectFlowMapper {
    int countByExample(ProjectFlowExample example);

    int deleteByExample(ProjectFlowExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProjectFlow record);

    int insertSelective(ProjectFlow record);

    List<ProjectFlow> selectByExample(ProjectFlowExample example);

    ProjectFlow selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProjectFlow record, @Param("example") ProjectFlowExample example);

    int updateByExample(@Param("record") ProjectFlow record, @Param("example") ProjectFlowExample example);

    int updateByPrimaryKeySelective(ProjectFlow record);

    int updateByPrimaryKey(ProjectFlow record);

	long getflowId(Long publicId);

	ProjectFlow selectByPublicId(Long publicId);
}