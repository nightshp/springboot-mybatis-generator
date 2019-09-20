package com.example.serviceorder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 订单业务
 */
@Service
public class OrderService {

    @Autowired
    private RestTemplate restTemplate;

    public String getMember(){
        return restTemplate.getForObject("http://service-member:8888/api-member/getMembers",String.class);
    }

}
