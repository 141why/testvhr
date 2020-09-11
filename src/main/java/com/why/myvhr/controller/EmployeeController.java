package com.why.myvhr.controller;

import com.github.pagehelper.PageInfo;
import com.why.myvhr.beans.Employee;
import com.why.myvhr.service.EmployeeSerivce;
import com.why.myvhr.util.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 *  /emp/search  --> get
 *  /emp/id/{id} --> get
 *
 *  /emp ---> POST 数据增加
 *  /emp ---> PUT  数据更新
 */
@RestController
@RequestMapping("emp")
public class EmployeeController {

    @Autowired
    private EmployeeSerivce employeeSerivce;

    /**
     * 数据的检索，拥有分页
     * @param emp
     * @param pageNumber
     * @param pageSize
     * @return
     */
    @GetMapping("search")
    public ResultBean<Employee> list(Employee emp , int pageNumber , int pageSize){
        PageInfo<Employee> pageinfo = employeeSerivce.findEmpList( emp , pageNumber , pageSize );
        System.out.println("更新一");
        System.out.println("分支");
        System.out.println("分支添加");
        System.out.println("主干添加");
        System.out.println("在线");
        return ResultBean.success(pageinfo);
    }
    /**
     *  添加雇员入职信息
     * @param emp
     * @return
     */
    @PostMapping
    public ResultBean<String> addEmp(@RequestBody Employee emp) {
        employeeSerivce.saveEmpInfo(emp);
        return ResultBean.success("雇员信息保存成功");
    }
    /**
     *  更新雇员入职信息
     * @param emp
     * @return
     */
    @PutMapping
    public ResultBean<String> updateEmp(@RequestBody Employee emp) {
        employeeSerivce.updateEmpInfo(emp);
        return ResultBean.success("雇员信息更新成功");
    }



    /**
     *  根据地址栏中的参数:id 查询雇员的信息
     * @param id
     * @return
     */
    @GetMapping("id/{id}")
    public ResultBean<Employee> empInfo(@PathVariable("id") Integer id){
        Employee emp = employeeSerivce.getEmpById(id);
        return ResultBean.success(emp);
    }
}
