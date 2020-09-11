package com.why.myvhr.beans;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * joblevel
 * @author 
 */
@Data
public class Joblevel implements Serializable {
    private Integer id;

    /**
     * 职称名称
     */
    private String name;

    private Object titlelevel;

    private Date createdate;

    private Boolean enabled;

    private static final long serialVersionUID = 1L;
}