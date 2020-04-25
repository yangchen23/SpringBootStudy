package com.atguigu.ticket.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author yangchen
 * @version v1.0
 * @date 2020/4/25 22:55
 */

/**
 * @Service : dubbo下的service，将服务发布出去
 */
@Component
@Service
public class TicketServiceImpl implements TickectService{

    @Override
    public String getTicket() {
        return "《厉害了，我的国》";
    }
}
