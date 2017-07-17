package com.hcoa.dao;

import com.hcoa.entity.RoleSet;
import com.hcoa.entity.RoleSetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleSetMapper {
    int countByExample(RoleSetExample example);

    int deleteByExample(RoleSetExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RoleSet record);

    int insertSelective(RoleSet record);

    List<RoleSet> selectByExample(RoleSetExample example);

    RoleSet selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RoleSet record, @Param("example") RoleSetExample example);

    int updateByExample(@Param("record") RoleSet record, @Param("example") RoleSetExample example);

    int updateByPrimaryKeySelective(RoleSet record);

    int updateByPrimaryKey(RoleSet record);
    
     List<RoleSet> getRole();

	List<RoleSet> getRoleSel(Long flag);

	List<RoleSet> searchByRoleCaption(@Param("sea")String sea);

	/*List<RoleSet> getRole(long flag);*/

    
}