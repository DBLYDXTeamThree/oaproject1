package com.hcoa.dao;

import com.hcoa.entity.FlowNode;
import com.hcoa.entity.FlowNodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlowNodeMapper {
	int countByExample(FlowNodeExample example);

	int deleteByExample(FlowNodeExample example);

	int deleteByPrimaryKey(Long id);

	int insert(FlowNode record);

	int insertSelective(FlowNode record);

	List<FlowNode> selectByExampleWithBLOBs(FlowNodeExample example);

	List<FlowNode> selectByExample(FlowNodeExample example);

	FlowNode selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") FlowNode record, @Param("example") FlowNodeExample example);

	int updateByExampleWithBLOBs(@Param("record") FlowNode record, @Param("example") FlowNodeExample example);

	int updateByExample(@Param("record") FlowNode record, @Param("example") FlowNodeExample example);

	int updateByPrimaryKeySelective(FlowNode record);

	int updateByPrimaryKeyWithBLOBs(FlowNode record);

	int updateByPrimaryKey(FlowNode record);

	List<FlowNode> getFlowNodeByProjectId(Long projuectId);

	FlowNode getOneArt(String nodenum);

	List<FlowNode> getNode(@Param("id") long id);

	List<FlowNode> addNode();

	void editN(FlowNode fn);

	void delNodes(Long[] ids);

	void updateNode(Long id, String num, String caption, String remark);

}