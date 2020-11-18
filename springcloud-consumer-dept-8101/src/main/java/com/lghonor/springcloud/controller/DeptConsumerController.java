package com.lghonor.springcloud.controller;

import com.lghonor.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.print.attribute.standard.PrinterURI;
import java.lang.reflect.Array;
import java.util.List;

@RestController
public class DeptConsumerController {
    

    // restemplate  供我们直接调用  注册到spring中
    @Autowired
    private RestTemplate restTemplate;
    //ribbon 我们这里的地址应该是一个变量，通过服务名来访问
    //private static final String REST_URL_PREFIX="http://localhost:8001";
    private static final String REST_URL_PREFIX="http://springcloud-provider-dept";
    @RequestMapping("/consumer/dept/add")
    public boolean addDept(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,boolean.class);

    }
    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id")long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get"+id,Dept.class);
    }
    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }
}
