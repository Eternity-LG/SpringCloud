package com.lghonor.springcloud;

import com.lghonor.myrule.myRuleconfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//在微服务启动的时候就加载我们自定义的ribbo类
@RibbonClient(value = "spirnglcoud-provider-dept",configuration = myRuleconfig.class)
public class DeptConsumer_8101 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_8101.class,args);
    }
}
