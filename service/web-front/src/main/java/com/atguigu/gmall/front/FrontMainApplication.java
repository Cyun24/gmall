package com.atguigu.gmall.front;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients(basePackages = "com.atguigu.gmall.feign")
@SpringCloudApplication
public class FrontMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(FrontMainApplication.class,args);
    }
}
