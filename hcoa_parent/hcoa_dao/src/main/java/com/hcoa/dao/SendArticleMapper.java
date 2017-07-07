package com.hcoa.dao;

import com.hcoa.entity.SendArticle;
import com.hcoa.entity.SendArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SendArticleMapper {
    int countByExample(SendArticleExample example);

    int deleteByExample(SendArticleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SendArticle record);

    int insertSelective(SendArticle record);

    List<SendArticle> selectByExample(SendArticleExample example);

    SendArticle selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SendArticle record, @Param("example") SendArticleExample example);

    int updateByExample(@Param("record") SendArticle record, @Param("example") SendArticleExample example);

    int updateByPrimaryKeySelective(SendArticle record);

    int updateByPrimaryKey(SendArticle record);
}