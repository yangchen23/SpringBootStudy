package com.atguigu.user.service;

import com.atguigu.ticket.service.TickectService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author yangchen
 * @version v1.0
 * @date 2020/4/25 22:59
 */

@Service
public class UserService {

    @Reference
    TickectService tickectService;

    public void hello(){
        String ticket = tickectService.getTicket();
        System.out.println("买到票了："+ ticket);
    }

}
