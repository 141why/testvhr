package com.why.myvhr.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.why.myvhr.beans.Empsalary;
import com.why.myvhr.mapper.EmpsalaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpSalaryService {

    @Autowired private EmpsalaryMapper empsalaryMapper;

    /**
     *  查询所有的数据
     * @param pageNumber
     * @param pageSize
     * @return
     */
    public PageInfo<Empsalary> findEmpSalaryList(int pageNumber, int pageSize) {
        PageHelper.startPage(pageNumber , pageSize);
        List<Empsalary> list = empsalaryMapper.listAll();
        PageInfo<Empsalary> pageinfo = new PageInfo<>(list);
        return pageinfo;
    }

    /**
     *  更新中间表数据
     * @param empsalary
     */
    public void updateEmpSalaryByParam(Empsalary empsalary) {
        empsalaryMapper.updateByPrimaryKey(empsalary);
    }
}
