package com.lghonor.springcloud.controller;

import com.lghonor.springcloud.pojo.Dept;
import com.lghonor.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;
    //获取一些配置信息，得到一些微服务
    @Autowired
    private DiscoveryClient client;
    @RequestMapping("/dept/add")
    public boolean add(Dept dept){
        return deptService.add(dept);
    }
    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable long id){
        return deptService.queruById(id);
    }
    @GetMapping("/dept/list")
    public List<Dept> queryAll(){
        return deptService.queryAll();
    }
    //注册进来的微服务  获取一些信息
    @RequestMapping("/dept/discovery")
    public  Object discover(){
        //获取微服务列表清单
        List<String> services = client.getServices();
        System.out.println("discover=>services:"+services);
        //得到一个具体的微服务信息
        List<ServiceInstance> instances = client.getInstances("springcloud-provider-dept");
        for (ServiceInstance instance : instances) {
            System.out.println(
                    instance.getInstanceId()+"\t"+
            instance.getHost()+"\t"+
            instance.getUri()+"\t"+
            instance.getServiceId()
            );
        }
        return this.client;
    }

}
