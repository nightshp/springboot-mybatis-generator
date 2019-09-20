package com.example.serviceorder.controller;

import com.example.serviceorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单信息消费者
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/getOrder")
    public String orderByMember(){
        return orderService.getMember();
    }

    @RequestMapping("/getMessage")
    public String getMessage(){
        return "订单服务";
    }


}
