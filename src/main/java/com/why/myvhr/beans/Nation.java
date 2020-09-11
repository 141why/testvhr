package com.why.myvhr.beans;

import java.io.Serializable;
import lombok.Data;

/**
 * nation
 * @author 
 */
@Data
public class Nation implements Serializable {
    private Integer id;

    private String name;

    private static final long serialVersionUID = 1L;
}