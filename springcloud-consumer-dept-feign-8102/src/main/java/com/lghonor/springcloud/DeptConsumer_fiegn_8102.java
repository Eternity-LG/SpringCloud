package com.lghonor.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableEurekaClient
//在微服务启动的时候就加载我们自定义的ribbo类
//@RibbonClient(value = "spirnglcoud-provider-dept",configuration = myRuleconfig.class)
@EnableFeignClients
public class DeptConsumer_fiegn_8102{
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_fiegn_8102.class,args);
    }
}


