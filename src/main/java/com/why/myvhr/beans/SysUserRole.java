package com.why.myvhr.beans;

import java.io.Serializable;
import lombok.Data;

/**
 * sys_user_role
 * @author 
 */
@Data
public class SysUserRole implements Serializable {
    /**
     * 用户和角色的中间表的主键
     */
    private Integer urid;

    /**
     * 用户的主键
     */
    private Integer userid;

    /**
     * 角色的主键
     */
    private Integer roleid;

    private static final long serialVersionUID = 1L;
}