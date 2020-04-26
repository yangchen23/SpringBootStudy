package com.atguigu.deploy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangchen
 * @version v1.0
 * @date 2020/4/26 21:49
 */

@Controller
public class HelloController {

    @GetMapping("/abc")
    public String hello(){
        return "hello";
    }
}
