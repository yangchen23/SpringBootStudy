package com.atguigu.providerticket.controller;

import com.atguigu.providerticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yangchen
 * @version v1.0
 * @date 2020/4/26 21:10
 */

@RestController
public class TicketController {

    @Resource
    TicketService ticketService;

    @GetMapping("/ticket")
    public String getTicket(){
        return ticketService.getTicket();
    }
}
