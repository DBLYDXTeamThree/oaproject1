package com.hcoa.dao;

import com.hcoa.entity.DeliverApprove;
import com.hcoa.entity.DeliverApproveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliverApproveMapper {
    int countByExample(DeliverApproveExample example);

    int deleteByExample(DeliverApproveExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeliverApprove record);

    int insertSelective(DeliverApprove record);

    List<DeliverApprove> selectByExample(DeliverApproveExample example);

    DeliverApprove selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeliverApprove record, @Param("example") DeliverApproveExample example);

    int updateByExample(@Param("record") DeliverApprove record, @Param("example") DeliverApproveExample example);

    int updateByPrimaryKeySelective(DeliverApprove record);

    int updateByPrimaryKey(DeliverApprove record);
}