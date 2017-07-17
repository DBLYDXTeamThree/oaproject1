package com.hcoa.dao;

import com.hcoa.entity.SendArticleAttach;
import com.hcoa.entity.SendArticleAttachExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SendArticleAttachMapper {
    int countByExample(SendArticleAttachExample example);

    int deleteByExample(SendArticleAttachExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SendArticleAttach record);

    int insertSelective(SendArticleAttach record);

    List<SendArticleAttach> selectByExample(SendArticleAttachExample example);

    SendArticleAttach selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SendArticleAttach record, @Param("example") SendArticleAttachExample example);

    int updateByExample(@Param("record") SendArticleAttach record, @Param("example") SendArticleAttachExample example);

    int updateByPrimaryKeySelective(SendArticleAttach record);

    int updateByPrimaryKey(SendArticleAttach record);

	List<SendArticleAttach> selectFire(Long id);

	List<SendArticleAttach> selectByid(Long id);
}