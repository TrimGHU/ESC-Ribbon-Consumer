package com.hugui.ribbon.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
@date : 2017年8月27日
@author : hugui
@description : TODO
**/

@Service
public class HelloService {

	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "hellofallback")
	public String sayHello() {
		return restTemplate.getForEntity("http://HUGUI/hello", String.class).getBody();
	}
	
	public String hellofallback(){
		return "error";
	}
	
}

