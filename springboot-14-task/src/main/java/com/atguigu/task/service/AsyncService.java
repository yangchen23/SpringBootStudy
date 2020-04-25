package com.atguigu.task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author yangchen
 * @version v1.0
 * @date 2020/4/22 23:46
 */

@Service
public class AsyncService {

    /**
     * @Async 告诉Spring 这是一个异步方法
     */
    @Async
    public void hello(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("处理数据中...");
    }

}
