package com.why.myvhr.mapper;

import com.why.myvhr.beans.SysRole;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysRoleMapper {

    SysRole get(Integer roleid);

    List<SysRole> allList();

}