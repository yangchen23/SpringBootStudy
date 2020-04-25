package com.atguigu.elastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot默认支持两种技术和ES交互
 * 1、Jest（默认不生效）
 *  需要导入jest工具包(import io.searchbox.client.JestClient;)
 * 2、SpringData ElasticSearch【ES可能不合适】
 *      如果版本不适配
 *          1）、升级SpringBoot版本
 *          2）、安装对应版本的Es
 *
 *      1）、Client 节点信息 clusterNodes；clusterName
 *      2）、ElasticsearchTemplate 操作es
 *      3）、编写一个ElasticsearchRepository的子接口来操作 Es;
 *  两种用法：https://docs.spring.io/spring-data/elasticsearch/docs/3.2.6.RELEASE/reference/html/#elasticsearch.operations.template
 *  1）、编写一个 ElasticsearchRepository
 *
 */
@SpringBootApplication
public class Springboot13ElasticApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot13ElasticApplication.class, args);
    }

}
