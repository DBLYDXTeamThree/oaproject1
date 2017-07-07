package com.hcoa.dao;

import com.hcoa.entity.Forum;
import com.hcoa.entity.ForumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ForumMapper {
    int countByExample(ForumExample example);

    int deleteByExample(ForumExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Forum record);

    int insertSelective(Forum record);

    List<Forum> selectByExampleWithBLOBs(ForumExample example);

    List<Forum> selectByExample(ForumExample example);

    Forum selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Forum record, @Param("example") ForumExample example);

    int updateByExampleWithBLOBs(@Param("record") Forum record, @Param("example") ForumExample example);

    int updateByExample(@Param("record") Forum record, @Param("example") ForumExample example);

    int updateByPrimaryKeySelective(Forum record);

    int updateByPrimaryKeyWithBLOBs(Forum record);

    int updateByPrimaryKey(Forum record);
}