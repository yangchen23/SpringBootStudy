package com.atguigu.consumeruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author yangchen
 * @version v1.0
 * @date 2020/4/26 21:27
 */

@RestController
public class UserController {

    @Resource
    RestTemplate restTemplate;

    @GetMapping("/buy")
    public String buyTicket(String name){
        String s = restTemplate.getForObject("http://PROVIDER-TICKET/ticket",
                String.class);
        return name+"购买了"+s;
    }

}
