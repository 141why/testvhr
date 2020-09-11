package com.why.myvhr.beans;

import java.io.Serializable;
import lombok.Data;

/**
 * sys_role_resouces
 * @author 
 */
@Data
public class SysRoleResouces implements Serializable {
    /**
     * 角色和资源表的主键编号
     */
    private Integer id;

    /**
     * 角色的编号
     */
    private Integer roleid;

    /**
     * 资源的编号
     */
    private Integer resourceid;

    private static final long serialVersionUID = 1L;
}