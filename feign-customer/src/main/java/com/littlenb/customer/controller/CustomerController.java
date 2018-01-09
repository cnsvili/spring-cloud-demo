package com.littlenb.customer.controller;

import com.littlenb.customer.common.JsonModel;
import com.littlenb.customer.common.JsonModelWrapper;
import com.littlenb.customer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author svili
 **/
@RestController
public class CustomerController {

    @Autowired
    HelloService helloService;


    @RequestMapping(value="/customer",method = RequestMethod.GET)
    public Object consumer() {
        return helloService.add("abc");
    }

    @RequestMapping(value="/test",method = RequestMethod.GET)
    public JsonModel test() {

        return JsonModelWrapper.success();
    }

}
