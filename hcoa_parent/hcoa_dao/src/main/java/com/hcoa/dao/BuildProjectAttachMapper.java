package com.hcoa.dao;

import com.hcoa.entity.BuildProjectAttach;
import com.hcoa.entity.BuildProjectAttachExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuildProjectAttachMapper {
    int countByExample(BuildProjectAttachExample example);

    int deleteByExample(BuildProjectAttachExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BuildProjectAttach record);

    int insertSelective(BuildProjectAttach record);

    List<BuildProjectAttach> selectByExample(BuildProjectAttachExample example);

    BuildProjectAttach selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BuildProjectAttach record, @Param("example") BuildProjectAttachExample example);

    int updateByExample(@Param("record") BuildProjectAttach record, @Param("example") BuildProjectAttachExample example);

    int updateByPrimaryKeySelective(BuildProjectAttach record);

    int updateByPrimaryKey(BuildProjectAttach record);
}