package com.atguigu.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、引入dubbo和zkclient相关依赖
 * 2、配置dubbo的注册中心地址
 * 3、使用@Service引用服务
 */
@SpringBootApplication
public class DubboConsumerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerUserApplication.class, args);
    }

}
