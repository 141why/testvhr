package com.why.myvhr.mapper;

import com.why.myvhr.beans.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserMapper {
    /**
     * 通过账号和密码查询用户信息
     * @param user
     * @return
     */
    SysUser get(SysUser user);
}