package com.hcoa.dao;

import com.hcoa.entity.BuildProject;
import com.hcoa.entity.BuildProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuildProjectMapper {
    int countByExample(BuildProjectExample example);

    int deleteByExample(BuildProjectExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BuildProject record);

    int insertSelective(BuildProject record);

    List<BuildProject> selectByExample(BuildProjectExample example);

    BuildProject selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BuildProject record, @Param("example") BuildProjectExample example);

    int updateByExample(@Param("record") BuildProject record, @Param("example") BuildProjectExample example);

    int updateByPrimaryKeySelective(BuildProject record);

    int updateByPrimaryKey(BuildProject record);
}