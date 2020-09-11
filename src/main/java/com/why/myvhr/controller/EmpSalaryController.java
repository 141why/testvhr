package com.why.myvhr.controller;

import com.github.pagehelper.PageInfo;
import com.why.myvhr.beans.Empsalary;
import com.why.myvhr.service.EmpSalaryService;
import com.why.myvhr.util.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("empsalary")
public class EmpSalaryController {

    @Autowired private EmpSalaryService eMpSalaryService;

    @GetMapping("search")
    public ResultBean list(int pageNumber, int pageSize){
        PageInfo<Empsalary> pageinfo = eMpSalaryService.findEmpSalaryList(pageNumber , pageSize);
        return ResultBean.success(pageinfo);
    }

    /**
     *  为了数据更新幕等性的特征， 采用 PatchMapping
     * @param empsalary
     * @return
     */
    @PatchMapping
    public ResultBean<String> update(Empsalary empsalary){
        eMpSalaryService.updateEmpSalaryByParam(empsalary);
        return ResultBean.success("更新成功");
    }
}
