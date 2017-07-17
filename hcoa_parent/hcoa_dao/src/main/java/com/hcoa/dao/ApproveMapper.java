package com.hcoa.dao;

import com.hcoa.entity.Approve;
import com.hcoa.entity.ApproveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApproveMapper {
    int countByExample(ApproveExample example);

    int deleteByExample(ApproveExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Approve record);

    int insertSelective(Approve record);

    List<Approve> selectByExampleWithBLOBs(ApproveExample example);

    List<Approve> selectByExample(ApproveExample example);

    Approve selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Approve record, @Param("example") ApproveExample example);

    int updateByExampleWithBLOBs(@Param("record") Approve record, @Param("example") ApproveExample example);

    int updateByExample(@Param("record") Approve record, @Param("example") ApproveExample example);

    int updateByPrimaryKeySelective(Approve record);

    int updateByPrimaryKeyWithBLOBs(Approve record);

    int updateByPrimaryKey(Approve record);

	List<Approve> selectAll(Long id);

	List<Approve> selectAllProcessing(Long id);
}