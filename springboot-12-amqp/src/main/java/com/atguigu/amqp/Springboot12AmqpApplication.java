package com.atguigu.amqp;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 自动配置
 * 1、RabbitAutoConfiguration
 * 2、有配置了自动连接工厂CachingConnectionFactory
 * 3、RabbitProperties 封装了 RabbitMQ的配置
 * 4、RabbitTemplate；给RabbitMq发送和接收消息；
 * 5、AmqpAdmin：RabbitMq系统管理功能组件;
 *      AmqpAdmin：创建和删除 Queue，Exchange，Binding
 * 6、@EnableRabbit + @RabbitListener 监听消息队列的内容
 *
 */

/**
 * @EnableRabbit 开启基于注解的RabbitMq模式
 */
@EnableRabbit
@SpringBootApplication
public class Springboot12AmqpApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot12AmqpApplication.class, args);
    }

}
