package com.qiu.feign.consumer;

import com.qiu.feign.config.FeignConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Describe:
 * Created by: bobqiu
 * Date: 2018/2/5 下午2:42
 */
@FeignClient(name = "${feign.name}",fallback=ConsumerServiceFallback.class, configuration=FeignConfiguration.class)
public interface ConsumerService {
    @RequestMapping(value = "/indexs", method = {RequestMethod.GET})
    String index();
}
