package com.springboot.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="spring-eureka-client",fallback=HelloServiceClientFallback.class)
public interface HelloServiceClient {
	@RequestMapping("/hello")
    String hello();
 
	@RequestMapping("/hello1")
    String hello(@RequestParam("name") String name);  //参数注解内的值必须填，feign会报错
 
	@RequestMapping("/hello2")  //参数注解内的值必须填，feign会报错
    String hello(@RequestHeader("name") String name,@RequestHeader("age") Integer age);
}
