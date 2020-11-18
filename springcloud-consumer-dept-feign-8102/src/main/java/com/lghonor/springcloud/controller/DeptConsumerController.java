package com.lghonor.springcloud.controller;

import com.lghonor.springcloud.pojo.Dept;
import com.lghonor.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.print.attribute.standard.PrinterURI;
import java.lang.reflect.Array;
import java.util.List;
@RestController
public class DeptConsumerController {



    //feign
    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping("/consumer/dept/add")
    public boolean addDept(Dept dept){
       return deptClientService.add(dept);
    }
    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id")long id){
       return deptClientService.queityById(id);
    }
    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return deptClientService.queryAll();
    }
}
