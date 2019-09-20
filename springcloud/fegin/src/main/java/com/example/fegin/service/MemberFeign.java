package com.example.fegin.service;

import com.example.fegin.fallback.MemberFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Feifn实现订单服务调用会员服务,响应超时调用fallback方法
 */
@FeignClient(value = "service-member",fallback = MemberFallback.class)
public interface MemberFeign {

    @RequestMapping("/api-member/getMembers")
    public String getMessage();
}
