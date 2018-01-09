package com.littlenb.service.controller;

import com.littlenb.service.common.JsonModel;
import com.littlenb.service.common.JsonModelWrapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author svili
 **/
@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public JsonModel add(@RequestParam String name) {

        return JsonModelWrapper.success("hello," + name);
    }
}
