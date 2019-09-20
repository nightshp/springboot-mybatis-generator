package com.example.fegin.fallback;

import com.example.fegin.service.MemberFeign;
import org.springframework.stereotype.Component;

/**
 *hystrix实现服务降级
 */
@Component
public class MemberFallback implements MemberFeign {
    @Override
    public String getMessage() {
        return "服务降级";
    }
}
