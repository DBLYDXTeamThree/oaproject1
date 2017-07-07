package com.hcoa.dao;

import com.hcoa.entity.ApproveRole;
import com.hcoa.entity.ApproveRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApproveRoleMapper {
    int countByExample(ApproveRoleExample example);

    int deleteByExample(ApproveRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ApproveRole record);

    int insertSelective(ApproveRole record);

    List<ApproveRole> selectByExample(ApproveRoleExample example);

    ApproveRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ApproveRole record, @Param("example") ApproveRoleExample example);

    int updateByExample(@Param("record") ApproveRole record, @Param("example") ApproveRoleExample example);

    int updateByPrimaryKeySelective(ApproveRole record);

    int updateByPrimaryKey(ApproveRole record);
}