package com.hcoa.dao;

import com.hcoa.entity.StaffInfo;
import com.hcoa.entity.StaffInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffInfoMapper {
    int countByExample(StaffInfoExample example);

    int deleteByExample(StaffInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StaffInfo record);

    int insertSelective(StaffInfo record);

    List<StaffInfo> selectByExample(StaffInfoExample example);

    StaffInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StaffInfo record, @Param("example") StaffInfoExample example);

    int updateByExample(@Param("record") StaffInfo record, @Param("example") StaffInfoExample example);

    int updateByPrimaryKeySelective(StaffInfo record);

    int updateByPrimaryKey(StaffInfo record);
    
    StaffInfo selectByUsernameAndPassword(String username,String password);
    
    List<StaffInfo> getUserByIds(List<Long> roleIds);
}