package com.qiu.feign.controller;

import com.qiu.feign.consumer.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Describe:
 * Created by: bobqiu
 * Date: 2018/2/5 下午2:49
 */
@RestController
public class FeignController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping(value = "/index")
    public String index() {
        String index = consumerService.index();
        System.out.println(index);
        return index;
    }
}

