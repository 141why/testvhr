package com.why.myvhr.controller;

import com.github.pagehelper.PageInfo;
import com.why.myvhr.beans.Salary;
import com.why.myvhr.service.SalaryService;
import com.why.myvhr.util.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *  工资账套管理
 */
@RestController
@RequestMapping("salary")
public class SalaryController {

    @Autowired private SalaryService salaryService ;

    @GetMapping("search")
    public ResultBean list(int pageNumber , int pageSize){

        PageInfo<Salary> pageinfo = salaryService.findSalaryList(pageNumber , pageSize);
        return ResultBean.success(pageinfo);
    }


    @GetMapping("all")
    public ResultBean allSalary(){
        List<Salary> list = salaryService.findAllSalary();
        return ResultBean.success(list);
    }



    /**
     *  添加新的账套
     * @param salary
     * @return
     */
    @PostMapping
    public ResultBean<String> addSalary(@RequestBody Salary salary){
        salaryService.saveSalaryInfo(salary);
        return  ResultBean.success("保存成功");
    }

    @PutMapping
    public ResultBean<String> updateSalary(@RequestBody Salary salary){
        salaryService.updateSalaryInfo(salary);
        return  ResultBean.success("更新成功");
    }

    /**
     *  根据id查询单个账套的信息
     * @param id
     * @return
     */
    @GetMapping("id/{id}")
    public ResultBean<Salary> get(@PathVariable("id") Integer id) {
        return ResultBean.success( salaryService.findSalaryById(id) );
    }
}
