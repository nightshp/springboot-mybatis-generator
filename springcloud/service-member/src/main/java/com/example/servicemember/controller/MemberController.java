package com.example.servicemember.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 会员服务提供者
 */
@RestController
public class MemberController {

    @RequestMapping("/api-member/getMembers")
    public String memberInfos(){
        return "这是会员信息";
    }

}
