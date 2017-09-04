package com.hugui.ribbon.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hugui.ribbon.consumer.service.HelloService;

/**
 * 
 * @author hugui
 * @description HELLO 控制器 2017年8月3日
 */

@RestController
public class ConsumerController {

	@Autowired
	HelloService helloService;

	@RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
	public String helloConsumer() {
		return helloService.sayHello();
	}
	
}
