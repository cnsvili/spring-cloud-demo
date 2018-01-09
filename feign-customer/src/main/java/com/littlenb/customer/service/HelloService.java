package com.littlenb.customer.service;

import com.littlenb.customer.common.JsonModel;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author svili
 **/
@FeignClient("hello-service")
public interface HelloService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    JsonModel add(@RequestParam("name") String name);
}
