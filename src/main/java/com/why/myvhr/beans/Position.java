package com.why.myvhr.beans;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * position
 * @author 
 */
@Data
public class Position implements Serializable {
    private Integer id;

    /**
     * 职位
     */
    private String name;

    private Date createdate;

    private Boolean enabled;

    private static final long serialVersionUID = 1L;
}