package com.lghonor.springcloud.service;

import com.lghonor.springcloud.pojo.Dept;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Component
@FeignClient(value = "springcloud-provider-dept")
public interface DeptClientService {
    @GetMapping("/dept/get/{id}")
    public Dept queityById(@PathVariable("id") long id);

    @GetMapping("/dept/list")
    public List<Dept> queryAll();

    @PostMapping("/dept/add")
    public Boolean add(Dept dept);
}
