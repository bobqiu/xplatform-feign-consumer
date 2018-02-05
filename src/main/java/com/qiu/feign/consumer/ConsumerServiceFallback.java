package com.qiu.feign.consumer;

import org.springframework.stereotype.Component;

/**
 * Describe:
 * Created by: bobqiu
 * Date: 2018/2/5 下午2:43
 */
@Component
public class ConsumerServiceFallback implements ConsumerService {
    public String index() {
        return "feign客户端访问失败";
    }
}
