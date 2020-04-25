package com.atguigu.cache.controller;

import com.atguigu.cache.bean.Department;
import com.atguigu.cache.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangchen
 * @version v1.0
 * @date 2020/4/19 22:42
 */

@RestController
public class DeptController {

    @Autowired
    DeptService deptService;

    @GetMapping("/dept/{id}")
    public Department getDept(@PathVariable("id") Integer id){
        Department department = deptService.getDeptById(id);
        return department;
    }

}
