package com.hcoa.dao;

import com.hcoa.entity.ApproveLevel;
import com.hcoa.entity.ApproveLevelExample;
import com.hcoa.entity.FlowNode;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApproveLevelMapper {
    int countByExample(ApproveLevelExample example);

    int deleteByExample(ApproveLevelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ApproveLevel record);

    int insertSelective(ApproveLevel record);

    List<ApproveLevel> selectByExample(ApproveLevelExample example);

    ApproveLevel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ApproveLevel record, @Param("example") ApproveLevelExample example);

    int updateByExample(@Param("record") ApproveLevel record, @Param("example") ApproveLevelExample example);

    int updateByPrimaryKeySelective(ApproveLevel record);

    int updateByPrimaryKey(ApproveLevel record);
    
    List<Long> getRoleIdByApproveLevelId(Long id);
    
    Long getIdByFlowNodeId(Long id);
    
    List<ApproveLevel> getLevel( @Param("flag") long flag);
    
    List<ApproveLevel> addRule();
    
    void delLevel(Long id);
    
    void addGuize(Long id, String name, Integer level); 
    
    boolean judgeName(String name);
    
    void updateProject(Long id,String name, String table, String content);
}