package com.why.myvhr.beans;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * sys_resources
 * @author 
 */
@Data
public class SysResources implements Serializable {
    /**
     * 资源编号
     */
    private Integer resourceid;

    /**
     * 资源的名称
     */
    private String name;

    /**
     * 请求的URL地址
     */
    private String url;

    /**
     * 请求的权限设计
     */
    private String permission;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 根据类型进行排序
     */
    private Integer sort;

    /**
     * 是否启用，默认启用
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

    private static final long serialVersionUID = 1L;
}