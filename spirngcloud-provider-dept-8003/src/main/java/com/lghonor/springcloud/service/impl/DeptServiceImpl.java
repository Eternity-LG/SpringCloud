package com.lghonor.springcloud.service.impl;

import com.lghonor.springcloud.dao.DeptDao;
import com.lghonor.springcloud.pojo.Dept;
import com.lghonor.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.add(dept);
    }

    @Override
    public Dept queruById(Long id) {
        return deptDao.queruById(id);
    }

    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
