package com.hcoa.dao;

import com.hcoa.entity.NoticesAttach;
import com.hcoa.entity.NoticesAttachExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoticesAttachMapper {
    int countByExample(NoticesAttachExample example);

    int deleteByExample(NoticesAttachExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NoticesAttach record);

    int insertSelective(NoticesAttach record);

    List<NoticesAttach> selectByExample(NoticesAttachExample example);

    NoticesAttach selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NoticesAttach record, @Param("example") NoticesAttachExample example);

    int updateByExample(@Param("record") NoticesAttach record, @Param("example") NoticesAttachExample example);

    int updateByPrimaryKeySelective(NoticesAttach record);

    int updateByPrimaryKey(NoticesAttach record);
}