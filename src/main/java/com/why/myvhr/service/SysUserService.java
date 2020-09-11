package com.why.myvhr.service;

import com.why.myvhr.beans.SysUser;
import com.why.myvhr.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserService {
    @Autowired
    private SysUserMapper mapper;


    public SysUser findUserByNameAndPwd(String username , String password){
        SysUser user = new SysUser();
        user.setUsername(username);
        user.setPassword(password);
        return mapper.get( user );
    }
}
