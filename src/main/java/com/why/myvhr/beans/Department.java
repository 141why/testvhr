package com.why.myvhr.beans;

import java.io.Serializable;
import lombok.Data;

/**
 * department
 * @author 
 */
@Data
public class Department implements Serializable {
    private Integer id;

    /**
     * 部门名称
     */
    private String name;

    private Integer parentid;

    private String deppath;

    private Boolean enabled;

    private Boolean isparent;

    private static final long serialVersionUID = 1L;
}