package com.atguihgu.springboot.controller;

import com.atguigu.starte.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
//@RestControllor相当于 @Controller+@ResponseBody(将类里面的每个方法都将json/xml返回数据加返回到前台页面中。)
public class HelloController {

    @Autowired
    HelloService helloService;

    //@ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return helloService.sayHelloAtguigu("haha");
    }
}
