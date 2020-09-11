package com.why.myvhr.mapper;

import com.why.myvhr.beans.SysRoleResouces;

public interface SysRoleResoucesMappeer {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleResouces record);

    int insertSelective(SysRoleResouces record);

    SysRoleResouces selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRoleResouces record);

    int updateByPrimaryKey(SysRoleResouces record);
}