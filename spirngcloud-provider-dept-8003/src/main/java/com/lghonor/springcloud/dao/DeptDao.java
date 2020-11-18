package com.lghonor.springcloud.dao;

import com.lghonor.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface DeptDao {
        public boolean add(Dept dept);
        public Dept queruById(Long id);
        public List<Dept> queryAll();
}
