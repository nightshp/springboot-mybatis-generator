package com.example.fegin.controller;

import com.example.fegin.service.MemberFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private MemberFeign memberFeign;

    @RequestMapping("/feign/getMember")
    public String getMember(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return memberFeign.getMessage();
    }
}
