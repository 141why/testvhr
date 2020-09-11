package com.why.myvhr.beans;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * salary
 * @author 
 */
@Data
public class Salary implements Serializable {
    private Integer id;

    /**
     * 基本工资
     */
    private Integer basicsalary;

    /**
     * 奖金
     */
    private Integer bonus;

    /**
     * 午餐补助
     */
    private Integer lunchsalary;

    /**
     * 交通补助
     */
    private Integer trafficsalary;

    /**
     * 应发工资
     */
    private Integer allsalary;

    /**
     * 养老金基数
     */
    private Integer pensionbase;

    /**
     * 养老金比率
     */
    private Double pensionper;

    /**
     * 启用时间
     */
    private Date createdate;

    /**
     * 医疗基数
     */
    private Integer medicalbase;

    /**
     * 医疗保险比率
     */
    private Double medicalper;

    /**
     * 公积金基数
     */
    private Integer accumulationfundbase;

    /**
     * 公积金比率
     */
    private Double accumulationfundper;

    private String name;

    private static final long serialVersionUID = 1L;
}