package com.lghonor.springcloud.service;

import com.lghonor.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {
    public boolean add(Dept dept);
    public Dept queruById(Long id);
    public List<Dept> queryAll();
}
