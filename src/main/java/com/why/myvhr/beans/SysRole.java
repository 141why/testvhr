package com.why.myvhr.beans;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * sys_role
 * @author 
 */
@Data
public class SysRole implements Serializable {
    /**
     * 主键，角色的编号
     */
    private Integer roleid;

    /**
     * 角色名称
     */
    private String rolename;

    /**
     * 角色的描述
     */
    private String description;

    /**
     * 是否启用角色，默认是启用
     */
    private Boolean available;

    /**
     * 创建时间
     */
    private LocalDateTime createtime;

    /**
     * 更新时间
     */
    private LocalDateTime updatetime;

    /**
     * 一个角色对应多个资源
     */
    private List<SysResources> resources;

    private static final long serialVersionUID = 1L;
}