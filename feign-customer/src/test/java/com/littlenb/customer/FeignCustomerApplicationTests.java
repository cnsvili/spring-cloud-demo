package com.littlenb.customer;

import com.alibaba.fastjson.JSON;
import com.littlenb.customer.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FeignCustomerApplicationTests {

	@Autowired
	private HelloService helloService;

	@Test
	public void contextLoads() {

		Object obj = helloService.add("abc");
		System.out.println(JSON.toJSONString(obj));
	}

}
