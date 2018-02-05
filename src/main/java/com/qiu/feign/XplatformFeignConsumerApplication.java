package com.qiu.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class XplatformFeignConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(XplatformFeignConsumerApplication.class, args);
    }
}
