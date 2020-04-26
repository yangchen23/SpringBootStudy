package com.atguigu.providerticket.service;

import org.springframework.stereotype.Service;

/**
 * @author yangchen
 * @version v1.0
 * @date 2020/4/26 21:09
 */

@Service
public class TicketService {

    public String getTicket(){
        System.out.println("8002");
        return "《厉害了，我的国》";
    }

}
