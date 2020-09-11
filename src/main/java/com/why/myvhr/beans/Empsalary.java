package com.why.myvhr.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * empsalary
 * @author 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empsalary implements Serializable {
    private Integer id;
    private Integer empid;
    private Integer workid;
    private String name;
    private String email;
    private String phone;
    private String deptname;
    private Integer salaryid;
    private String salaryname;

}