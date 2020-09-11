package com.why.myvhr.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.why.myvhr.beans.Employee;
import com.why.myvhr.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeSerivce {

    @Autowired
    private EmployeeMapper employeeMapper;


    /**
     *  雇员信息列表查询
     * @param emp
     * @param pageNumber
     * @param pageSize
     * @return
     */
    public PageInfo<Employee> findEmpList(Employee emp, int pageNumber, int pageSize) {

        PageHelper.startPage(pageNumber ,pageSize);
        List<Employee> employeeList = employeeMapper.listAll(emp);
        PageInfo<Employee> pageInfo = new PageInfo<>(employeeList);
        return pageInfo;
    }
    /**
     *  保存雇员的入职信息
     * @param emp
     */
    public void saveEmpInfo(Employee emp) {
        employeeMapper.insert(emp);
    }

    /**
     * 根据地址栏中的参数:id 查询雇员的信息
     * @param id
     * @return
     */
    public Employee getEmpById(Integer id) {
        return employeeMapper.selectByPrimaryKey(id);
    }

    /**
     * 更新雇员的入职信息
     * @param emp
     */
    public void updateEmpInfo(Employee emp) {
        employeeMapper.updateByPrimaryKeySelective(emp);
    }
}
