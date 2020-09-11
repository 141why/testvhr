package com.why.myvhr.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.why.myvhr.beans.Salary;
import com.why.myvhr.mapper.SalaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SalaryService {

    @Autowired private SalaryMapper salaryMapper;




    public PageInfo<Salary> findSalaryList(int pageNumber, int pageSize) {
        PageHelper.startPage(pageNumber, pageSize);
        List<Salary> list = salaryMapper.listAll();
        PageInfo<Salary> pageinfo = new PageInfo<>(list);
        return pageinfo;
    }

    /**
     *  增加新的账套信息
     * @param salary
     */
    public void saveSalaryInfo(Salary salary) {

        /**
         * 数据库的时间，如果是新增数据的时候，时间没有数据来源
         * 那么不建议使用数据库的函数生成时间。
         *
         * 假设数据库是MySQL，
         *  1. 时区设置可能不同，造成时间有差别
         *  2. 操作系统可能时间有问题
         */
        salary.setCreatedate(new Date());
        salaryMapper.insert(salary);
    }

    /**
     *  更新账套修改的数据
     * @param salary
     */
    public void updateSalaryInfo(Salary salary) {
        salaryMapper.updateByPrimaryKey(salary);
    }


    /**
     *  根据id检索账套额信息
     * @param id
     * @return
     */
    public Salary findSalaryById(Integer id) {
        return salaryMapper.selectByPrimaryKey(id);
    }


    /**
     *  查找所有的账套id和nane
     * @return
     */
    public List<Salary> findAllSalary() {
        return salaryMapper.allList();
    }
}
