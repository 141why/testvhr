package com.why.myvhr.beans;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * sys_user
 * @author 
 */
@Data
public class SysUser implements Serializable {
    /**
     * 主键，自动增长
     */
    private Integer userid;

    /**
     * 登录账号
     */
    private String username;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 雇员的编号
     */
    private Integer empid;

    /**
     * 雇员的姓名
     */
    private String empname;

    /**
     * 数据创建的时间
     */
    private LocalDateTime createtime;

    /**
     * 数据更新的时间
     */
    private LocalDateTime updatetime;

    /**
     * 一个用户对应多个角色
     */
    private List<SysRole> roles;

    private static final long serialVersionUID = 1L;
}