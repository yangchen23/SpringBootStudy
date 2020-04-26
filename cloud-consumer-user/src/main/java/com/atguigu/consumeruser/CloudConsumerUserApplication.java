package com.atguigu.consumeruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @EnableDiscoveryClient :开启发现服务功能
 * @LoadBalanced ：使用负载均衡机制
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudConsumerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerUserApplication.class, args);
    }

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
